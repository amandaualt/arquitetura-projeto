package projeto_arquitetura.maven;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CorrecaoRecuperacaoPotassioTest {

    @Test
    public void testCalculoCTCCmolPotassio() {
        assertEquals(1.163692785,
                new CorrecaoRecuperacaoPotassio(0.15, 0.0).calculoCTCCmolPotassio(12.89), 0.1);
    }

    @Test
    public void testNecessidadePotassioAdd() {
        assertEquals(0.2379,
                new CorrecaoRecuperacaoPotassio(0.15, 3.0).necessidadePotassioAdd(1.16), 0.1);
    }

    @Test
    public void testCalculoCmolCm3KMgDm3() {
        assertEquals(89.93,
                new CorrecaoRecuperacaoPotassio(0.0, 0.0).calculoCmolCm3KMgDm3(0.23), 0.1);
    }

    @Test
    public void testCalculoMgDm3KgHa() {
        assertEquals(179.86,
                new CorrecaoRecuperacaoPotassio(0.0, 0.0).calculoMgDm3KgHa(89.93), 0.1);
    }

    @Test
    public void testCalculoKgHaKK2O() {
        assertEquals(215.832,
                new CorrecaoRecuperacaoPotassio(0.0, 0.0).calculoKgHaKK2O(179.86), 0.1);
    }

    @Test
    public void testCalculoConsiderandoEficaciaPotassio() {
        assertEquals(253.92,
                new CorrecaoRecuperacaoPotassio(0.0, 0.0).calculoConsiderandoEficaciaPotassio(215.832, 0.85), 0.1);
    }

    @Test
    public void testCalculoQuantidadeAplicar() {
        assertEquals(437.79,
                new CorrecaoRecuperacaoPotassio(0.0, 0.0).calculoQuantidadeAplicar(253.92, EnumPotassio.CLORETO_DE_POTASSIO.valorElement()), 0.1);
        assertEquals(488.30,
                new CorrecaoRecuperacaoPotassio(0.0, 0.0).calculoQuantidadeAplicar(253.92, EnumPotassio.SULFATO_DE_POTASSIO.valorElement()), 0.1);
        assertEquals(1154.18,
                new CorrecaoRecuperacaoPotassio(0.0, 0.0).calculoQuantidadeAplicar(253.92, EnumPotassio.SULFATO_DE_POTASSIO_E_MAGNESIO.valorElement()), 0.1);
        assertEquals(577.09,
                new CorrecaoRecuperacaoPotassio(0.0, 0.0).calculoQuantidadeAplicar(253.92, EnumPotassio.NITRATO_DE_POTASSIO.valorElement()), 0.1);

    }
       
    @Test
    public void testCalculoCustoPorHa() {
        assertEquals(1225.812,
                new CorrecaoRecuperacaoPotassio(0.0, 0.0).calculoCustoPorHa(2800, 437.79), 0.1);
        assertEquals(3476.696,
                new CorrecaoRecuperacaoPotassio(0.0, 0.0).calculoCustoPorHa(7120, 488.30), 0.1);
        assertEquals(8617.107876,
                new CorrecaoRecuperacaoPotassio(0.0, 0.0).calculoCustoPorHa(7466, 1154.18), 0.1);
        assertEquals(2308.36,
                new CorrecaoRecuperacaoPotassio(0.0, 0.0).calculoCustoPorHa(4000, 577.09), 0.1);

    }
}
