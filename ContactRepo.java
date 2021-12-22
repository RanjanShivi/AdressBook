package com;

import java.util.ArrayList;
import java.util.List;

public class ContactRepo {
    private static ContactRepo instance;
    private List<Contacts> contactList = new ArrayList<>();

    private ContactRepo() {
    }

    public static ContactRepo getInstance() {
        if (instance == null) {
            instance = new ContactRepo();
        }
        return instance;
    }

    void add(Contacts contact) {
        contactList.add(contact);
    }

    List getContactList(){
        return contactList;
    }

    void remove(Contacts contact){

        contactList.remove(contact);
    }

    Contacts getContact(long num) {
        for (int i = 0; i < contactList.size(); i++) {
            if (num == contactList.get(i).phoneNumber) {
                return contactList.get(i);
            }
        }
        return null;
    }


}