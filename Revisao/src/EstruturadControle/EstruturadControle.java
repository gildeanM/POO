/*

NOME: GILDEAN MORAIS DA SILVA

ESTRUTURAS DE CONTROLE

IF

if(condição){

...
}

IF...ELSE

if(condição){

...
}else(
...
)

IF...ELSE IF

if(condição){
...
}else if(condição){
...
}


*/
package EstruturadControle;

import java.util.Scanner;
public class EstruturadControle {
    
    public static void main(String[] args) {
       
        int c = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("");
        do{
            
            if(c <= 500){
                System.out.println(c + " é menor que 500");
            }else if(c <= 1000){
                System.out.println(c + " é maior que 500");                
            }
       c++;
       }while(c <= 1000); 
        c = 0;
        
        System.out.print("Digite sua idade_");
       int idade = input.nextInt();
       if(idade < 18){
           System.out.println("Você é menor de idade");
       }else{
           System.out.println("Você é maior de idade");
       }
    }
    
}
