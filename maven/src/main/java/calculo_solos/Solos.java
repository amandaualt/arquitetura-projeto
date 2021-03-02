package calculo_solos;

public class Solos {
	
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