package projeto_arquitetura.maven;

import java.util.Scanner;
import calculo_solos.Element;


public class App {
    
    public static void main(String[] args) {

    }

    
    public void dadosReceber() {
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
    }
}