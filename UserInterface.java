package com;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    int ShowMainMenu(){
        System.out.println("Welcome to Address book ");
        System.out.println("1: Create new Contact\n2: Show all contact\n3: Delete contact\n4: Edit Contact\n" +
                "5: Exit");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        return option;
        }

    void printAllContact(List contact) {

        for (int i = 0; i < contact.size(); i++) {
            System.out.println(contact.get(i));
        }
    }
    }
