package main;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world");
        ArrayList<Persona> contactsArray = new ArrayList<>();
        Persona persona = new Persona();
        Contacts contactos = new Contacts();
        contactsArray = contactos.saveInArray();
        contactos.showArray(contactsArray);


    }
}
