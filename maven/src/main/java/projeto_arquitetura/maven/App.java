package projeto_arquitetura.maven;

import java.util.Scanner;

import calculo_solos.*;

public class App {
	
   	Element elemento = new Element();

    public static void main(String[] args) {
    	DadosProdutor dadosProd = new DadosProdutor();
    	
    	App app = new App();
   
//    	dadosProd = DadosProdutor();
    	
    	app.elemento = app.elementRecebido();
    	 
    	System.out.println("S cmol: " + app.somaScmol(app.elemento));
    	
    	System.out.println("Ctc cmol: " + app.somaCtc(app.elemento));
    	
    	System.out.println("V% Atual: " + app.vAtual(app.elemento));
    }
    
    
    public Element elementRecebido() {    	
       	Element elemento = new Element();

    	Scanner lerElement = new Scanner(System.in);
    	
    	System.out.println("Digite o valor do Fósforo: ");
    	elemento.setFosforo(lerElement.nextDouble());
    	
    	System.out.println("Digite o valor do Potássio: ");
    	elemento.setPotassio(lerElement.nextDouble());
    	
    	System.out.println("Digite o valor do Cálcio: ");
    	elemento.setCalcio(lerElement.nextDouble());
    	
    	System.out.println("Digite o valor do Magnésio: ");
    	elemento.setMagnesio(lerElement.nextDouble());

    	System.out.println("Digite o valor do Enxofre: ");
    	elemento.setEnxofre(lerElement.nextDouble());
 
    	System.out.println("Digite o valor do Alumínio: ");
    	elemento.setAluminio(lerElement.nextDouble());

    	System.out.println("Digite o valor do H + Al: ");
    	elemento.sethAl(lerElement.nextDouble());
    	
    	lerElement.close();
    	return elemento;
    }
    
    
//    public DadosProdutor dadosRecebProp() {
//    	DadosProdutor dadosProd = new DadosProdutor();
//    	
//    	Scanner lerElement = new Scanner(System.in);
//    	
//    	System.out.println("Digite o valor do Fósforo: ");
//    	dadosProd.set(lerElement.nextDouble());
//    	
//    	System.out.println("Digite o valor do Potássio: ");
//    	elemento.setPotassio(lerElement.nextDouble());
//    	
//    	System.out.println("Digite o valor do Cálcio: ");
//    	elemento.setCalcio(lerElement.nextDouble());
//    	
//    	System.out.println("Digite o valor do Magnésio: ");
//    	elemento.setMagnesio(lerElement.nextDouble());
//
//    	System.out.println("Digite o valor do Enxofre: ");
//    	elemento.setEnxofre(lerElement.nextDouble());
// 
//    	System.out.println("Digite o valor do Alumínio: ");
//    	elemento.setAluminio(lerElement.nextDouble());
//
//    	System.out.println("Digite o valor do H + Al: ");
//    	elemento.sethAl(lerElement.nextDouble());
//    	
//    	lerElement.close();
//    	return dadosProd;
//    }
    
    
    public double somaScmol(Element elemento) {
    	return elemento.getPotassio() + elemento.getCalcio() + elemento.getMagnesio();
    }
    public double somaCtc(Element elemento) {
    	return somaScmol(elemento) + elemento.gethAl();
    }
    public double vAtual(Element elemento) {
    	return 100 * somaScmol(elemento) / somaCtc(elemento);
    }
    
    

    
    
}