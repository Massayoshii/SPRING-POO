package model;

public class TrechoRodovia {
    private double quilometroInicialCentimetros;
    private double quilometroFinalCentimetros;
    private double nivelVegetacaoCentimetros;




    public double getQuilometroInicialCentimetros() {
        return quilometroInicialCentimetros;
    }

    public double getQuilometroFinalCentimetros() {
        return quilometroFinalCentimetros;
    }

    public double getNivelVegetacaoCentimetros() {
        return nivelVegetacaoCentimetros;
    }

    public void setQuilometroInicialCentimetros(double quilometroInicialCentimetros) {
        if(quilometroInicialCentimetros >= 0){
            this.quilometroInicialCentimetros = quilometroInicialCentimetros;
        }else {
            System.out.println("Valor para quilometroInicialCentimetros invalido");
        }
    }

    public void setQuilometroFinalCentimetros(double quilometroFinalCentimetros) {
        if(quilometroFinalCentimetros >= 0){
            this.quilometroFinalCentimetros = quilometroFinalCentimetros;
        }else {
            System.out.println("Valor para quilometroFinalCentimetros invalido");
        }
    }

    public void setNivelVegetacaoCentimetros(double nivelVegetacaoCentimetros) {
        if(nivelVegetacaoCentimetros >= 0){
            this.nivelVegetacaoCentimetros = nivelVegetacaoCentimetros;
        }else {
            System.out.println("Valor para nivelVegetacaoCentimetros invalido");
        }
    }


}
