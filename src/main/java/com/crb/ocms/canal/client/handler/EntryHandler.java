package com.crb.ocms.canal.client.handler;

/**
 * @author jiwei
 * @date 2020-08-12
 */
public interface EntryHandler<T> {



    default void insert(T t) {

    }


    default void update(T before, T after) {

    }


    default void delete(T t) {

    }
}
