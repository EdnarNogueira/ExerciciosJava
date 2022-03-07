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
        
        /*
        CRIE UM VETOR PARA ARMAZENAR 4 NOTAS DE 4 ALUNOS E 
        CALCULE A MEDIA DAS NOTAS        
        */
        
        Scanner teclado = new Scanner(System.in);
        
        // Coletando dados do usuário
        
        float Vet[] = new float[4];
        String alunos[] = new String[4];
        float media = 0;
        float soma = 0;
        
        for(int i = 0; i <= Vet.length ; i++){
            System.out.println("Informe o nome do " + (i+1)+"º Aluno");
            alunos[i] = teclado.nextLine();
            for(int j = 0;  j <= alunos.length -1; j++){
               System.out.println("Informe a " + (j+1) + "º Nota do " + (i+1)+"º Aluno");
               Vet[i] = teclado.nextFloat();
               soma = soma + Vet[i];              
               media = soma / 4;
                
           }//Mostrando os dados na tela
            teclado.nextLine();
            System.out.println("TOTAL DAS NOTAS" + soma);
            System.out.println("A MÉDIA DO " + (i+1) + " º Aluno é " + media);
        }
        
        
      
        
        
        
    }
}
