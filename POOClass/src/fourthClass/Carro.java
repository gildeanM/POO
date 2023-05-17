/*
*NOME: GILDEAN MORAIS DA SILVA
*/
package fourthClass;

import javax.swing.JOptionPane;

public class Carro {

    private String cor = "Vermelho";
    private Integer chassi;
    private Double pot = 500.0;
    private String nome = "Fiat 147";

    public String getCor() {
        return cor;
    }

    public Integer getChassi() {
        return chassi;
    }

    public Double getPot() {
        return pot;
    }

    public String getNome() {
        return nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setChassi(Integer chassi) {
        this.chassi = chassi;
    }

    public void setPot(Double pot) {
        this.pot = pot;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    
    
    
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