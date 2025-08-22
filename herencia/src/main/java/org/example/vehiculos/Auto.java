package org.example.vehiculos;

public class Auto extends Vehiculo {

    int cantidadPuertas;

    public Auto(){};
    public Auto(String marca, String modelo, int anio, int cantidadPuertas) {
        super(marca, modelo, anio);
        this.cantidadPuertas = cantidadPuertas;
    }


    @Override
    public void MostrarInfo() {
        System.out.println("Marca : " + getMarca() + " Modelo: " + getModelo() + " Año " + getAnio() + " Puertas : " + this.cantidadPuertas);
    }

    @Override
    public boolean esAntiguo(int anio) {
        return super.esAntiguo(anio);
    }
}
