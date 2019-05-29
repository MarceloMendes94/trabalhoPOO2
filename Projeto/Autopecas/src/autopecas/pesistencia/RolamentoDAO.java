package autopecas.pesistencia;

import java.util.ArrayList;

public class RolamentoDAO extends BaseDAO {
        String query="SELECT numeropeca, valor, altura,"
            + "largura, comprimento, diamentro_interno,"
            + "diamentro_externo, amperagem, voltagem, qte_sulcos,"
            + "qte_polos, fk_fabricante, fk_tipo_produto"
            +"FROM public.produto  WHERE  fk_tipo_produto==4;";
        
        public RolamentoDAO(){
            ArrayList<String> dados= new ArrayList<String>() ;
            dados=select(query);
        }
}
