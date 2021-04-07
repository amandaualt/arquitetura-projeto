package projeto_arquitetura.maven;

public class RecCorrecaoPotassio {

    EquilibrioCTC equiCTC;
    Elements elemento;
    private double teorPotCtcDesj;
    private int fontPotUsar;
    private double valorPotassioRecebido;

    public RecCorrecaoPotassio(int fontPotUsar, double valorPotassioRecebido) {
        this.valorPotassioRecebido = valorPotassioRecebido;
        this.fontPotUsar = fontPotUsar;
    }
    public double calcCTCMolPotassio(){
        return valorPotassioRecebido/equiCTC.somaCtcCmol() * 10;
    }
    public double calcFontPotassioUsar() {
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
