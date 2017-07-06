package com.litepaldemo.model;

import org.litepal.crud.DataSupport;

/**
 * Package com.litepaldemo.model.
 * Created by yaoh on 2017/07/05.
 * Company Beacool IT Ltd.
 * <p/>
 * Description:
 */
public class User extends DataSupport {
    private long id;
    private String name;
    private int age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
