/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_parttens;

import logica_negocio.Boleto;
import logica_negocio.Conta;
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
public class DiretorBoletoTest {
    
    private DiretorBoleto diretorboleto;
        
    @Before
    public void setUp() {
        diretorboleto = new DiretorBoleto("00123781", "3007", "sicoob", "04", 50.00f , "00123781300704");
    }
    @Test
    public void testGetBb() {
        Boleto boleto;
        Conta conta =new  Conta("", "", "", "");
        boleto = new Boleto(0, "", conta);
        assertEquals(diretorboleto.getBb().getBoleto().getClass(), boleto.getClass());
    }
    
}
