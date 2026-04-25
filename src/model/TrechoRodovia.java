package model;

public class TrechoRodovia {
    private double quilometroInicial;
    private double quilometroFinal;
    private double nivelVegetacaoCm;

    public TrechoRodovia(double quilometroInicial, double quilometroFinal, double nivelVegetacaoCm) {
      this.setQuilometroInicial(quilometroInicial);
      this.setQuilometroFinal(quilometroFinal);
      this.setNivelVegetacaoCm(nivelVegetacaoCm);
    }

    public double getQuilometroInicial() {
        return quilometroInicial;
    }

    public double getQuilometroFinal() {
        return quilometroFinal;
    }

    public double getNivelVegetacaoCm() {
        return nivelVegetacaoCm;
    }

    public void setQuilometroInicial(double quilometroInicial) {
        if(quilometroInicial >= 0){
            this.quilometroInicial = quilometroInicial;
        }else {
            System.out.println("Valor para quilometroInicial invalido");
        }
    }

    public void setQuilometroFinal(double quilometroFinal) {
        if(quilometroFinal >= 0){
            this.quilometroFinal = quilometroFinal;
        }else {
            System.out.println("Valor para quilometroFinal invalido");
        }
    }

    public void setNivelVegetacaoCm(double nivelVegetacaoCm) {
        if(nivelVegetacaoCm >= 0){
            this.nivelVegetacaoCm = nivelVegetacaoCm;
        }else {
            System.out.println("Valor para nivelVegetacaoCm invalido");
        }
    }




}
