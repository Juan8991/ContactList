package main;

public class Persona {
    private String name, phoneNumber;

    public Persona(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
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
                '}';
    }
}
