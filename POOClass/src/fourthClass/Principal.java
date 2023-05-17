/*
*NOME: GILDEAN MORAIS DA SILVA
*/
package fourthClass;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        //Classe Carro
        JOptionPane.showMessageDialog(null, "Classe Carro");
        Carro c1 = new Carro();
        
        c1.setCor("Vermelho");
        c1.setNome("Uno");
        c1.setPot(1000.0);
        
        JOptionPane.showMessageDialog(null,c1.getCor());
        JOptionPane.showMessageDialog(null,c1.getNome());
        JOptionPane.showMessageDialog(null,c1.getPot());
       
        //Classe Pessoa
        JOptionPane.showMessageDialog(null, "Classe Pessoa");
        Pessoa p1 = new Pessoa();
        
        p1.setIdade(18);
        p1.setNome("Araújo");
        p1.setTelefone(999999999);
        p1.setCpf(1234567890);
        
     
 
        JOptionPane.showMessageDialog(null,p1.getIdade());
        JOptionPane.showMessageDialog(null,p1.getNome());
        JOptionPane.showMessageDialog(null,p1.getTelefone());
        JOptionPane.showMessageDialog(null,p1.getCpf());

        
        
        //Classe Caneta
        JOptionPane.showMessageDialog(null, "Classe Caneta");
        
        Caneta caneta = new Caneta();
        
        
        caneta.setPonta(10);
        caneta.setCor("Preta");
        caneta.setMarca("Bic");
        
        JOptionPane.showMessageDialog(null,caneta.getCor());
        JOptionPane.showMessageDialog(null,caneta.getMarca());
        JOptionPane.showMessageDialog(null,caneta.getPonta());
        
  
        
        
        //Classe Produto
        JOptionPane.showMessageDialog(null, "Classe Produto");
        
        Produto produto = new Produto();
       
        
        produto.setNome("Arroz");
        produto.setMarca("Antunes");
        produto.setQuantProduto(40);
        produto.setQuantVendido(20);

        JOptionPane.showMessageDialog(null,produto.getNome());
        JOptionPane.showMessageDialog(null,produto.getMarca());
        JOptionPane.showMessageDialog(null,produto.getQuantProduto());
        JOptionPane.showMessageDialog(null,produto.getQuantVendido());
        
        //Classe Professor
        JOptionPane.showMessageDialog(null, "Classe Professor");
        
        Professor professor = new Professor();
        
        professor.setDisciplina("Matemática");
        professor.setNome("Dias");
        professor.setEnsino("Médio");
        professor.setSalario(2_500.00);
        
        JOptionPane.showMessageDialog(null,professor.getNome());
        JOptionPane.showMessageDialog(null,professor.getDisciplina());
        JOptionPane.showMessageDialog(null,professor.getEnsino());
        JOptionPane.showMessageDialog(null,professor.getSalario());
        
        //Classe Fornecedor
        JOptionPane.showMessageDialog(null, "Classe Fornecedor");
        
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setProduto("Arroz");
        fornecedor.setPreco(10.00);
        fornecedor.setContato(889976854);
        
        JOptionPane.showMessageDialog(null, fornecedor.getProduto());
        JOptionPane.showMessageDialog(null,fornecedor.getPreco());
        JOptionPane.showMessageDialog(null,fornecedor.getContato());
  
        
    }

 
}
