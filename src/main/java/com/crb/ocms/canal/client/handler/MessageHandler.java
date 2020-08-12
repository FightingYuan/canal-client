package com.crb.ocms.canal.client.handler;

/**
 * @author jiwei
 * @date 2020-08-12
 */
public interface MessageHandler<T> {



    void handleMessage(T t);
}

