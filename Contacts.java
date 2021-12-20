package com;

public class Contacts {
String firstName;
String lastName;
String address;
String city;
String email;
int zipcode;
int phoneNumber;

    @Override
    public String toString() {
        return "Contacts{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                ", zipcode=" + zipcode +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
