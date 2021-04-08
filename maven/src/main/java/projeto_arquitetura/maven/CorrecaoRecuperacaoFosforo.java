package projeto_arquitetura.maven;

public class CorrecaoRecuperacaoFosforo {

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
    
    public double calculoQuantidadeAplicar(double calculoNecessitamosFosforo, double fonteFosforoUtilizar){
        return calculoNecessitamosFosforo * 100 / fonteFosforoUtilizar;
    }
    
       public double calculoCustoPorHa(double valorFonteFosfoto, double quantidadeAplicar){
        if(valorFonteFosfoto != 0){
            return ((valorFonteFosfoto*(quantidadeAplicar * 2.42))/1000)/2.42;
        }
        return 0.0;
    }
}
