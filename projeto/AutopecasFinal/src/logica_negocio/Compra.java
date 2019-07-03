
package logica_negocio;

import java.util.ArrayList;



/**
 *
 * @author marcelo
 */
public class Compra {
    private Status status;
    private ArrayList<Produto> listaProdutos;
    private float valor;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(ArrayList<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Compra(Status status, ArrayList<Produto> listaProdutos, float valor) {
        this.status = status;
        this.listaProdutos = listaProdutos;
        this.valor = valor;
    }
    
    
}
