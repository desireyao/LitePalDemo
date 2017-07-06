package com.litepaldemo;

import android.app.Application;

import org.litepal.LitePal;

/**
 * Package com.litepaldemo.
 * Created by yaoh on 2017/07/05.
 * Company Beacool IT Ltd.
 * <p/>
 * Description:
 */
public class App extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(this);
    }
}
