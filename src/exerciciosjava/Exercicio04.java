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
 */
public class Exercicio04 {
     public static void main(String[] args) {
        
        // Coletando dados do usuário
         /*
        CRIE UM VETOR PARA ARMAZENAR 4 NOTAS DE 4 ALUNOS E
        CALCULE A MEDIA DAS NOTAS
        */
       Scanner teclado = new Scanner(System.in);
       
       String nome[] = new String[4];
       float notas[] = new float[4];
       int i , j , l ;
       
              
       for(i = 0; i <= nome.length; i++){           
        System.out.println("DIGITE OS NOMES");
        nome[i] = teclado.nextLine();
        for(j = 0; j <= nome.length;j++){
            System.out.println(".,.,.,.,.,.,.,.,.");
            System.out.println("J " + j);
            System.out.println("I" + i);
        }
       }
       
         
       
         
         
}

}
    
   
