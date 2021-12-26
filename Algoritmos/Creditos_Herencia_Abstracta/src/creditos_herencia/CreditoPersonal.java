package creditos_herencia;

public class CreditoPersonal extends Credito{
    
    @Override
    public double calcular_cuota() {
        double cuota;
        cuota=(this.getMonto()+this.getMonto()*(this.getInteres()/100))/this.getPlazo();
        return cuota;
    }
}
