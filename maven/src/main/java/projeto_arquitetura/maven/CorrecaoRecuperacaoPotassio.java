package projeto_arquitetura.maven;

public class CorrecaoRecuperacaoPotassio {

    private double teorPotCtcDesj;
    private int fontPotUsar;
    private double valorPotassioRecebido;
    
    public CorrecaoRecuperacaoPotassio(int fontPotUsar, double valorPotassioRecebido, double teorPotCtcDesj) {
        this.teorPotCtcDesj = teorPotCtcDesj;
        this.valorPotassioRecebido = valorPotassioRecebido;
        this.fontPotUsar = fontPotUsar;
    }

    public double calculoCTCMolPotassio(double ctcCmol){
        return valorPotassioRecebido/ctcCmol * 10;
    }

    public double necessidadePotassioAdd(double ctcCmolPotassio) {
        return (valorPotassioRecebido * teorPotCtcDesj / ctcCmolPotassio) - valorPotassioRecebido;
    }

    public double calculoCmolcCm3KMgDm3(double necessidadeKAdd) {
        if (necessidadeKAdd < 0.01) {
            return 0.0;
        }
        return necessidadeKAdd * 39.1 * 10;
    }

    public double calculoMgDm3KgHa(double cmolcCm3KMgDm3) {
        return cmolcCm3KMgDm3 * 2;
    }

    public double calculoKgHaKK2O(double mgDm3KgHa) {
        return mgDm3KgHa * 1.2;
    }

    public double calculoConsiderandoEficPotassio(double kgHaKK2O, double consideraEficienciaPotassio) {
        return kgHaKK2O * 100 / consideraEficienciaPotassio / 10;
    }

}
