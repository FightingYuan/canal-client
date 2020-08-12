package com.crb.ocms.canal.client.handler;

import com.alibaba.otter.canal.protocol.CanalEntry;

/**
 * @author jiwei
 * @date 2020-08-12
 */
public interface RowDataHandler<T> {


    <R> void handlerRowData(T t, EntryHandler<R> entryHandler, CanalEntry.EventType eventType) throws Exception;
}
