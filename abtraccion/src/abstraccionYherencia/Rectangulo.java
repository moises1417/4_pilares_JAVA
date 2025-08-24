package abstraccionYherencia;

public class Rectangulo extends Figura {

    double base;
    double altura;

    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
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
    void calcularArea() {
        double area = getBase() * getAltura();
        System.out.println("El area del rectangulo es: " + area);
    }
}
