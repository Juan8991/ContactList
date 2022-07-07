package main;

import java.util.ArrayList;

public class Contacts extends Persona{
    private ArrayList<Persona> contactsArray = new ArrayList<>();
    public Contacts(String name, String phoneNumber, int id) {
        super(name, phoneNumber, id);
    }

    public Contacts() {
    }

    public ArrayList saveInArray(){
        Persona contact1= new Persona("Juan","3123424243",1);
        Persona contact2= new Persona("Joelle Mcdonald","1-811-766-0883",2);
        Persona contact3= new Persona("Claudia Harrell","1-806-520-4845",3);
        Persona contact4= new Persona("Dylan Montgomery","(962) 636-5028",4);
        Persona contact5= new Persona("Jack Garrison","1-535-626-3339",5);
        contactsArray.add(contact1);
        contactsArray.add(contact2);
        contactsArray.add(contact3);
        contactsArray.add(contact4);
        contactsArray.add(contact5);
        return contactsArray;
    }
    public void showArray(ArrayList contactsArray ){
        System.out.println(contactsArray);
    }
    public ArrayList addContac(ArrayList contactsArray, Persona persona ){
        contactsArray.add(persona);
        System.out.println("Contacto guardado");
        return contactsArray;
    }
    public ArrayList upDateContact(ArrayList contactsArray,int id,Persona persona){
        ArrayList<Persona> contactsArray2 = new ArrayList<>();
        for (Object per:contactsArray) {
            if(contactsArray.indexOf(per) == id-1){
                contactsArray2.add(persona);
            }
            else{
                contactsArray2.add((Persona) per);
            }

        }
        return contactsArray2;
    }


}
