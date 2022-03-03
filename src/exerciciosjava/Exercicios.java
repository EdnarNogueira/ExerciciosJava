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
public class Exercicios {
    public static void main(String[] args) {
        // FUNÇÃO QUE RECEBE DADOS DE ENTRADA VIA TECLADO (LEIA)
        Scanner teclado = new Scanner(System.in); 
        
        // FUNÇÃO DE SAIDA DE DADOS NA TELA (ESCREVA)
        System.out.println(" Olá Mundo"); 
        
        // LAÇO DE REPETIÇÃO FOR (PARA) ESCREVENDO OLA MUNDO 10 VEZES NA TELA
        for(int i = 0; i <= 10 ; i++){
            System.out.println("Ola Mundo"); 
        }
    }
    
}
