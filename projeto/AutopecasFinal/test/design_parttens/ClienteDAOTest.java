package design_parttens;
import logica_negocio.Cliente;
import logica_negocio.Cpf;
import logica_negocio.Data;
import logica_negocio.Endereco;
import logica_negocio.Usuario;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
public class ClienteDAOTest {
    
    ClienteDAO clienteDao;
    public ClienteDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        clienteDao= new ClienteDAO();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of find method, of class ClienteDAO.
     */
    @Test
    public void testFind() {
        Cpf cpf = new Cpf(147, 306, 837, 14);
        Data nasc = new Data(01,06,1994);
        Usuario user = new Usuario("banana@email.com", "12345");
        Endereco end = new Endereco("minha rua", 29106080, "33", "casa", "esquina");
        Cliente cliente = new Cliente(end, nasc, "marcelo mendes", cpf, user);
        assertEquals(clienteDao.find().get(0).getClass(), cliente.getClass());
    }

    /**
     * Test of insert method, of class ClienteDAO.
     */
    @Test
    public void testInsert() {
       
    }

    /**
     * Test of update method, of class ClienteDAO.
     */
    @Test
    public void testUpdate() {
        
    }

    /**
     * Test of delete method, of class ClienteDAO.
     */
    @Test
    public void testDelete() {
      
    }

    /**
     * Test of transform method, of class ClienteDAO.
     */
    @Test
    public void testTransform() {
        
    }

    /**
     * Test of parseCliente method, of class ClienteDAO.
     */
    @Test
    public void testParseCliente() {
    }
    
}
