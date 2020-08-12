package com.crb.ocms.canal.client.factory;



import com.crb.ocms.canal.client.handler.EntryHandler;

import java.util.Set;

/**
 * @author ji wei
 * @date 2020-08-12
 */
public interface IModelFactory<T> {


    <R> R newInstance(EntryHandler entryHandler, T t) throws Exception;


    default <R> R newInstance(EntryHandler entryHandler, T t, Set<String> updateColumn) throws Exception {
        return null;
    }
}
