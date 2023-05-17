
package firstClass;

import javax.swing.*;

public class Microondas {
    
    public String cor = "cinza";
    public String marca = "Philco";
    public Integer capacidade = 26;
    public Double preco = 599.90;
    
    
    public void girarPrato(){
    
        JOptionPane.showMessageDialog(null,"vuoum vuoum");
    
    }
    public void esquentar(){
    
    }
    public void cronomentrar(){
        
        int time = 30;
        for(int i = 0; i< time; i++){
            System.out.println(i);
        }
        
    }
    
    
    
    
}
