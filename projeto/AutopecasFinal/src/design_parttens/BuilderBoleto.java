package design_parttens;

import logica_negocio.Boleto;
import logica_negocio.Conta;

public class BuilderBoleto {
    private Boleto boleto;
    private Conta conta;
    
    public void criarConta(String numeroConta, String agencia, String nomebanco, String digito){
        this.conta= new Conta(numeroConta, agencia, nomebanco, digito);
    }
    public void criarBoleto(float valor, String codigoBarras){
        this.boleto= new Boleto(valor, codigoBarras, this.conta);
    }

    public Boleto getBoleto() {
        return boleto;
    }

    public Conta getConta() {
        return conta;
    }
    
    
}
