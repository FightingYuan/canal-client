package com.crb.ocms.canal.client.util;



import com.crb.ocms.canal.client.handler.EntryHandler;

import javax.persistence.Table;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author jiwei
 * @date 2020-08-12
 */
public class GenericUtil {


    private static Map<Class<? extends EntryHandler>, Class> cache = new ConcurrentHashMap<>();


    static String getTableGenericProperties(EntryHandler entryHandler) {
        Class<?> tableClass = getTableClass(entryHandler);
        if (tableClass != null) {
            Table annotation = tableClass.getAnnotation(Table.class);
            if (annotation != null) {
                return annotation.name();
            }
        }
        return null;
    }


    @SuppressWarnings("unchecked")
    public static <T> Class<T> getTableClass(EntryHandler object) {
        Class<? extends EntryHandler> handlerClass = object.getClass();
        Class tableClass = cache.get(handlerClass);
        if (tableClass == null) {
            Type[] interfacesTypes = handlerClass.getGenericInterfaces();
            for (Type t : interfacesTypes) {
                Class c = (Class) ((ParameterizedType) t).getRawType();
                if (c.equals(EntryHandler.class)) {
                    tableClass = (Class<T>) ((ParameterizedType) t).getActualTypeArguments()[0];
                    cache.putIfAbsent(handlerClass, tableClass);
                    return tableClass;
                }
            }
        }
        return tableClass;
    }


}
