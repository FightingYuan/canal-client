package com.crb.ocms.canal.client.handler.impl;

import com.alibaba.otter.canal.protocol.CanalEntry;
import com.alibaba.otter.canal.protocol.Message;
import com.crb.ocms.canal.client.handler.AbstractMessageHandler;
import com.crb.ocms.canal.client.handler.EntryHandler;
import com.crb.ocms.canal.client.handler.RowDataHandler;


import java.util.List;
import java.util.concurrent.ExecutorService;

/**
 * @author jiwei
 * @date 2020-08-12
 */
public class AsyncMessageHandlerImpl extends AbstractMessageHandler {


    private ExecutorService executor;


    public AsyncMessageHandlerImpl(List<? extends EntryHandler> entryHandlers, RowDataHandler<CanalEntry.RowData> rowDataHandler, ExecutorService executor) {
        super(entryHandlers, rowDataHandler);
        this.executor = executor;
    }

    @Override
    public void handleMessage(Message message) {
        executor.execute(() -> super.handleMessage(message));
    }
}
