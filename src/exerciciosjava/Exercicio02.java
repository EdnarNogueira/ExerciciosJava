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
public class Exercicio02 {
    public static void main(String[] args) {
        
        /* Crie um programa que leia o nome e o salário de um funcionário, mostrando no
         final uma mensagem.
         Ex:
         Nome do Funcionário: Maria do Carmo
         Salário: 1850,45
         O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.
        
        fonte: https://www.cursoemvideo.com/wp-content/uploads/2020/10/Exerci%CC%81cios-de-Algoritmos-1-100.pdf
        */
        
        // =========== RESPOSTA ===========
        
        // Criando " LEIA " no java para armazenar dado informado pelo usuário
        Scanner teclado = new Scanner(System.in); // não esquecer de adicionar a biblioteca Java.util.Scanner
        
        System.out.println("INFORME O NOME DO FUNCIONÁRIO(A)");// solicitando que o usuario informe o seu nome
        String nome = teclado.nextLine(); // armazenando o dado informado pelo usuario na variável nome
        
        System.out.println("INFORME O SALÁRIO DO FUNCIONÁRIO(A)");// solicitando que o usuario informe o salário
        float salario = teclado.nextFloat(); // armazenando o dado informado pelo usuario na variável salario
        
        System.out.println("O FUNCIONÁRIO " + nome + " TEM UM SALÁRIO DE " + salario); // concatenando texto com variáveis 
    }
            
}
