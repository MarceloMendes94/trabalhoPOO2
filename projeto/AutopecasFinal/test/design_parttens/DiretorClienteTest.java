package design_parttens;

import logica_negocio.Cliente;
import logica_negocio.Cpf;
import logica_negocio.Data;
import logica_negocio.Endereco;
import logica_negocio.Usuario;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marcelo
 */
public class DiretorClienteTest {
    
    private DiretorCliente dc; 
   
    @Before
    public void setUp() {
        dc= new DiretorCliente(147, 306, 837, 14, "banana@email.com", "12345" , "minha rua", 29106080, "33", "casa", "esquina", "marcelo mendes", 01, 06, 1994);
    }
    
    /**
     * Test of getBuildercliente method, of class DiretorCliente.
     */
    @Test
    public void testGetBuildercliente() {
        Cpf cpf = new Cpf(147, 306, 837, 14);
        Data nasc = new Data(01,06,1994);
        Usuario user = new Usuario("banana@email.com", "12345");
        Endereco end = new Endereco("minha rua", 29106080, "33", "casa", "esquina");
        Cliente cliente = new Cliente(end, nasc, "marcelo mendes", cpf, user);
        
        assertEquals(cliente.getClass(), dc.getBuildercliente().getCliente().getClass());
        
    }
    
}
