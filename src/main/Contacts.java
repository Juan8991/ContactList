package main;

import java.util.ArrayList;

public class Contacts extends Persona{
    private ArrayList<Persona> contactsArray = new ArrayList<>();
    public Contacts(String name, String phoneNumber) {
        super(name, phoneNumber);
    }
    public ArrayList saveInArray(Object Persona){
        Persona contact1= new Persona("Juan","3123424243");
        Persona contact2= new Persona("Joelle Mcdonald","1-811-766-0883");
        Persona contact3= new Persona("Claudia Harrell","1-806-520-4845");
        Persona contact4= new Persona("Dylan Montgomery","(962) 636-5028");
        Persona contact5= new Persona("Jack Garrison","1-535-626-3339");
        contactsArray.add(contact1);
        contactsArray.add(contact2);
        contactsArray.add(contact3);
        contactsArray.add(contact4);
        contactsArray.add(contact5);
        return contactsArray;
    }
    public void showArray(){

    }
}
