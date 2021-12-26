package reto2;

public class Estudiante {
    private long codigo;
    private int prog_acad,ind_beca;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public int getProg_acad() {
        return prog_acad;
    }

    public void setProg_acad(int prog_acad) {
        this.prog_acad = prog_acad;
    }

    public int getInd_beca() {
        return ind_beca;
    }

    public void setInd_beca(int ind_beca) {
        this.ind_beca = ind_beca;
    }
    public double valor_matricula(){
        double matricula,descuento,vm=0;
        switch(this.prog_acad){
            case 1:{
                switch(this.ind_beca){
                    case 1:{
                        matricula=800000;
                        descuento=matricula*0.50;
                        vm=matricula-descuento;
                        break;
                    }
                    case 2:{
                        matricula=800000;
                        descuento=matricula*0.40;
                        vm=matricula-descuento;
                        break;
                    }
                    case 3:{
                        vm=800000;
                        break;
                    }
                }
                break;
            }
            case 2:{
                switch(this.ind_beca){
                    case 1:{
                        matricula=1000000;
                        descuento=matricula*0.50;
                        vm=matricula-descuento;
                        break;
                    }
                    case 2:{
                        matricula=1000000;
                        descuento=matricula*0.40;
                        vm=matricula-descuento;
                        break;
                    }
                    case 3:{
                        vm=1000000;
                        break;
                    }
                }
                break;
            }
            case 3:{
                switch(this.ind_beca){
                    case 1:{
                        matricula=1200000;
                        descuento=matricula*0.50;
                        vm=matricula-descuento;
                        break;
                    }
                    case 2:{
                        matricula=1200000;
                        descuento=matricula*0.40;
                        vm=matricula-descuento;
                        break;
                    }
                    case 3:{
                        vm=1200000;
                        break;
                    }
                }
                break;
            }
        }
      return vm;  
    }
}
