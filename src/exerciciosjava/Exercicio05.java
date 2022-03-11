package exerciciosjava;

import java.util.Scanner;

public class Exercicio05 {
    
    public static void main(String[] args) {
        /*
     Crie um programa que imprima a tabuada do numero informado pelo
    usuário e a quantidade de calculos       
    */
    
    /* 
          RESPOSTA DO EXERCÍCIO 
        
       */
        
       Scanner teclado = new Scanner(System.in);
       
        System.out.println("INFORME UM NUMERO PARA CALCULAR A TABUADA ");
        int n1 = teclado.nextInt();
        System.out.println("INFORME A QUANTIDADE DE NUMEROS VOCE DESEJA CALCULAR");
        int n2 = teclado.nextInt();
        
        for(int i = 0; i <= n2; i++){
            System.out.println(n1 +"*"+ i +" = " + (n1 * i)); 
        }
        
        
    }
    
    
}    
