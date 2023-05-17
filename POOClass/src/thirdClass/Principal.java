/*
*NOME: GILDEAN MORAIS DA SILVA
*/
package thirdClass;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        //Classe Carro
        JOptionPane.showMessageDialog(null, "Classe Carro");
        Carro c1 = new Carro();
        c1.cor = "Vermelho";
        c1.nome = "Uno";
        c1.pot = 1000.0;
       
        c1.informacoes();
        c1.Acelerar();
        c1.frear();
        c1.LigarFarol();
       
        //Classe Pessoa
        JOptionPane.showMessageDialog(null, "Classe Pessoa");
        Pessoa p1 = new Pessoa();
        p1.idade = 18;
        p1.nome = "Araújo";
        p1.telefone = 999999999;

        p1.informacoes();
        p1.gritar();
        
        //Classe Caneta
        JOptionPane.showMessageDialog(null, "Classe Caneta");
        
        Caneta caneta = new Caneta();
        
        caneta.cor = "Preta";
        caneta.marca = "Bic";
        
        caneta.informacoes();
        caneta.escrever();
        
        
        //Classe Produto
        JOptionPane.showMessageDialog(null, "Classe Produto");
        
        Produto produto = new Produto();
        
        produto.nome = "Arroz";
        produto.marca = "Antunes";
        
        produto.informacoes();
        
        
        //Classe Professor
        JOptionPane.showMessageDialog(null, "Classe Professor");
        
        Professor professor = new Professor();
        
        professor.disciplina = "Matemática";
        professor.nome ="Dias";
        professor.ensino ="Médio";
        
        professor.informacoes();
        professor.lecionar();
        
        //Classe Fornecedor
        JOptionPane.showMessageDialog(null, "Classe Fornecedor");
        
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.produto = "Arroz";
        fornecedor.preco = 10.00;
        fornecedor.contato = 889976854;
        
        fornecedor.informacoes();
        
    }
}
