/*
*NOME: GILDEAN MORAIS DA SILVA
*/
package fourthClass;

import javax.swing.JOptionPane;

public class Professor {
    
    private String disciplina;
    private String ensino;
    private String nome;
    private Double salario;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getEnsino() {
        return ensino;
    }

    public void setEnsino(String ensino) {
        this.ensino = ensino;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    
    
    
    public void informacoes(){
    JOptionPane.showMessageDialog(null, "Nome: "+this.nome+""
                + "\nDisciplina "+ this.disciplina
                +"\nEnsino "+this.ensino);
    }
    
    public void lecionar(){
        if(this.disciplina.equalsIgnoreCase("matemática"))
    JOptionPane.showMessageDialog(null, "1 + 1 = 2");
    }
    
}
