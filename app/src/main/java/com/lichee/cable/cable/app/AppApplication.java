package com.lichee.cable.cable.app;


import com.jaydenxiao.common.baseapp.BaseApplication;


/**
 *
 * @author lichee
 * @date 2019/1/21
 */

public class AppApplication  extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        AppConfig.init(this);
    }

}