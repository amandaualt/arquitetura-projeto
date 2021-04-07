package projeto_arquitetura.maven;

public class RecCorrecaoPotassio {

    EquilibrioCTC equiCTC;
    Elements elemento;
    private double teorPotCtcDesj;
    private int fontPotUsar;
    private double valorPotassioRecebido;

    
    
    public RecCorrecaoPotassio(int fontPotUsar, double valorPotassioRecebido, double teorPotCtcDesj) {
        this.teorPotCtcDesj = teorPotCtcDesj;
        this.valorPotassioRecebido = valorPotassioRecebido;
        this.fontPotUsar = fontPotUsar;
    }
    public double calculoCTCMolPotassio(){
        return valorPotassioRecebido/equiCTC.somaCtcCmol() * 10;
    }
    
    public double necessidadeKAdd(){
        return (valorPotassioRecebido*teorPotCtcDesj/calculoCTCMolPotassio())-valorPotassioRecebido;
    }
   
    public double calculocmolcCm3KMgDm3(){
        if (necessidadeKAdd() < 0.01){
            return 0.0;
        }
        return necessidadeKAdd() * 39.1 * 10;
    }
    
    public double calculoMgDm3KgHa(){
        return calculocmolcCm3KMgDm3() * 2;
    }
    
    public double calculoKgHaKK2O(){
        return calculoMgDm3KgHa() * 1.2;
    }
    
    public double calculoConsiderandoEficPotassio(){
        return calculoKgHaKK2O() * 100 / 0.85 / 10;
    }
    
    public double calculoFontPotassioUsar() {
        switch (fontPotUsar) {
            case 1:
                return 58.0;
            case 2:
                return 52.0;
            case 3:
                return 22.0;
            case 4:
                return 44.0;
            default:
                return 0.0;
        }
    }
}
