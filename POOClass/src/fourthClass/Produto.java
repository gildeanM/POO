/*
*NOME: GILDEAN MORAIS DA SILVA
*/
package fourthClass;

import javax.swing.JOptionPane;

public class Produto {
    
    private Integer quantProduto;
    private String nome;
    private String marca;
    private Integer quantVendido;

    public Integer getQuantProduto() {
        return quantProduto;
    }

    public void setQuantProduto(Integer quantProduto) {
        this.quantProduto = quantProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getQuantVendido() {
        return quantVendido;
    }

    public void setQuantVendido(Integer quantVendido) {
        this.quantVendido = quantVendido;
    }
    
    
    
    
    
    public void informacoes(){
    
        JOptionPane.showMessageDialog(null, "Produto: "+this.nome+""
                + "\nMarca "+ this.marca);
        
    }
    
    private Integer quantEstoque(){
        int quantEstoque = quantProduto - quantVendido;
        
        return quantEstoque;
    }
    
}
