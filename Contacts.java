package com;

public class Contacts {
String firstName;
String lastName;
String address;
String city;
String state;
String email;
int zipCode;
long phoneNumber;

    @Override
    public String toString() {
        return "Contacts{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", email='" + email + '\'' +
                ", zipCode=" + zipCode +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}

