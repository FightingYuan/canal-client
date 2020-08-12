package com.crb.ocms.canal.client.factory;


import com.crb.ocms.canal.client.enums.TableNameEnum;
import com.crb.ocms.canal.client.handler.EntryHandler;
import com.crb.ocms.canal.client.util.GenericUtil;
import com.crb.ocms.canal.client.util.HandlerUtil;


/**
 * @author jiwei
 * @date 2020-08-12
 */
public abstract class AbstractModelFactory<T> implements IModelFactory<T> {


    @Override
    public <R> R newInstance(EntryHandler entryHandler, T t) throws Exception {
        String canalTableName = HandlerUtil.getCanalTableName(entryHandler);
        if (TableNameEnum.ALL.name().toLowerCase().equals(canalTableName)) {
            return (R) t;
        }
        Class<R> tableClass = GenericUtil.getTableClass(entryHandler);
        if (tableClass != null) {
            return newInstance(tableClass, t);
        }
        return null;
    }


    abstract <R> R newInstance(Class<R> c, T t) throws Exception;
}
