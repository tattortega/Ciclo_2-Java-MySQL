package creditos_herencia;

public class CreditoEmpresarial extends Credito{
    private double valor_interes;

    public double getValor_interes() {
        return valor_interes;
    }

    public void setValor_interes(double valor_interes) {
        this.valor_interes = valor_interes;
    }
    
    @Override
    public double calcular_cuota() {
        double cuota;
        cuota=(this.getMonto()+this.valor_interes)/this.getPlazo();
        return cuota;
    }
}
