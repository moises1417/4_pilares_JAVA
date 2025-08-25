package abstraccionYherenciaEinterface;

public class Rectangulo extends Figura implements Dibujable, Coloreable , Perimetro {

    double base;
    double altura;

    public Rectangulo(String nombre, String color ,double base, double altura) {
        super(nombre , color);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double area = getBase() * getAltura();
        System.out.println("El area del rectangulo es: " + area);
    }

    @Override
    public void dibujar() {
        System.out.println("dibujando un rectangulo de base " + getBase() + " y altura " + getAltura()  + "Color: " + getColor());
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
        return 2 * (getBase() + getAltura());
    }
}
