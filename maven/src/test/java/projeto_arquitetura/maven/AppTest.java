package projeto_arquitetura.maven;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    Elements elemento;
    
    @Test
    public void testValoresIdeaisArgiloso() {
        assertEquals( 
                new Elements(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getFosforo() , 
                Solos.Argisolo.calculaValoresIdeais().getFosforo());
        assertEquals( 
                new Elements(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getPotassio(), 
                Solos.Argisolo.calculaValoresIdeais().getPotassio());
        assertEquals( 
                new Elements(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getCalcio(), 
               Solos.Argisolo.calculaValoresIdeais().getCalcio());
        assertEquals( 
                new Elements(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getMagnesio(), 
               Solos.Argisolo.calculaValoresIdeais().getMagnesio());
         assertEquals( 
                new Elements(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getEnxofre(), 
                Solos.Argisolo.calculaValoresIdeais().getEnxofre());
        assertEquals( 
                new Elements(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).getAluminio(), 
                Solos.Argisolo.calculaValoresIdeais().getAluminio());
        assertEquals( 
                new Elements(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0).gethAl(), 
               Solos.Argisolo.calculaValoresIdeais().gethAl());
    }
    
    @Test
    public void testValoresIdeaisTextMedia() {
        assertEquals( 
                new Elements(12.0, 0.25, 4.0, 1.0, 6.0, 0.0, 0.0).getFosforo() , 
                Solos.TextMedia.calculaValoresIdeais().getFosforo());
        assertEquals( 
                new Elements(12.0, 0.25, 4.0, 1.0, 6.0, 0.0, 0.0).getPotassio(), 
                Solos.TextMedia.calculaValoresIdeais().getPotassio());
        assertEquals( 
                new Elements(12.0, 0.25, 4.0, 1.0, 6.0, 0.0, 0.0).getCalcio(), 
                Solos.TextMedia.calculaValoresIdeais().getCalcio());
        assertEquals( 
                new Elements(12.0, 0.25, 4.0, 1.0, 6.0, 0.0, 0.0).getMagnesio(), 
                Solos.TextMedia.calculaValoresIdeais().getMagnesio());
         assertEquals( 
                new Elements(12.0, 0.25, 4.0, 1.0, 6.0, 0.0, 0.0).getEnxofre(), 
                Solos.TextMedia.calculaValoresIdeais().getEnxofre());
        assertEquals( 
                new Elements(12.0, 0.25, 4.0, 1.0, 6.0, 0.0, 0.0).getAluminio(), 
                Solos.TextMedia.calculaValoresIdeais().getAluminio());
        assertEquals( 
                new Elements(12.0, 0.25, 4.0, 1.0, 6.0, 0.0, 0.0).gethAl(), 
                Solos.TextMedia.calculaValoresIdeais().gethAl());
    }
    
    @Test 
    public void testSomaSCmol(){
        assertEquals(7.54, new EquilibrioCTC().somaScmol(elemento));
    }
    
    @Test 
    public void testSomaCTCCmol(){
        assertEquals(12.89, new EquilibrioCTC().somaCtc(elemento));
    }
    
    @Test 
    public void testVAtual(){
        assertEquals(58.494957331264544, new EquilibrioCTC().vAtual(elemento));
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
