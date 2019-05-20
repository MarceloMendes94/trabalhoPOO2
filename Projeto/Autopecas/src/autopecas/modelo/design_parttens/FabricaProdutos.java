package autopecas.modelo.design_parttens;

import autopecas.modelo.Bobina;
import autopecas.modelo.Polia;
import autopecas.modelo.Regulador;
import autopecas.modelo.Rolamento;
import autopecas.modelo.Rotor;

public class FabricaProdutos {
    /*anemico*/
   public FabricaProdutos(int numeroPeca, String altura, String largura, String comprimento,
                          String diamentroInterno, String diamentroExterno, float valor, float amperagem,
                          float voltagem, int qte_polos, int qte_sulcos,String nome,  String numeroOEM, String nomeProduto ){
    if(nomeProduto.equals("bobina")){
        Bobina bobina = new Bobina(numeroPeca,altura, largura, comprimento, diamentroInterno, diamentroExterno, valor, amperagem, voltagem, qte_polos, nome,numeroOEM);
    }
    else if(nomeProduto.equals("regulador")){
        Regulador regulador = new Regulador( numeroPeca,  altura,  largura,  comprimento, diamentroInterno,  diamentroExterno,  valor,  amperagem, voltagem, nome,   numeroOEM);
        
    }else if(nomeProduto.equals("rolamento")){
        Rolamento rolamento = new Rolamento( numeroPeca, altura, largura, comprimento, diamentroInterno, diamentroExterno,  valor, amperagem,voltagem,  nome, numeroOEM) ;
        
    }else if(nomeProduto.equals("rotor")){
        Rotor rotor = new Rotor( numeroPeca,  altura,  largura,  comprimento, diamentroInterno, diamentroExterno, valor, amperagem,voltagem, nome,   numeroOEM);
        
    }else if(nomeProduto.equals("polia")){
        Polia polia = new Polia(numeroPeca,altura, largura, comprimento, diamentroInterno, diamentroExterno,  valor,  amperagem, voltagem, qte_sulcos, nome, numeroOEM);
    }
    else{
        System.out.println("operação invalida");
    }
    
   }
}
