package com.crb.ocms.canal.client.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jiwei
 * @date 2020-08-12
 */
public class CanalThreadUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {


    private Logger logger = LoggerFactory.getLogger(CanalThreadUncaughtExceptionHandler.class);

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        logger.error("thread "+ t.getName()+" have a exception",e);
    }
}
