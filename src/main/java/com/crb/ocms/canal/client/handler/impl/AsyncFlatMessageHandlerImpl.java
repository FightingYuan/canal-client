package com.crb.ocms.canal.client.handler.impl;

import com.alibaba.otter.canal.protocol.FlatMessage;
import com.crb.ocms.canal.client.handler.AbstractFlatMessageHandler;
import com.crb.ocms.canal.client.handler.EntryHandler;
import com.crb.ocms.canal.client.handler.RowDataHandler;


import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
/**
 * @author jiwei
 * @date 2020-08-12
 */
public class AsyncFlatMessageHandlerImpl extends AbstractFlatMessageHandler {


    private ExecutorService executor;


    public AsyncFlatMessageHandlerImpl(List<? extends EntryHandler> entryHandlers, RowDataHandler<List<Map<String, String>>> rowDataHandler, ExecutorService executor) {
        super(entryHandlers, rowDataHandler);
        this.executor = executor;
    }

    @Override
    public void handleMessage(FlatMessage flatMessage) {
        executor.execute(() -> super.handleMessage(flatMessage));
    }
}
