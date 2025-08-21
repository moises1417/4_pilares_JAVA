package org.example.Escuela;

public class Persona {

    String nombre;
    int edad;

    public Persona(){};
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void MostrarInfo (){
        System.out.println("Nombre : " + getNombre() + ", Edad: " + getEdad());
    };
}
