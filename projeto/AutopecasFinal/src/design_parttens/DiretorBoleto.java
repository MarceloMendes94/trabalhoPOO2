
package design_parttens;

/**
 *
 * @author marcelo
 */
public class DiretorBoleto {
    private BuilderBoleto bb;

    public BuilderBoleto getBb() {
        return bb;
    }
    

    public DiretorBoleto(String numeroConta, String agencia, String nomebanco, String digito,float valor, String codigoBarras) {
        this.bb = new BuilderBoleto();
        this.bb.criarConta(numeroConta, agencia, nomebanco, digito);
        this.bb.criarBoleto(valor, codigoBarras);
    }
    
}
