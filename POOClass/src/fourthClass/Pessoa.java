/*
*NOME: GILDEAN MORAIS DA SILVA
*/
package fourthClass;

import javax.swing.JOptionPane;

public class Pessoa {
    private String nome;
    private Integer idade;
    private Integer cpf;
    private Integer telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }
    
    
    
    
    public void informacoes(){
    JOptionPane.showMessageDialog(null, "Nome: "+this.nome+""
                + "\nIdade "+ this.idade
                +"\nTelefone "+this.telefone);
    }
    
    public void gritar(){
    
        JOptionPane.showMessageDialog(null, "AAAAAAAAAA");
    }
}
