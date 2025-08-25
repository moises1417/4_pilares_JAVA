package abstraccionYherenciaEinterface;

public class Circulo extends Figura implements Dibujable , Coloreable , Perimetro{

    double radio;

    public Circulo(String nombre,String color,double radio) {
        super(nombre, color);
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
        System.out.println("dibujando un circulo con radio " + getRadio() + "Color: " + getColor());
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * 3.14 * getRadio();
    }
}
