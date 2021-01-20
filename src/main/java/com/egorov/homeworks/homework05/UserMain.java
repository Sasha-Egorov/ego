package com.egorov.homeworks.homework05;

import java.util.Date;

public class UserMain {
    public static void main(String[] args) {
        Date d = new Date(1995,2,13);
        System.out.println("Immutable Order");
        UserImmutable user1 = new UserImmutable(1234,d,235647, "street");
        System.out.println(user1);
        d.setDate(1900);
        System.out.println(user1);

        System.out.println("Mutable Order");
        UserMutable user2 = new UserMutable(1234,d,235647, "street");
        System.out.println(user2);
        Date d2 = new Date(1999,12,12);
        user2.setDeliveryDate(d2);
        System.out.println(user2);

    }
}
