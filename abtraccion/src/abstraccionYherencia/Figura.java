package abstraccionYherencia;

public abstract class Figura {

    String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    abstract void calcularArea();

    void mostrarNombre(){
        System.out.println("Nombre : " + getNombre());
    }


}
