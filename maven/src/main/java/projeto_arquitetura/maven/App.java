package projeto_arquitetura.maven;

import java.util.Scanner;
import calculo_solos.Element;


public class App {
	
   	Element elemento = new Element();

    public static void main(String[] args) {
    	App app = new App();
    	
    	app.elemento = app.dadosRecebidos();
    	
    	System.out.println("potassio: " + app.elemento.getPotassio());
 
    	System.out.println("Soma: " + app.somaScmol(app.elemento));
    	
    	System.out.println("Soma Ctc: " + app.somaCtc(app.elemento));
    	
    	System.out.println("V% Atual: " + app.vAtual(app.elemento));
    }
    
    
    public Element dadosRecebidos() {    	
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
    
    public double somaScmol(Element elemento) {
    	return elemento.getPotassio() + elemento.getCalcio() + elemento.getMagnesio();
    }
    public double somaCtc(Element elemento) {
    	return somaScmol(elemento) + elemento.gethAl();
    }
    public double vAtual(Element elemento) {
    	return 100 * somaScmol(elemento) / somaCtc(elemento);
    }
    
    
	private Element soloIdeal(int tipoSolo) {
		Element elemento = new Element();
		switch (tipoSolo) {
			case 1:
				elemento.setFosforo(9.0);
				elemento.setPotassio(0.35);
				elemento.setCalcio(6.0);
				elemento.setMagnesio(1.5);
				elemento.setEnxofre(9.0);
				elemento.setAluminio(0);
				elemento.sethAl(0);
				return elemento;
			case 2:
				elemento.setFosforo(12.0);
				elemento.setPotassio(0.25);
				elemento.setCalcio(6.0);
				elemento.setMagnesio(1.5);
				elemento.setEnxofre(9.0);
				elemento.setAluminio(0);
				elemento.sethAl(0);
				return elemento;
			default:
				System.out.println("Digite um solo válido");
				return elemento;
		}
	}
    
    
}