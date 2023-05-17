/*
*NOME: GILDEAN MORAIS DA SILVA
*/
package thirdClass;

import javax.swing.JOptionPane;

public class Carro {

    public String cor = "Vermelho";
    private Integer chassi;
    protected Double pot = 500.0;
    public String nome = "Fiat 147";
    
    public void informacoes(){
    JOptionPane.showMessageDialog(null, "Nome: "+this.nome+""
                + "\nCor "+ this.cor
                +"\nPotência "+this.pot);
    }
    
    public void Acelerar(){
        JOptionPane.showMessageDialog(null,"Vrum Vrum! :)");
    }
    public void frear(){
        JOptionPane.showMessageDialog(null,"Stop please!!");
    }
    public void LigarFarol(){
        JOptionPane.showMessageDialog(null,"Farol ligado!");
    }
 
    
}