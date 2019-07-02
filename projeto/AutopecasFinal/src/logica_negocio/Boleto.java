package logica_negocio;

/**
 *
 * @author marcelo
 */
public class Boleto {
    private float valor;
    private String codigoBarras;
    private Conta conta;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Boleto(float valor, String codigoBarras, Conta conta) {
        this.valor = valor;
        this.codigoBarras = codigoBarras;
        this.conta = conta;
    }

}
