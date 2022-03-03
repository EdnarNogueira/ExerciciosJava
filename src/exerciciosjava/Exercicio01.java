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
public class Exercicio01 {
    public static void main(String[] args) {
        
        /*
        [DESAFIO]  Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela:
         Ex:
         Qual é o seu nome? João da Silva
         Olá João da Silva, é um prazer te conhecer!     
        */
       Scanner teclado = new Scanner(System.in);
       
        System.out.println("Qual é o seu Nome :");
        String nome = teclado.nextLine();
        
        System.out.println("Olá " + nome + ", é um pazer te conhecer");
        
        
    }
}
