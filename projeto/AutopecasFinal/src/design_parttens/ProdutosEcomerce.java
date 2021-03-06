package design_parttens;

import logica_negocio.Fabricante;
import logica_negocio.TipoProduto;

public interface ProdutosEcomerce {
    public void criarFabricante(String nome,String oem);
    public void criarProduto(String altura, String largura, String comprimento, String diametro_interno, String diametro_externo, float valor, float amperagem, float tensao, Fabricante fabricante, TipoProduto tipo);
}
