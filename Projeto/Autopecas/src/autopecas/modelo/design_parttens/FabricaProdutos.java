package autopecas.modelo.design_parttens;

import autopecas.modelo.Bobina;
import autopecas.modelo.Polia;
import autopecas.modelo.Regulador;
import autopecas.modelo.Rolamento;
import autopecas.modelo.Rotor;
import java.util.ArrayList;

public class FabricaProdutos {
   ArrayList<Bobina>     lista_bobina   = new ArrayList<Bobina> ();
   ArrayList<Regulador>  lista_regulador= new ArrayList<Regulador> ();
   ArrayList<Rolamento>  lista_rolamento= new ArrayList<Rolamento> ();
   ArrayList<Rotor>      lista_rotor    = new ArrayList<Rotor> ();
   ArrayList<Polia>      lista_polia    = new ArrayList<Polia> ();
   
   public void criarProduto(int numeroPeca, String altura, String largura, String comprimento, String diamentroInterno, String diamentroExterno, float valor, float amperagem, float voltagem, int qte_polos, int qte_sulcos,String nome,  String numeroOEM, String nomeProduto ){
    
    if(nomeProduto.equals("bobina")){
       Bobina bobina = new Bobina(numeroPeca,altura, largura, comprimento, diamentroInterno, diamentroExterno,valor, amperagem, voltagem, qte_polos, nome,numeroOEM);
       lista_bobina.add(bobina);
    }
    else if(nomeProduto.equals("regulador")){
        Regulador regulador = new Regulador( numeroPeca,  altura,  largura,  comprimento, diamentroInterno,diamentroExterno,  valor,  amperagem, voltagem, nome,   numeroOEM);
        lista_regulador.add(regulador);
        
    }else if(nomeProduto.equals("rolamento")){
        Rolamento rolamento = new Rolamento( numeroPeca, altura, largura, comprimento, diamentroInterno,diamentroExterno,  valor, amperagem,voltagem,  nome, numeroOEM);
        lista_rolamento.add(rolamento);
        
    }else if(nomeProduto.equals("rotor")){
        Rotor rotor = new Rotor( numeroPeca,  altura,  largura,  comprimento, diamentroInterno, diamentroExterno,valor, amperagem,voltagem, nome, numeroOEM);
        lista_rotor.add(rotor);
        
    }else if(nomeProduto.equals("polia")){
        Polia polia = new Polia(numeroPeca,altura, largura, comprimento, diamentroInterno, diamentroExterno, valor,amperagem, voltagem, qte_sulcos, nome, numeroOEM);
        lista_polia.add(polia);
    }
    else{
        System.out.println("operação invalida");
    }
   }
}
