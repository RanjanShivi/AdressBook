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


}