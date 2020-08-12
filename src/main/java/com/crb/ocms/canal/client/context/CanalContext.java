package com.crb.ocms.canal.client.context;

import com.crb.ocms.canal.client.model.CanalModel;

/**
 * @author jiwei
 * @date 2020/08/12
 */
public class CanalContext {

    private static ThreadLocal<CanalModel> threadLocal = new ThreadLocal<>();

    public static CanalModel getModel(){
        return threadLocal.get();
    }

    public static void setModel(CanalModel canalModel){
        threadLocal.set(canalModel);
    }

    public  static void removeModel(){
        threadLocal.remove();
    }

}
