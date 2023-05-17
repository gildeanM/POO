/*
*NOME: GILDEAN MORAIS DA SILVA
*/
package thirdClass;

import javax.swing.JOptionPane;

public class Fornecedor {
    
    public String produto;
    public long contato;
    private Integer quantProduzido;
    public Double preco;
    
    public void informacoes(){
    JOptionPane.showMessageDialog(null, "Produto: "+this.produto+""
                + "\nPreço "+ this.preco
                +"\nContato "+this.contato);
    }
    
    private void enviarProduto(){
    
    }
    
    
    
    
}
