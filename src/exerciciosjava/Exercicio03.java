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
public class Exercicio03 {
    public static void main(String[] args) {
        
        /*
        Escreva um algoritmo que solicite ao usuário 2 valores e 
        calcule soma, subtração, divisão e multiplicação dos valores informados
        imprimindo da tela.
        
        EX: A soma dos valores informados é de : 
            O diferença do valores informados é de:
            A multiplicação do valores informados é de:
            A divisão do valores informados é de:
        
         Obs. podem apresentar os dados da forma que acharem melhor.
        
        */
         Scanner teclado = new Scanner(System.in);
          
         System.out.println("INFORME O PRIMEIRO VALOR");
         int valor1 = teclado.nextInt();
         System.out.println("INFORM O SEGUNDO VALOR");
         int valor2 = teclado.nextInt();
        
         System.out.println("A SOMA DOS VALORES É DE " + (valor1 + valor2));
         System.out.println("A DIFERENÇA DOS VALORES É DE " + (valor1 - valor2));
         System.out.println("A MULTIPLICAÇÃO DOS VALORES É DE " + (valor1 * valor2));
         System.out.println("A DIVISÃO DOS VALORES É DE " + (valor1 / valor2));
    }
    
}
