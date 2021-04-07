package projeto_arquitetura.maven;
        
public class App {
	RecCorrecaoPotassio correcaoRec;
   	Elements elemento;
        EquilibrioCTC equiCTC;

    public static void main(String[] args) {    	
    	App app = new App();

        
        System.out.println("Dados: " + app.elemento);
    	System.out.println("\n");
//    	System.out.println("S cmol: " + app.equiCTC.somaScmol(app.elemento));;
//    	System.out.println("\n");
//    	System.out.println("Ctc cmol: " + app.equiCTC.somaCtcCmol(app.elemento));
//    	System.out.println("\n");
//    	System.out.println("V% Atual: " + app.equiCTC.vAtual(app.elemento));
//    	System.out.println("\n");
//    	app.correcaoRec = app.correcaoFosf();;
//    	System.out.println("\n");
//    	app.correcaoRec = app.fontesFosf();
//    	System.out.println("\n");    	
//    	System.out.println(app.atualPotSolo());
//    	System.out.println("Participação atual do POTÁSSIO na CTC do solo: " + app.correcaoPot());
//    	System.out.println("Participação ideal do Potássio na CTC:: " + app.PartIdealPot());

    	System.out.println("\n");
//    	app.correcaoRec = app.fontesPot();
    
    }
    
//    public CorrecaoRecuperacao correcaoFosf() {
//    	
//    	CorrecaoRecuperacao correcaoRec = new CorrecaoRecuperacao();
//    	
//    	Scanner lerCorrecao = new Scanner(System.in);
//    	
//    	System.out.println("Teor de Fósforo a atingir: ");
//    	correcaoRec.setTeorFosfAtingir(lerCorrecao.nextDouble());
//    	
//    	System.out.println("Fonte de Fósforo a utilizar: ");
//    	correcaoRec.setFonteFosfUtilizar(lerCorrecao.nextInt());
//    	
//    	System.out.println("Eficiência do Fósforo %: ");
//    	correcaoRec.setEficienciaFosf(lerCorrecao.nextDouble());
//    	
//    	lerCorrecao.close();
//    	return correcaoRec;
//    }
//    
//    
//    public CorrecaoRecuperacao fontesFosf() {
//    	CorrecaoRecuperacao correcaoRec = new CorrecaoRecuperacao();
//    	Scanner lerFontes = new Scanner(System.in);
//    	
//    	System.out.println("1 – Superfosfato Simples: ");
//    	correcaoRec.setSuperFofatoSimples(lerFontes.nextDouble());
//    	
//    	System.out.println("2 – Superfosfato Triplo: ");
//    	correcaoRec.setSuperFofatoTriplo(lerFontes.nextDouble());
//    	
//    	System.out.println("3 – MAP: ");
//    	correcaoRec.setMap(lerFontes.nextDouble());
//    	
//    	System.out.println("4 – DAP: ");
//    	correcaoRec.setDap(lerFontes.nextDouble());
//    	
//    	System.out.println("5 – Yoorin: ");
//    	correcaoRec.setYoorin(lerFontes.nextDouble());
//    	
//    	System.out.println("6 – Fosfato  Arad: ");
//    	correcaoRec.setFosfatoArad(lerFontes.nextDouble());
//    	
//    	System.out.println("7 – Fosfato  Gafsa: ");
//    	correcaoRec.setFosfatoGafsa(lerFontes.nextDouble());
//    	
//    	System.out.println("8 – Fosfato  Daoui: ");
//    	correcaoRec.setFosfatoDaoui(lerFontes.nextDouble());
//    	
//    	System.out.println("9 - Fosf.  Patos Minas: ");
//    	correcaoRec.setFosfPatosMinas(lerFontes.nextDouble());
//    	
//    	System.out.println("10 – Escória de Thomas: ");
//    	correcaoRec.setEscoriaThomaso(lerFontes.nextDouble());
//    	
//    	System.out.println("11 – Ácido Fosfórico: ");
//    	correcaoRec.setAcidoFosforico(lerFontes.nextDouble());
//    	
//    	System.out.println("12 – Multif.Magnesiano: ");
//    	correcaoRec.setMultifMag(lerFontes.nextDouble());
//    	
//    	lerFontes.close();
//    	return correcaoRec;
//    }
//    
//    //participação atual do potassio na CTC do solo: 
//   public double atualPotSolo() {
//	   try {
//    	return elemento.getPotassio()/(equiCTC.somaScmol(elemento)+elemento.gethAl())*100;
//	   }catch (Exception e) {
//		   return 0;
//	   }
//    }
//   
//   // participação ideal do potássio na ctc 
//   public double PartIdealPot() {
//	   if(dadosProd.getTexturaSolo() == 1 || dadosProd.getTexturaSolo() == 2){
//		   System.out.println("3,0%");		   
//	   }else {
//		   return 0;
//	   }
//	return 0;
//   }
   
   // calculo custo:
//   public double CustoHa() {
//	if(((elemento.getPotassio()*correcaoRec.getPotCtcDesj()/atualPotSolo())-elemento.getPotassio()) < 0.01){
//		 System.out.println("0.0");
//	} else {
//		return (elemento.getPotassio()*correcaoRec.getPotCtcDesj()/atualPotSolo())-elemento.getPotassio();
//	}
//   }
    
//    public CorrecaoRecuperacao correcaoPot() {
//    	CorrecaoRecuperacao correcaoRec = new CorrecaoRecuperacao();
//    	Scanner lerCorrecao = new Scanner(System.in);
//    	
//    	System.out.println("Participação do Potássio na CTC, desejada:  ");
//    	correcaoRec.setPotCtcDesj(lerCorrecao.nextDouble());
//    	
//    	System.out.println("Fonte de Potássio a usar: ");
//    	correcaoRec.setFontPotUsar(lerCorrecao.nextInt());
//    	
//    	
//    	lerCorrecao.close();
//    	return correcaoRec;
//    	
//    }
//    
//    
//    public CorrecaoRecuperacao fontesPot() {
//    	CorrecaoRecuperacao correcaoRec = new CorrecaoRecuperacao();
//    	Scanner lerFontes = new Scanner(System.in);
//    	
//    	System.out.println("1 – Cloreto de Potássio: ");
//    	correcaoRec.setCloretoPot(lerFontes.nextDouble());
//    	
//    	System.out.println("2 - Sulfato de Potássio: ");
//    	correcaoRec.setSultatoPot(lerFontes.nextDouble());
//    	
//    	System.out.println("3 – Sulf.Potássio/Mag.: ");
//    	correcaoRec.setSultatoPotMag(lerFontes.nextDouble());
//    	
//    	lerFontes.close();
//    	return correcaoRec;
//    
//    ;
    
    
    
}