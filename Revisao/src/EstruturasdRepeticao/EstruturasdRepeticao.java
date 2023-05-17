/*

NOME: GILDEAN MORAIS DA SILVA

ESTRUTURAS DE REPETIÇÃO
FOR

for(variavel = valor1; variavel <= valorN; variavel += p ){

...
}

WHILE

while(condição){

...
}

DO...WHILE

do{

...
}while(condição)


*/
package EstruturasdRepeticao;

public class EstruturasdRepeticao {
    
    public static void main(String[] args) {
        
        int i = 0;
        int c = 1000;
//ESTRUTURA WHILE
        System.out.println("-----Par ou Impar?-----");
        while(i <= 1000){
        
            if(i % 2 == 0){
                
                System.out.println(i +" é par");
            }else{
                System.out.println(i +" é ímpar");
                
            }
            
        i++;
        }
//ESTRUTURA FOR
        System.out.println("-----Um a dez-----");
        for(; c >= 0; c--){
            System.out.println(c);
        }
    }
    
    
}
