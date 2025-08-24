package abstraccionYherencia;

public class Circulo extends Figura{

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
    void calcularArea() {

        double area = 3.14 * (getRadio() * 2);
        System.out.println("El area del circulo es de: " + area);
    };
}
