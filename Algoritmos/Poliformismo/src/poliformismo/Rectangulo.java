
package poliformismo;

public class Rectangulo {
    private double base,altura;

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
    public double area(){
        double a;
        a=this.base*this.altura;
        return a;
    }
    public double perimetro(){
        double p;
        p=2*this.base+2*this.altura;
        return p;
    }
}
