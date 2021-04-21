package projeto_arquitetura.maven;

//Codigo feito com base no modelo do Professor Gabriel Costa Silva 

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    Elements elemento;
    
    @Test
    public void testValoresIdeaisArgiloso() {
        assertEquals( 
                new Elements(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getFosforo() , 
                TiposDeSolos.ARGILOSO.calculaValoresIdeais().getFosforo());
        assertEquals( 
                new Elements(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getPotassio(), 
                TiposDeSolos.ARGILOSO.calculaValoresIdeais().getPotassio());
        assertEquals( 
                new Elements(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getCalcio(), 
               TiposDeSolos.ARGILOSO.calculaValoresIdeais().getCalcio());
        assertEquals( 
                new Elements(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getMagnesio(), 
               TiposDeSolos.ARGILOSO.calculaValoresIdeais().getMagnesio());
         assertEquals( 
                new Elements(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getEnxofre(), 
                TiposDeSolos.ARGILOSO.calculaValoresIdeais().getEnxofre());
        assertEquals( 
                new Elements(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getAluminio(), 
                TiposDeSolos.ARGILOSO.calculaValoresIdeais().getAluminio());
        assertEquals( 
                new Elements(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).gethAl(), 
               TiposDeSolos.ARGILOSO.calculaValoresIdeais().gethAl());
    }
    
    @Test
    public void testValoresIdeaisTextMedia() {
        assertEquals( 
                new Elements(12.0, 0.25, 4.0, 1.0, 6.0, 0.0, 0.0).getFosforo() , 
                TiposDeSolos.TEXTURA_MEDIA.calculaValoresIdeais().getFosforo());
        assertEquals( 
                new Elements(12.0, 0.25, 4.0, 1.0, 6.0, 0.0, 0.0).getPotassio(), 
                TiposDeSolos.TEXTURA_MEDIA.calculaValoresIdeais().getPotassio());
        assertEquals( 
                new Elements(12.0, 0.25, 4.0, 1.0, 6.0, 0.0, 0.0).getCalcio(), 
                TiposDeSolos.TEXTURA_MEDIA.calculaValoresIdeais().getCalcio());
        assertEquals( 
                new Elements(12.0, 0.25, 4.0, 1.0, 6.0, 0.0, 0.0).getMagnesio(), 
                TiposDeSolos.TEXTURA_MEDIA.calculaValoresIdeais().getMagnesio());
         assertEquals( 
                new Elements(12.0, 0.25, 4.0, 1.0, 6.0, 0.0, 0.0).getEnxofre(), 
                TiposDeSolos.TEXTURA_MEDIA.calculaValoresIdeais().getEnxofre());
        assertEquals( 
                new Elements(12.0, 0.25, 4.0, 1.0, 6.0, 0.0, 0.0).getAluminio(), 
                TiposDeSolos.TEXTURA_MEDIA.calculaValoresIdeais().getAluminio());
        assertEquals( 
                new Elements(12.0, 0.25, 4.0, 1.0, 6.0, 0.0, 0.0).gethAl(), 
                TiposDeSolos.TEXTURA_MEDIA.calculaValoresIdeais().gethAl());
    }
    
    @Test 
    public void testSomaSCmol(){
        assertEquals(7.54, new EquilibrioCTC().somaScmol(0.15,5.76,1.63));
    }
    
    @Test 
    public void testSomaCTCCmol(){
        assertEquals(12.89, new EquilibrioCTC().somaCtcCmol(7.54, 5.35));
    }
    
    @Test 
    public void testVAtual(){
        assertEquals(58.494957331264544, new EquilibrioCTC().calculaVAtual(7.54,12.89));
    }

    @Test
    public void testCalcMOPercentual(){
        assertEquals(3.07, new EquilibrioCTC().MOPercentual(30.7));
    }

    @Test
    public void testSomaCarbono(){
        assertEquals(17.848837209302324, new EquilibrioCTC().somaCarbono(new EquilibrioCTC().MOPercentual(30.7)));
    }

}
