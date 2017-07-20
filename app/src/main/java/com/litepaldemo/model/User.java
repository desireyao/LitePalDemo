package com.litepaldemo.model;

import org.litepal.annotation.Column;
import org.litepal.crud.DataSupport;

/**
 * Package com.litepaldemo.model.
 * Created by yaoh on 2017/07/05.
 * Company Beacool IT Ltd.
 * <p/>
 * Description:
 */
public class User extends DataSupport {

    private String name;

    private int age;

    private String id_card;

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

    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id_card='" + id_card + '\'' +
                '}';
    }
}
