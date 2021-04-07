package projeto_arquitetura.maven;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    Elements elemento;
    
    @Test
    public void testValoresIdeaisArgiloso() {
        assertEquals( 
                new Elements(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getFosforo() , 
                Solos.ARGILOSO.calculaValoresIdeais().getFosforo());
        assertEquals( 
                new Elements(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getPotassio(), 
                Solos.ARGILOSO.calculaValoresIdeais().getPotassio());
        assertEquals( 
                new Elements(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getCalcio(), 
               Solos.ARGILOSO.calculaValoresIdeais().getCalcio());
        assertEquals( 
                new Elements(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getMagnesio(), 
               Solos.ARGILOSO.calculaValoresIdeais().getMagnesio());
         assertEquals( 
                new Elements(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getEnxofre(), 
                Solos.ARGILOSO.calculaValoresIdeais().getEnxofre());
        assertEquals( 
                new Elements(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getAluminio(), 
                Solos.ARGILOSO.calculaValoresIdeais().getAluminio());
        assertEquals( 
                new Elements(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).gethAl(), 
               Solos.ARGILOSO.calculaValoresIdeais().gethAl());
    }
    
    @Test
    public void testValoresIdeaisTextMedia() {
        assertEquals( 
                new Elements(12.0, 0.25, 4.0, 1.0, 6.0, 0.0, 0.0).getFosforo() , 
                Solos.TEXTURA_MEDIA.calculaValoresIdeais().getFosforo());
        assertEquals( 
                new Elements(12.0, 0.25, 4.0, 1.0, 6.0, 0.0, 0.0).getPotassio(), 
                Solos.TEXTURA_MEDIA.calculaValoresIdeais().getPotassio());
        assertEquals( 
                new Elements(12.0, 0.25, 4.0, 1.0, 6.0, 0.0, 0.0).getCalcio(), 
                Solos.TEXTURA_MEDIA.calculaValoresIdeais().getCalcio());
        assertEquals( 
                new Elements(12.0, 0.25, 4.0, 1.0, 6.0, 0.0, 0.0).getMagnesio(), 
                Solos.TEXTURA_MEDIA.calculaValoresIdeais().getMagnesio());
         assertEquals( 
                new Elements(12.0, 0.25, 4.0, 1.0, 6.0, 0.0, 0.0).getEnxofre(), 
                Solos.TEXTURA_MEDIA.calculaValoresIdeais().getEnxofre());
        assertEquals( 
                new Elements(12.0, 0.25, 4.0, 1.0, 6.0, 0.0, 0.0).getAluminio(), 
                Solos.TEXTURA_MEDIA.calculaValoresIdeais().getAluminio());
        assertEquals( 
                new Elements(12.0, 0.25, 4.0, 1.0, 6.0, 0.0, 0.0).gethAl(), 
                Solos.TEXTURA_MEDIA.calculaValoresIdeais().gethAl());
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
        assertEquals(58.494957331264544, new EquilibrioCTC().vAtual(7.54,12.89));
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
