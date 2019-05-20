package autopecas.modelo;

public class Bobina extends Produto{
    int qte_polos;

    public Bobina(int numeroPeca, String altura, String largura, String comprimento,
                          String diamentroInterno, String diamentroExterno, float valor, float amperagem,
                          float voltagem, int qte_polos,String nome,  String numeroOEM) {
        /*my code here*/
    }

    public int getQte_polos() {
        return qte_polos;
    }

    public void setQte_polos(int qte_polos) {
        this.qte_polos = qte_polos;
    }

    public int getNumeroPeca() {
        return numeroPeca;
    }

    public void setNumeroPeca(int numeroPeca) {
        this.numeroPeca = numeroPeca;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getLargura() {
        return largura;
    }

    public void setLargura(String largura) {
        this.largura = largura;
    }

    public String getComprimento() {
        return comprimento;
    }

    public void setComprimento(String comprimento) {
        this.comprimento = comprimento;
    }

    public String getDiamentroInterno() {
        return diamentroInterno;
    }

    public void setDiamentroInterno(String diamentroInterno) {
        this.diamentroInterno = diamentroInterno;
    }

    public String getDiamentroExterno() {
        return diamentroExterno;
    }

    public void setDiamentroExterno(String diamentroExterno) {
        this.diamentroExterno = diamentroExterno;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getAmperagem() {
        return amperagem;
    }

    public void setAmperagem(float amperagem) {
        this.amperagem = amperagem;
    }

    public float getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(float voltagem) {
        this.voltagem = voltagem;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
    
    
}
