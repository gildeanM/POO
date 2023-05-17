
package firstClass;

import javax.swing.JOptionPane;

public class Carro {
    //ATRIBUTOS
    public String cor = "Vermelho";
    private Integer chassi;
    protected Double pot = 500.0;
    public String nome = "Fiat 147";
    
    //METODOS
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
