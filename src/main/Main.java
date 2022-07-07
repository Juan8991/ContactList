package main;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static ArrayList<Persona> contactsArray = new ArrayList<>();
    public static void main(String[] args) {
        //System.out.println("Hello world");
        mainMenu();
    }
    public static void mainMenu(){
        Scanner in = new Scanner(System.in);
        Contacts contactos = new Contacts();
        contactsArray = contactos.saveInArray();
        String name, phoneNumber;
        int id;
        /**
         * Variable encargada de la ejecución en bucle del programa
         */
        int flag = 0;
        /**
         * Variable correspondiente al numero de opcion escogida por el usuario
         */
        int selection = 0;
        try {
            do{
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Porfavor seleccione una opción:");
                System.out.println("    1. Mostrar Lista de contactos.");
                System.out.println("    2. Agregar un nuevo contacto.");
                System.out.println("    3. Modificar un contacto.");
                System.out.println("    4. Eliminar un contacto.");
                System.out.println("    5. Salir.");
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                selection=in.nextInt();
                switch (selection){
                    case 1:
                        contactos.showArray(contactsArray);
                        break;
                    case 2:
                        System.out.println("Ingrese el nombre del contacto:");
                        name=in.next();
                        System.out.println("Ingrese el numero telefonico:");
                        phoneNumber=in.next();
                        id=contactsArray.size()+1;
                        contactos.addContac(contactsArray,new Persona(name,phoneNumber,id));
                        break;
                    case 3:
                        System.out.println("Ingrese los datos a actualizar");
                        System.out.println("Ingrese el nombre del contacto:");
                        name=in.next();
                        System.out.println("Ingrese el numero telefonico:");
                        phoneNumber=in.next();
                        System.out.println("Ingrese el id del contacto:");
                        id=in.nextInt();
                        contactsArray=contactos.upDateContact(contactsArray,id,new Persona(name,phoneNumber,id));
                        break;
                    case 4:

                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Opción no valida");
                }
            }while (flag==0);

        }catch (InputMismatchException exception){
            System.out.println("Mala elección");
            mainMenu();
        }

    }

}
