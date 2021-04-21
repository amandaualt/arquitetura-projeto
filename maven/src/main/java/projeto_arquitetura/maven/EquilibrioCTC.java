package projeto_arquitetura.maven;

public class EquilibrioCTC {

    public double somaScmol(double potassio, double calcio, double magnesio) {
        return potassio + calcio + magnesio;
    }

    public double somaCtcCmol(double scmol, double hAl) {
        return scmol + hAl;
    }

    public double calculaVAtual(double scmol, double ctcCmol) {
        if (scmol > 0 && ctcCmol > 0) {
            return scmol / ctcCmol * 100;
        } else {
            return 0.0;
        }
    }

    public double MOPercentual(double mo) {
        if (mo > 0) {
            return mo / 10;
        } else {
            return 0.0;
        }
    }

    public double somaCarbono(double moPercentual) {
        if (moPercentual > 0) {
            return moPercentual / 1.72 * 10;
        } else {
            return 0.0;
        }
    }

}
