package design_parttens;

import LN.Fabricante;
import LN.Produto;
import LN.TipoProduto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marcelo
 */
public class FabricaAbsProdutosTest {
    
    FabricaAbsProdutos fabAbsProd;
    Fabricante fab ;
    Produto prod;    
    
    public FabricaAbsProdutosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        fab= new Fabricante("borsh", "001");
        prod = new Produto("50 mm", "50 mm", "70mm", "20 mm", "50", 0, 0, 0, fab, TipoProduto.BOBINA);
        fabAbsProd = new FabricaAbsProdutos();
        fabAbsProd.criarFabricante("borsh", "001");
        fabAbsProd.criarProduto("50 mm", "50 mm", "70mm", "20 mm", "50", 0, 0, 0, fabAbsProd.getFabricante(), TipoProduto.BOBINA);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of criarFabricante method, of class FabricaAbsProdutos.
     */
    @Test
    public void testCriarFabricante() {
        fabAbsProd.criarFabricante("mondial", "002");
        fabAbsProd.criarFabricante("ABS", "003");
    }

    /**
     * Test of criarProduto method, of class FabricaAbsProdutos.
     */
    @Test
    public void testCriarProduto() {
        fabAbsProd.criarProduto("50 mm", "50 mm", "70mm", "20 mm", "50", 0, 0, 0, fabAbsProd.getFabricante(), TipoProduto.BOBINA);
        fabAbsProd.criarProduto("50 mm", "50 mm", "70mm", "20 mm", "50", 0, 0, 0, fabAbsProd.getFabricante(), TipoProduto.ROTOR);
        fabAbsProd.criarProduto("50 mm", "50 mm", "70mm", "20 mm", "50", 0, 0, 0, fabAbsProd.getFabricante(), TipoProduto.POLIA);
        fabAbsProd.criarProduto("50 mm", "50 mm", "70mm", "20 mm", "50", 0, 0, 0, fabAbsProd.getFabricante(), TipoProduto.REGULADOR);
        fabAbsProd.criarProduto("50 mm", "50 mm", "70mm", "20 mm", "50", 0, 0, 0, fabAbsProd.getFabricante(), TipoProduto.ROLAMENTO);
    }

    /**
     * Test of getFabricante method, of class FabricaAbsProdutos.
     */
    @Test
    public void testGetFabricante() {
        assertEquals(fabAbsProd.getFabricante().getClass(), fab.getClass());
    }

    /**
     * Test of getProduto method, of class FabricaAbsProdutos.
     */
    @Test
    public void testGetProduto() { 
        assertEquals(fabAbsProd.getProduto().getClass(), prod.getClass());
    }
    
}
