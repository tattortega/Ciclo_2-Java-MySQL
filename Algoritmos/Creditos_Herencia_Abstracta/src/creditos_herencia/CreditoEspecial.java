package creditos_herencia;

public class CreditoEspecial extends Credito{

    @Override
    public double calcular_cuota() {
        double cuota;
        cuota=(this.getMonto())/this.getPlazo();
        return cuota;
    }
}
