package com.crb.ocms.canal.client.handler.impl;

import com.alibaba.otter.canal.protocol.CanalEntry;
import com.alibaba.otter.canal.protocol.Message;
import com.crb.ocms.canal.client.handler.AbstractMessageHandler;
import com.crb.ocms.canal.client.handler.EntryHandler;
import com.crb.ocms.canal.client.handler.RowDataHandler;


import java.util.List;

/**
 * @author jiwei
 * @date 2020-08-12
 */
public class SyncMessageHandlerImpl extends AbstractMessageHandler {


    public SyncMessageHandlerImpl(List<? extends EntryHandler> entryHandlers, RowDataHandler<CanalEntry.RowData> rowDataHandler) {
        super(entryHandlers, rowDataHandler);
    }

    @Override
    public void handleMessage(Message message) {
        super.handleMessage(message);
    }


}
