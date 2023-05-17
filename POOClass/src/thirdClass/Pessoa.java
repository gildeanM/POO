/*
*NOME: GILDEAN MORAIS DA SILVA
*/
package thirdClass;

import javax.swing.JOptionPane;

public class Pessoa {
    public String nome;
    public Integer idade;
    private Integer cpf;
    protected Integer telefone;
    
    public void informacoes(){
    JOptionPane.showMessageDialog(null, "Nome: "+this.nome+""
                + "\nIdade "+ this.idade
                +"\nTelefone "+this.telefone);
    }
    
    public void gritar(){
    
        JOptionPane.showMessageDialog(null, "AAAAAAAAAA");
    }
}
