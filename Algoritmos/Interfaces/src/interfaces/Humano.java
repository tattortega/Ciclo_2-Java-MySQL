package interfaces;

public class Humano implements AccionesGeneral,AccionesHumano{
    private String documento;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public void razonar(){
        System.out.println("El humano con documento "+this.documento+ " esta razonando ");
    }

    @Override
    public void desplazar() {
        System.out.println("El humano con documento "+this.documento+ " se esta desplazando");
    }

    @Override
    public void jugar() {
        System.out.println("El humano con documento "+this.documento+ " esta jugando");
    }

    @Override
    public void alimentar() {
        System.out.println("El humano con documento "+this.documento+ " se esta alimentando");
    }

    @Override
    public void dormir() {
        
    }

    @Override
    public void trabajar() {
        System.out.println("El humano con docuemtno "+this.documento+ " esta trabajando");
    }

    @Override
    public void estudiar() {
        
    }
    
}
