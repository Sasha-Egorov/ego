package com.egorov.homeworks.homework05;

import java.util.Date;

public class UserImmutable {
    private int id;
    private Date deliveryDate;
    private int customerId;
    private String address;

    public UserImmutable(int id, Date deliveryDate, int customerId, String address) {
        this.id = id;
        this.deliveryDate = new Date(deliveryDate.getTime());
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
        return new Date(this.deliveryDate.getTime());
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getAddress() {
        return address;
    }
}
