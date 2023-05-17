/*
*NOME: GILDEAN MORAIS DA SILVA
*/
package fourthClass;

import javax.swing.JOptionPane;

public class Caneta {
    
    private String cor;
    private String marca;
    private Integer ponta;

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getPonta() {
        return ponta;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPonta(Integer ponta) {
        this.ponta = ponta;
    }
    
    
    
    
    
    public void informacoes(){
        JOptionPane.showMessageDialog(null, "Marca: "+this.marca+""
                + "\nCor "+ this.cor);
    }
    
    public void escrever(){
    
    }
    
    
    
}
