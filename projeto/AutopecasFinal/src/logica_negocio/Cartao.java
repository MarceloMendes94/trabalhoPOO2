package logica_negocio;

/**
 *
 * @author marcelo
 */
public class Cartao {
    private String numero;
    private String nomeTitular;
    private String bandeira;
    private Data vencimento;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public Data getVencimento() {
        return vencimento;
    }

    public void setVencimento(Data vencimento) {
        this.vencimento = vencimento;
    }

    public Cartao(String numero, String nomeTitular, String bandeira, Data vencimento) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.bandeira = bandeira;
        this.vencimento = vencimento;
    }
    
}
