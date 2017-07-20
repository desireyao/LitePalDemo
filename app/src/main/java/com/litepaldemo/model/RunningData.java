package com.litepaldemo.model;

import android.support.annotation.IdRes;

import org.litepal.crud.DataSupport;

/**
 * Package com.litepaldemo.model.
 * Created by yaoh on 2017/07/05.
 * Company Beacool IT Ltd.
 * <p/>
 * Description:
 */
public class RunningData extends DataSupport{

    private long start_time;
    private long end_time;
    private float speed;

    public long getStart_time() {
        return start_time;
    }

    public void setStart_time(long start_time) {
        this.start_time = start_time;
    }

    public long getEnd_time() {
        return end_time;
    }

    public void setEnd_time(long end_time) {
        this.end_time = end_time;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
}
