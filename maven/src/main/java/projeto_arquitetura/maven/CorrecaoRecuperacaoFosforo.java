package projeto_arquitetura.maven;

public class CorrecaoRecuperacaoFosforo {

    private EnumFosforo elementosFosforo;

    public double calculoNessecidadeAdd(double teorFosforoAtingir, double fosforoRecebido) {
        return teorFosforoAtingir - fosforoRecebido;
    }

    public double verificaNessecidadeAdd(double necessidadeAdd) {
        if (necessidadeAdd < 0.01) {
            return 0.0;
        }
        return necessidadeAdd;
    }

    public double transformaMgDmEmKgHa(double verificaNecessidadeAdd) {
        return verificaNecessidadeAdd * 2;
    }

    public double transformandoKgHaFosforoKgHaP2O5(double transformatransformaMgDmEmKgHa) {
        return transformatransformaMgDmEmKgHa * 2.29;
    }

    public double calculoNecessitamosFosforo(double transformandoKgHaFosforoKgHaP2O5, double eficienciaFosforo) {
        return transformandoKgHaFosforoKgHaP2O5 * 100 / eficienciaFosforo / 100;
    }

    public double calculoQuantidadeAplicar(double calculoNecessitamosFosforo, double fonteFosforoUtilizar) {
        return calculoNecessitamosFosforo * 100 / fonteFosforoUtilizar;
    }

    public double multiplicaQuantidadeAplicar(double quantidadeAplicar) {
        return quantidadeAplicar * 2.42;
    }

    public double calculoCustoPorHa(double valorFonteFosfoto, double multiplicaQuantidadeAplicar) {
        if (valorFonteFosfoto != 0) {
            return ((valorFonteFosfoto * multiplicaQuantidadeAplicar) / 1000) / 2.42;
        }
        return 0.0;
    }

    public double verificaFontPotassioSuperSimplesOuMultMagnesiano(double multiplicaQuantidadeAplicar) {
        switch (elementosFosforo) {
            case SUPERFOSTATO_SIMPLES:
                return multiplicaQuantidadeAplicar * 0.1;
            case MULTIF_MAGNESIANO:
                return multiplicaQuantidadeAplicar * 0.11;
            default:
                return 0.0;
        }
    }

    public double calculaM23(double verificaFontPotassioSuperSimplesOuMultMagnesiano) {
        return verificaFontPotassioSuperSimplesOuMultMagnesiano * 2.42;
    }

    public double calculaN21(double calculoQuantidadeAplicar) {
        return calculoQuantidadeAplicar * 0.15;
    }

    public String verificaEnxofreOuMagnesio(double multiplicaQuantidadeAplicar) {
        switch (elementosFosforo) {
            case SUPERFOSTATO_SIMPLES:
                return ("Enxofre");

            case MULTIF_MAGNESIANO:
                return ("Enxofre");

            case YOORIN:
                return ("Magnésio");
            default:
                return null;
        }
    }
}
