package projeto_arquitetura.maven;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CorrecaoRecuperacaoFosforoTest {

    @Test
    public void testNessecidadeAdd() {
        assertEquals(11.41,
                new CorrecaoRecuperacaoFosforo().calculoNessecidadeAdd(20.0, 8.59));
    }

    @Test
    public void testTransformaMgDmEmKgHa() {
        assertEquals(22.82,
                new CorrecaoRecuperacaoFosforo().transformaMgDmEmKgHa(11.41));
    }

    @Test
    public void tesTtransformandoKgHaFosforoKgHaP2O5() {
        assertEquals(52.2578,
                new CorrecaoRecuperacaoFosforo().transformandoKgHaFosforoKgHaP2O5(22.82));
    }

    @Test
    public void tesCalculoNecessitamosFosforo() {
        assertEquals(74.65,
                new CorrecaoRecuperacaoFosforo().calculoNecessitamosFosforo(52.2578, 0.70), 0.1);
    }
    

    @Test
    public void testCalculoQuantidadeAplicar() {
        assertEquals(414.7222,
                new CorrecaoRecuperacaoFosforo().calculoQuantidadeAplicar(74.65, EnumFosforo.SUPERFOSTATO_SIMPLES.valorElement()), 0.1);
        assertEquals(177.7380,
                new CorrecaoRecuperacaoFosforo().calculoQuantidadeAplicar(74.65, EnumFosforo.SUPERFOSFATO_TRIPLO.valorElement()), 0.1);
        assertEquals(155.5208,
                new CorrecaoRecuperacaoFosforo().calculoQuantidadeAplicar(74.65, EnumFosforo.MAP.valorElement()), 0.1);
        assertEquals(165.8888,
                new CorrecaoRecuperacaoFosforo().calculoQuantidadeAplicar(74.65, EnumFosforo.DAP.valorElement()), 0.1);
        assertEquals(414.7222,
                new CorrecaoRecuperacaoFosforo().calculoQuantidadeAplicar(74.65, EnumFosforo.YOORIN.valorElement()), 0.1);
        assertEquals(226.2121,
                new CorrecaoRecuperacaoFosforo().calculoQuantidadeAplicar(74.65, EnumFosforo.FOSFATO_ARAD.valorElement()), 0.1);
        assertEquals(257.4137,
                new CorrecaoRecuperacaoFosforo().calculoQuantidadeAplicar(74.65, EnumFosforo.FOSFATO_GAFSA.valorElement()), 0.1);
        assertEquals(233.2812,
                new CorrecaoRecuperacaoFosforo().calculoQuantidadeAplicar(74.65, EnumFosforo.FOSFATO_DAOUI.valorElement()), 0.1);
        assertEquals(311.0416,
                new CorrecaoRecuperacaoFosforo().calculoQuantidadeAplicar(74.65, EnumFosforo.FOSF_PATOS_MINAS.valorElement()), 0.1);
        assertEquals(403.5135,
                new CorrecaoRecuperacaoFosforo().calculoQuantidadeAplicar(74.65, EnumFosforo.ESCORIA_DE_THOMAS.valorElement()), 0.1);
        assertEquals(143.5576,
                new CorrecaoRecuperacaoFosforo().calculoQuantidadeAplicar(74.65, EnumFosforo.ACIDO_FOSFORICO.valorElement()), 0.1);
        assertEquals(414.7222,
                new CorrecaoRecuperacaoFosforo().calculoQuantidadeAplicar(74.65, EnumFosforo.MULTIF_MAGNESIANO.valorElement()), 0.1);
    }
    
  @Test
    public void testMultiplicaQuantidadeAplicar() {
        assertEquals(1003.627724,
                new CorrecaoRecuperacaoFosforo().multiplicaQuantidadeAplicar(414.7222), 0.1);
        assertEquals(430.12596,
                new CorrecaoRecuperacaoFosforo().multiplicaQuantidadeAplicar(177.7380), 0.1);
        assertEquals(376.360336,
                new CorrecaoRecuperacaoFosforo().multiplicaQuantidadeAplicar(155.5208), 0.1);
        assertEquals(401.450896,
                new CorrecaoRecuperacaoFosforo().multiplicaQuantidadeAplicar(165.8888), 0.1);
        assertEquals(1003.627724,
                new CorrecaoRecuperacaoFosforo().multiplicaQuantidadeAplicar(414.7222), 0.1);
        assertEquals(547.433282,
                new CorrecaoRecuperacaoFosforo().multiplicaQuantidadeAplicar(226.2121), 0.1);
        assertEquals(622.941154,
                new CorrecaoRecuperacaoFosforo().multiplicaQuantidadeAplicar(257.4137), 0.1);
        assertEquals(564.540504,
                new CorrecaoRecuperacaoFosforo().multiplicaQuantidadeAplicar(233.2812), 0.1);
        assertEquals(752.720672,
                new CorrecaoRecuperacaoFosforo().multiplicaQuantidadeAplicar(311.0416), 0.1);
        assertEquals(976.50267,
                new CorrecaoRecuperacaoFosforo().multiplicaQuantidadeAplicar(403.5135), 0.1);
        assertEquals(347.409392,
                new CorrecaoRecuperacaoFosforo().multiplicaQuantidadeAplicar(143.5576), 0.1);
        assertEquals(1003.627724,
                new CorrecaoRecuperacaoFosforo().multiplicaQuantidadeAplicar(414.7222), 0.1);;
    }
    
    @Test
    public void testCalculoCustoPorHa() {
        assertEquals(290.11,
                new CorrecaoRecuperacaoFosforo().calculoCustoPorHa(699.50, 1003.627724), 01);
        assertEquals(56.87616,
                new CorrecaoRecuperacaoFosforo().calculoCustoPorHa(320, 430.12596), 01);
        assertEquals(429.26,
                new CorrecaoRecuperacaoFosforo().calculoCustoPorHa(2760, 376.360336), 01);
        assertEquals(64.45,
                new CorrecaoRecuperacaoFosforo().calculoCustoPorHa(388.5, 401.450896), 01);
        assertEquals(2654.36,
                new CorrecaoRecuperacaoFosforo().calculoCustoPorHa(6400, 1003.627724), 01);
        assertEquals(27.15,
                new CorrecaoRecuperacaoFosforo().calculoCustoPorHa(120, 547.433282), 01);
        assertEquals(136.44,
                new CorrecaoRecuperacaoFosforo().calculoCustoPorHa(530, 622.941154), 01);
        assertEquals(186.64,
                new CorrecaoRecuperacaoFosforo().calculoCustoPorHa(800, 564.540504), 01);
        assertEquals(161.75,
                new CorrecaoRecuperacaoFosforo().calculoCustoPorHa(520, 752.720672), 01);
        assertEquals(193.70,
                new CorrecaoRecuperacaoFosforo().calculoCustoPorHa(480, 976.50267), 01);
        assertEquals(295.74,
                new CorrecaoRecuperacaoFosforo().calculoCustoPorHa(2060, 347.409392), 01);
        assertEquals(1493.08,
                new CorrecaoRecuperacaoFosforo().calculoCustoPorHa(3600, 1003.627724), 01);
    }
}
