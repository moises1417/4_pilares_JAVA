package org.example.Escuela;

public class Estudiante extends Persona{

    String curso;

    public Estudiante() {}

    public Estudiante(String nombre, int edad, String curso) {
        super(nombre, edad);
        this.curso = curso;
    }

    @Override
    public void MostrarInfo() {
        System.out.println("Nombre : " + getNombre() + " Edad : " + getEdad() + " Curso : " + this.curso);
    }
}
