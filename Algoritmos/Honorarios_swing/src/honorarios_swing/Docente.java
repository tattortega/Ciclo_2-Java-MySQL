package honorarios_swing;

public class Docente {
    private long documento;
    private String nombre;
    private int categoria;
    private double horas;

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
    
    public double calcular_honorarios(){
        double honorarios=0;
        switch(this.categoria){
            case 1:honorarios=this.horas*250000;break;
            case 2:honorarios=this.horas*350000;break;
            case 3:honorarios=this.horas*450000;break;
        }
        return honorarios;
    }
}
