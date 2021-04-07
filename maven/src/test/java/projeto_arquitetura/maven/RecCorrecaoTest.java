package projeto_arquitetura.maven;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecCorrecaoTest {

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
                new CorrecaoRecuperacaoPotassio(0.0, 0.0).calculoQuantidadeAplicar(253.92, EnumPotassio.cloreto_de_potassio.valorElement()), 0.1);
        assertEquals(488.30,
                new CorrecaoRecuperacaoPotassio(0.0, 0.0).calculoQuantidadeAplicar(253.92, EnumPotassio.sulfato_de_potassio.valorElement()), 0.1);
        assertEquals(1154.18,
                new CorrecaoRecuperacaoPotassio(0.0, 0.0).calculoQuantidadeAplicar(253.92, EnumPotassio.sulfato_de_potassio_e_magnesio.valorElement()), 0.1);
        assertEquals(577.09,
                new CorrecaoRecuperacaoPotassio(0.0, 0.0).calculoQuantidadeAplicar(253.92, EnumPotassio.nitrato_de_potassio.valorElement()), 0.1);

    }
}
