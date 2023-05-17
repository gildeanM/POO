
package firstClass;

import javax.swing.*;

public class Aluno {
    
    public String nome = "Victor";
    public String sexo = "Masculino";
    public String curso = "Informática";
    public Integer serie = 3;
    
    
    public void ler(){
        
        JOptionPane.showMessageDialog(null,"Sistemas operacionais modernos");
        
    }
    public Integer resolverAtividade(){
        
        int var1 = 1;
        int var2 = 2;
        int soma = var1+var2;
        
        return soma;
        
    }
    public void assistirVideo(){
        
        JOptionPane.showMessageDialog(null,"Fala aluno, vamos conferir como calcular a velocidade média de uma bola");
        
    }
    
            
            
}
