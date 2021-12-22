package com;

import java.util.List;
import java.util.Scanner;

public class Application {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option=0;
        Application application = new Application();
        UserInterface userInterface = new UserInterface();
        do{
            option = userInterface.ShowMainMenu();
            application.handleUserSelection(option);
        }while (option != 5);
    }

    void handleUserSelection(int option){
        UserInterface userInterface = new UserInterface();
        ContactRepo contactRepo = ContactRepo.getInstance();
        switch (option){
            case 1:
                addContact();
                break;
            case 2:
                List doctorList = contactRepo.getContactList();
                userInterface.printAllContact(doctorList);
                break;
            case 3:
                System.out.println("Enter the phone number of the person whose contact you want to delete");
                long num = scanner.nextInt();
                Contacts contact = contactRepo.getContact(num);
                contactRepo.remove(contact);
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                System.out.println("Wrong Option..!");
                break;
        }
    }

    void addContact() {
        Contacts contact = new Contacts();
        System.out.println("Enter first name");
        contact.firstName = scanner.next();
        System.out.println("Enter last name");
        contact.lastName = scanner.next();
        System.out.println("Enter city name");
        contact.city = scanner.next();
        System.out.println("Enter state");
        contact.state = scanner.next();
        System.out.println("Enter zipCode");
        contact.zipCode = scanner.nextInt();
        System.out.println("Enter phoneNumber");
        contact.phoneNumber = scanner.nextLong();
        System.out.println("Enter emailID");
        contact.email = scanner.next();

        ContactRepo contactRepo = ContactRepo.getInstance();
        contactRepo.add(contact);
    }
}

