package abstraccionYherenciaEinterface;

public class Circulo extends Figura implements Dibujable{

    double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {

        double area = 3.14 * getRadio() * getRadio();
        System.out.println("El area del circulo es de: " + area);
    };

    @Override
    public void dibujar() {
        System.out.println("dibujando un circulo con radio " + getRadio());
    }
}
