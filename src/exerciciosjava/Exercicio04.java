/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosjava;

import java.util.Arrays;
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
         int i, j ,k;
         float notas[] = new float[4];
         String alunos[] = new String[4];
         
         for(i = 0; i <= alunos.length -1; i++){
             System.out.println("INFORME OS NOMES DOS ALUNOS");
             alunos[i] = teclado.nextLine();
             System.out.println("INFORME AS NOTAS DOS ALUNOS");
             notas[i] = teclado.nextInt();
          }
         
         
          for(String valor : alunos){
             System.out.print(valor);
         }
         
         
         
         
        }
       }
       
         
