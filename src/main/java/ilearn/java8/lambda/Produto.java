package ilearn.java8.lambda;

/**
 * Classe que representa um produto que pode ser adicionado
 * como item ao carrinho de compras.
 *
 * Importante: Dois produtos s√£o considerados iguais quando ambos possuem o
 * mesmo c√≥digo.
 */
public class Produto {

    private Long codigo;
    private String descricao;

    /**
     * Construtor da classe Produto.
     *
     * @param codigo
     * @param descricao
     */
    public Produto(Long codigo, String descricao) {
    	this.codigo = codigo;
    	this.descricao = descricao;
    }

    /**
     * Retorna o c√≥digo da produto.
     *
     * @return Long
     */
    public Long getCodigo() {
    	return codigo;
    }

    /**
     * Retorna a descri√ß√£o do produto.
     *
     * @return String
     */
    public String getDescricao() {
    	return descricao;
    }
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "CÛdigo: " + codigo + " DescriÁ„o: " + descricao ;
    }
    
}