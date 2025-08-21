package org.example.T_animales;

public class Gato extends Animal {

    public Gato(String nombre){
        super(nombre);

    }
    public void hacerSonido(){
        System.out.println(nombre + " dice miauuu");
    };
}
