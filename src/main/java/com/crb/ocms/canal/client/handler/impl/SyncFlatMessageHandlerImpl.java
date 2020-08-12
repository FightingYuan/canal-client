package com.crb.ocms.canal.client.handler.impl;

import com.alibaba.otter.canal.protocol.FlatMessage;
import com.crb.ocms.canal.client.handler.AbstractFlatMessageHandler;
import com.crb.ocms.canal.client.handler.EntryHandler;
import com.crb.ocms.canal.client.handler.RowDataHandler;


import java.util.List;
import java.util.Map;

/**
 * @author jiwei
 * @date 2020-08-12
 */
public class SyncFlatMessageHandlerImpl extends AbstractFlatMessageHandler {



    public SyncFlatMessageHandlerImpl(List<? extends EntryHandler> entryHandlers, RowDataHandler<List<Map<String, String>>> rowDataHandler) {
        super(entryHandlers, rowDataHandler);
    }

    @Override
    public void handleMessage(FlatMessage flatMessage) {
        super.handleMessage(flatMessage);
    }
}
