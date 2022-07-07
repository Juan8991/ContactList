package main;

public class Persona {
    protected String name, phoneNumber;
    protected int id;


    public Persona(String name, String phoneNumber,int id) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Persona() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "nombre='" + name + '\'' +
                ", Número de telefono='" + phoneNumber + '\'' +
                "id='" + id +
                '}'+"\n";
    }
}
