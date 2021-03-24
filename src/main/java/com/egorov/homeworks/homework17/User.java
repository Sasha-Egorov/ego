package com.egorov.homeworks.homework17;

import lombok.Data;

@Data
public class User {
    int id;
    String name;
    String username;
    String email;
    Address address;
    String phone;
    String website;
    Company company;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                ", phone='" + phone + '\'' +
                ", website='" + website + '\'' +
                ", company=" + company +
                '}';
    }
}
