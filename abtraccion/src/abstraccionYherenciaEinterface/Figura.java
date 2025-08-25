package abstraccionYherenciaEinterface;

public abstract class Figura {

    String nombre;
    String color;

    public Figura(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void calcularArea();

    public void mostrarNombre(){
        System.out.println("Nombre : " + getNombre());
    }


}
