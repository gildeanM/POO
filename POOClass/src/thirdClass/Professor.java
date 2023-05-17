/*
*NOME: GILDEAN MORAIS DA SILVA
*/
package thirdClass;

import javax.swing.JOptionPane;

public class Professor {
    
    public String disciplina;
    public String ensino;
    public String nome;
    private Double salario;
    
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
