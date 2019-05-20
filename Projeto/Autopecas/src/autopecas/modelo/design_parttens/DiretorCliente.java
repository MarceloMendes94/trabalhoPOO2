package autopecas.modelo.design_parttens;

import java.util.Date;

public class DiretorCliente {
    BuilderCliente cliente = new BuilderCliente();
    public DiretorCliente(int primeiro, int segundo, int terceiro, int verificador,String logradouro, String cep, String numero, String complemento, String referencia,String numeroc, String nomeTitular, Date vencimento, String Bandeira,String email, String nome, Date nascimento){
    // criar um CPF
    cliente.CriarCpf( primeiro,  segundo,  terceiro, verificador);
    //Criar um endereço
    cliente.CriarEndereco(logradouro, cep, numero, complemento, referencia);
    //Criar cartão
    cliente.CriarCartao(numeroc, nomeTitular, vencimento, Bandeira);
    //Criar um cliente (email, Pessoa, Endereço ) 
    cliente.CriarCliente(email, nome, nascimento);
    }
   
}
