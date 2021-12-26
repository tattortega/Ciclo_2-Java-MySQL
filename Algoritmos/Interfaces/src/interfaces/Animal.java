package interfaces;

public class Animal implements AccionesGeneral {
    private String raza;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void cazar(){
        System.out.println("El animal de raza "+this.raza+ " esta cazando");
    }

    @Override
    public void desplazar() {
        System.out.println("El animal de raza "+this.raza+ " se esta desplazando");
    }

    @Override
    public void jugar() {
        System.out.println("El animal de raza "+this.raza+ " esta jugando");
    }

    @Override
    public void alimentar() {
        System.out.println("El animal de raza "+this.raza+ " se esta alimentando");
    }

    @Override
    public void dormir() {
        
    }
}
