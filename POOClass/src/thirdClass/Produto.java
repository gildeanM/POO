/*
*NOME: GILDEAN MORAIS DA SILVA
*/
package thirdClass;

import javax.swing.JOptionPane;

public class Produto {
    
    private Integer quantProduto;
    public String nome;
    public String marca;
    private Integer quantVendido;
    
    public void informacoes(){
    
        JOptionPane.showMessageDialog(null, "Produto: "+this.nome+""
                + "\nMarca "+ this.marca);
        
    }
    
    private Integer quantEstoque(){
        int quantEstoque = quantProduto - quantVendido;
        
        return quantEstoque;
    }
    
}
