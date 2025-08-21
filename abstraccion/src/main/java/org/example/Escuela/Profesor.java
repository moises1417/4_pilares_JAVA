package org.example.Escuela;

public class Profesor extends Persona {

    String materia;

    public Profesor() {}
    public Profesor(String nombre, int edad, String materia) {
        super(nombre, edad);
        this.materia = materia;
    }

    @Override
    public void MostrarInfo() {
        System.out.println("Nombre : " + getNombre() + " Edad: " + getEdad() + " Materia: " + this.materia);
    }

}
