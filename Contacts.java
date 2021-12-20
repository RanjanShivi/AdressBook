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
                "\n firstName='" + firstName + '\''  +
                "\n lastName='" + lastName + '\'' +
                "\n address='" + address + '\'' +
                "\n city='" + city + '\'' +
                "\n state='" + state + '\'' +
                "\n email='" + email + '\'' +
                "\n zipCode=" + zipCode +
                "\n phoneNumber=" + phoneNumber +
                '}';
    }
}

