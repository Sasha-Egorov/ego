package com.egorov.homeworks.homework05;

import java.util.Date;

public class UserMutable {

    private int id;
    private Date deliveryDate;
    private int customerId;
    private String address;


    public UserMutable(int id, Date deliveryDate, int customerId, String address) {
        this.id = id;
        this.deliveryDate = deliveryDate;
        this.customerId = customerId;
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserImmutable{" +
                "id=" + id +
                ", deliveryDate=" + deliveryDate +
                ", customerId=" + customerId +
                ", address='" + address + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
