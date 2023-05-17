/*
*NOME: GILDEAN MORAIS DA SILVA
*/
package thirdClass;

import javax.swing.JOptionPane;

public class Caneta {
    
    public String cor;
    public String marca;
    private Integer ponta;
    
    
    public void informacoes(){
        JOptionPane.showMessageDialog(null, "Marca: "+this.marca+""
                + "\nCor "+ this.cor);
    }
    
    public void escrever(){
    
    }
    
    
    
}
