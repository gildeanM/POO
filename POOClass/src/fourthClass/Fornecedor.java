/*
*NOME: GILDEAN MORAIS DA SILVA
*/
package fourthClass;

import javax.swing.JOptionPane;

public class Fornecedor {
    
    private String produto;
    private long contato;
    private Integer quantProduzido;
    private Double preco;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public long getContato() {
        return contato;
    }

    public void setContato(long contato) {
        this.contato = contato;
    }

    public Integer getQuantProduzido() {
        return quantProduzido;
    }

    public void setQuantProduzido(Integer quantProduzido) {
        this.quantProduzido = quantProduzido;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    
    
    
    public void informacoes(){
    JOptionPane.showMessageDialog(null, "Produto: "+this.produto+""
                + "\nPreço "+ this.preco
                +"\nContato "+this.contato);
    }
    
    private void enviarProduto(){
    
    }
    
    
    
    
}
