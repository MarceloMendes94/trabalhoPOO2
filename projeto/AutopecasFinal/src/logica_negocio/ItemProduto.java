
package logica_negocio;

/**
 *
 * @author marcelo
 */
public class ItemProduto {
    private float valor;
    private Produto produto;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public ItemProduto(float valor, Produto produto) {
        this.valor = valor;
        this.produto = produto;
    }

    
}
