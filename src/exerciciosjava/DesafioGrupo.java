/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosjava;

import java.util.Scanner;

/**
 *
 * @author User
 * 
 *
 */
public class DesafioGrupo {
    
     
    
    public static void main(String[] args) {
        /*
         FAÇA UM PROGRAMA QUE MOSTRE TODOS OS NUMEROS PRIMOS ENTRE 1 E N
         SENDO N UM NUMERO INTEIRO FORNECIDO PELO USUÁRIO. O PROGRAMA DEVERÁ 
         MOSTRAR TAMBÉM O NUMERO DE DIVISÕES QUE ELE EXECUTOU PARA ENCONTRAR 
         OS NUMERO PRIMOS.       
        */
        
        //=============RESPOSTA====================
        
      int primo = 0; // Inicializando a variável primo
      Scanner teclado = new Scanner(System.in);
      System.out.println("INFORME O VALOR MAXIMO"); // solicitando o valor maximo do usuário      
      int n = teclado.nextInt(); // Atribuindo o valor do usuário na variável n
        
      for(int i = 1; i <= n ; i++){ // primeiro laço de repetição iniciando em 1 e indo ate o valor de n
        for(int j = 1; j <= i ; j++){ // segundo laço iniciando em 1 indo ate quando for menor que i
            if(i % j == 0){ // comparando se o resto da divisão da posição i pela posição j resulta em 0
                 primo++; // a variável primo e incrementada caso a divisão não tenha sobra
            }
        }
        
        if(primo == 2){ // testando condição do valor recebido pela variável primo
            System.out.println("O numero " + i + " é Primo");
        }
        
        primo = 0;
    }
        
        
        
        
    }
    
    
}
