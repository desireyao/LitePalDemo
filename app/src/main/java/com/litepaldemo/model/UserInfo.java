package com.litepaldemo.model;

import org.litepal.crud.DataSupport;

/**
 * Package com.litepaldemo.model.
 * Created by yaoh on 2017/07/07.
 * Company Beacool IT Ltd.
 * <p/>
 * Description:
 */
public class UserInfo extends DataSupport{

    private String id_card;

    private String address;

    private String country;

    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id_card='" + id_card + '\'' +
                ", address='" + address + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
