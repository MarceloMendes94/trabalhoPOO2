package LN;

/**
 *
 * @author marcelo
 */
public class Conta {
    private String numeroConta;
    private String agencia;
    private String nomebanco;
    private String digito;

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomebanco() {
        return nomebanco;
    }

    public void setNomebanco(String nomebanco) {
        this.nomebanco = nomebanco;
    }

    public String getDigito() {
        return digito;
    }

    public void setDigito(String digito) {
        this.digito = digito;
    }

    public Conta(String numeroConta, String agencia, String nomebanco, String digito) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomebanco = nomebanco;
        this.digito = digito;
    }
    
}
