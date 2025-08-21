package org.example.T_animales;

public class perro extends Animal {

    public perro (String nombre ){
        super(nombre);
    }

    public void hacerSonido() {
        System.out.println(nombre + " dice guau guau! ");
    }
}
