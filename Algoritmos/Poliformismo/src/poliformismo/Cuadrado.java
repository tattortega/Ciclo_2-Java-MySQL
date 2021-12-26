
package poliformismo;

public class Cuadrado {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    public double area(){
        double a;
        a=Math.pow(this.lado, 2);
        return a;
    }
    public double perimetro(){
        double p;
        p=4*this.lado;
        return p;
    }
}
