package autopecas;

import autopecas.pesistencia.BobinaDAO;
import autopecas.pesistencia.PoliaDAO;
import autopecas.pesistencia.ReguladorDAO;
import autopecas.pesistencia.RolamentoDAO;
import autopecas.pesistencia.RotorDAO;

public class Autopecas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //estoque
        BobinaDAO       bobinaDao   = new BobinaDAO(); 
        PoliaDAO        poliaDao    = new PoliaDAO();
        ReguladorDAO    reguladorDao= new ReguladorDAO();
        RolamentoDAO    rolamentoDao= new RolamentoDAO(); 
        RotorDAO        rotorDao    = new RotorDAO();
        
        bobinaDao.carregarTodos();
        poliaDao.carregarTodos();
        reguladorDao.carregarTodos();
        rolamentoDao.carregarTodos();
        rotorDao.carregarTodos();
        
    
       
    }   
}