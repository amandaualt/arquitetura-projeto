package projeto_arquitetura.maven;

public class EquilibrioCTC {
        public double somaScmol(Elements elemento) {
//    	return elemento.getPotassio() + elemento.getCalcio() + elemento.getMagnesio();
        return (0.15+5.76+1.63);
    }
    public double somaCtc(Elements elemento) {
//    	return somaScmol(elemento) + elemento.gethAl()
        return somaScmol(elemento)+5.35; 
    }
    public double vAtual(Elements elemento) {
        var scmol = somaScmol(elemento);
        var ctc = somaCtc(elemento);
        
        if(scmol > 0 && ctc > 0 ){
            return scmol/ctc*100;
        }else{
            return 0.0;
        }
    }
    
    public double MOPercentual(double mo) {
        if (mo > 0 ){
            return mo / 10;
        }else{
            return 0.0;
        }
    }
    
    public double somaCarbono(double moPercentual) {
           if (moPercentual > 0 ){
            return moPercentual / 1.72 * 10;
        }else{
            return 0.0;
        }
    }
    
}
