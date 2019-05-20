package autopecas;

import autopecas.modelo.design_parttens.DiretorCliente;
import autopecas.modelo.design_parttens.FabricaProdutos;
import autopecas.pesistencia.Connection;
import java.util.Date;

public class Autopecas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FabricaProdutos f1 = new FabricaProdutos(1, "10 mm", "10 mm", "10 mm", "", "", 15.59f, 0, 0, 0, 0,"borsh",  "112212", "regulador" );
        //cadastrando um cliente
        Date d= new Date();        
        DiretorCliente d1 =new DiretorCliente(147, 306, 837, 14,"rua visconde de taunay", "29106080", "33", "", "px ao ricks burguer" ,"5545 0135 2457 8947","MARCELO P MENDES", d , "MASTERCARD","marcelo@gmail.com", "marcelo Passamai Mendes", d);
    }   
}
