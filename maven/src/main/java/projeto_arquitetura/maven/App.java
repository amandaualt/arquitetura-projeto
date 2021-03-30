package projeto_arquitetura.maven;

import java.util.Scanner;

import calculo_solos.*;

public class App {
	
	CorrecaoRecuperacao correcaoRec = new CorrecaoRecuperacao();
   	Element elemento = new Element();

    public static void main(String[] args) {
    	DadosProdutor dadosProd = new DadosProdutor();
    	
    	App app = new App();
   
//    	dadosProd = app.dadosRecebProp();
    	
    	app.elemento = app.elementRecebido();
    	app.correcaoRec = app.correcaoFosf();
    	 
    	System.out.println("S cmol: " + app.somaScmol(app.elemento));
    	
    	System.out.println("Ctc cmol: " + app.somaCtc(app.elemento));
    	
    	System.out.println("V% Atual: " + app.vAtual(app.elemento));
    }
    
    
    public Element elementRecebido() {    	
       	Element elemento = new Element();

    	Scanner lerDadosProdutor = new Scanner(System.in);
    	
    	System.out.println("Digite o valor do Fósforo: ");
    	elemento.setFosforo(lerDadosProdutor.nextDouble());
    	
    	System.out.println("Digite o valor do Potássio: ");
    	elemento.setPotassio(lerDadosProdutor.nextDouble());
    	
    	System.out.println("Digite o valor do Cálcio: ");
    	elemento.setCalcio(lerDadosProdutor.nextDouble());
    	
    	System.out.println("Digite o valor do Magnésio: ");
    	elemento.setMagnesio(lerDadosProdutor.nextDouble());

    	System.out.println("Digite o valor do Enxofre: ");
    	elemento.setEnxofre(lerDadosProdutor.nextDouble());
 
    	System.out.println("Digite o valor do Alumínio: ");
    	elemento.setAluminio(lerDadosProdutor.nextDouble());

    	System.out.println("Digite o valor do H + Al: ");
    	elemento.sethAl(lerDadosProdutor.nextDouble());
    	
    	lerDadosProdutor.close();
    	return elemento;
    }
    
    
    public DadosProdutor dadosRecebProp() {
    	DadosProdutor dadosProd = new DadosProdutor();
    	
    	Scanner lerDadosProdutor = new Scanner(System.in);
    	
    	System.out.println("Nome do Produtor: ");
    	dadosProd.setNomeProdutor(lerDadosProdutor.next());
    	
    	System.out.println("Data: : ");
    	dadosProd.setDataProdutor(lerDadosProdutor.next());
    	
    	System.out.println("Municipio: ");
    	dadosProd.setMunicipio(lerDadosProdutor.next());
    	
     	System.out.println("Área total: ");
    	dadosProd.setAreaTotal(lerDadosProdutor.nextDouble());
 
    	System.out.println("Talhão: ");
    	dadosProd.setTalhao(lerDadosProdutor.nextInt());

    	System.out.println("Área Talhão: ");
    	dadosProd.setAreaTalhao(lerDadosProdutor.nextDouble());

    	System.out.println("Matrícula do Lote: ");
    	dadosProd.setMatriculaLote(lerDadosProdutor.nextInt());

    	System.out.println("Textura de Solo: ");
    	dadosProd.setTexturaSolo(lerDadosProdutor.nextInt());

    	System.out.println("Sistema de Cultivo: ");
    	dadosProd.setSistemaCultivo(lerDadosProdutor.nextInt());
    	
    	System.out.println("Responsável Técnico: ");
    	dadosProd.setRespTecnico(lerDadosProdutor.next());
    	
     	System.out.println("Produnfidade da amostra de solos: ");
    	dadosProd.setProfundAmostra(lerDadosProdutor.nextDouble());
    	
    	System.out.println("Resultado da análise de solos Nº: ");
    	dadosProd.setNumAnalise(lerDadosProdutor.nextInt());
    	
    	lerDadosProdutor.close();
    	return dadosProd;
    }
    
    
       public double somaScmol(Element elemento) {
    	return elemento.getPotassio() + elemento.getCalcio() + elemento.getMagnesio();
    }
    public double somaCtc(Element elemento) {
    	return somaScmol(elemento) + elemento.gethAl();
    }
    public double vAtual(Element elemento) {
    	return 100 * somaScmol(elemento) / somaCtc(elemento);
    }
    
    
    public CorrecaoRecuperacao correcaoFosf() {
    	CorrecaoRecuperacao correcaoRec = new CorrecaoRecuperacao();
    	Scanner lerCorrecao = new Scanner(System.in);
    	
    	System.out.println("Teor de Fósforo a atingir: ");
    	correcaoRec.setTeorFosfAtingir(lerCorrecao.nextDouble());
    	
    	System.out.println("Fonte de Fósforo a utilizar: ");
    	correcaoRec.setFonteFosfUtilizar(lerCorrecao.nextInt());
    	
    	System.out.println("Eficiência do Fósforo %: ");
    	correcaoRec.setEficienciaFosf(lerCorrecao.nextDouble());
    	
    	lerCorrecao.close();
    	return correcaoRec;
    }
    
    
    public CorrecaoRecuperacao fontesFosf() {
    	CorrecaoRecuperacao correcaoRec = new CorrecaoRecuperacao();
    	Scanner lerFontes = new Scanner(System.in);
    	
    	System.out.println("1 – Superfosfato Simples: ");
    	correcaoRec.setSuperFofatoSimples(lerFontes.nextDouble());
    	
    	System.out.println("2 – Superfosfato Triplo: ");
    	correcaoRec.setSuperFofatoTriplo(lerFontes.nextDouble());
    	
    	System.out.println("3 – MAP: ");
    	correcaoRec.setMap(lerFontes.nextDouble());
    	
    	System.out.println("4 – DAP: ");
    	correcaoRec.setDap(lerFontes.nextDouble());
    	
    	System.out.println("5 – Yoorin: ");
    	correcaoRec.setYoorin(lerFontes.nextDouble());
    	
    	System.out.println("6 – Fosfato  Arad: ");
    	correcaoRec.setFosfatoArad(lerFontes.nextDouble());
    	
    	System.out.println("7 – Fosfato  Gafsa: ");
    	correcaoRec.setFosfatoGafsa(lerFontes.nextDouble());
    	
    	System.out.println("8 – Fosfato  Daoui: ");
    	correcaoRec.setFosfatoDaoui(lerFontes.nextDouble());
    	
    	System.out.println("9 - Fosf.  Patos Minas: ");
    	correcaoRec.setFosfPatosMinas(lerFontes.nextDouble());
    	
    	System.out.println("10 – Escória de Thomas: ");
    	correcaoRec.setEscoriaThomaso(lerFontes.nextDouble());
    	
    	System.out.println("11 – Ácido Fosfórico: ");
    	correcaoRec.setAcidoFosforico(lerFontes.nextDouble());
    	
    	System.out.println("12 – Multif.Magnesiano: ");
    	correcaoRec.setMultifMag(lerFontes.nextDouble());
    	
    	lerFontes.close();
    	return correcaoRec;
    }
    
    public CorrecaoRecuperacao correcaoPot() {
    	CorrecaoRecuperacao correcaoRec = new CorrecaoRecuperacao();
    	Scanner lerCorrecao = new Scanner(System.in);
    	
    	System.out.println("Participação do Potássio na CTC, desejada:  ");
    	correcaoRec.setPotCtcDesj(lerCorrecao.nextDouble());
    	
    	System.out.println("Fonte de Potássio a usar: ");
    	correcaoRec.setFontPotUsar(lerCorrecao.nextInt());
    	
    	lerCorrecao.close();
    	return correcaoRec;
    	
    }
    
    

    
    
}