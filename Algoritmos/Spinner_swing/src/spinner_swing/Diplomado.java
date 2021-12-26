package spinner_swing;

public class Diplomado {
    private int grupos;
    private double valor_diplomado, docencia, plataforma, admon;

    public int getGrupos() {
        return grupos;
    }

    public void setGrupos(int grupos) {
        this.grupos = grupos;
    }

    public double getValor_diplomado() {
        return valor_diplomado;
    }

    public void setValor_diplomado(double valor_diplomado) {
        this.valor_diplomado = valor_diplomado;
    }

    public double getDocencia() {
        return docencia;
    }

    public void setDocencia(double docencia) {
        this.docencia = docencia;
    }

    public double getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(double plataforma) {
        this.plataforma = plataforma;
    }

    public double getAdmon() {
        return admon;
    }

    public void setAdmon(double admon) {
        this.admon = admon;
    }
    
    public double calcular_ingresos(){
        double ingresos;
        ingresos=this.valor_diplomado*this.grupos*8;
        return ingresos;
    }
    
    public double calcular_costos(){
        double costos;
        costos=(this.docencia+this.plataforma+this.admon)*this.grupos;
        return costos;
    }
}
