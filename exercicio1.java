package com.mycompany.exercicio_estruturadecisao;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Divisão de dois numeros");
        System.out.println("Digite um numero");
        int num1 = sc.nextInt();
        System.out.println("Digite outro numero para ser dividido");
        int num2 = sc.nextInt();
        
        int total = num1 / num2;
        
        System.out.println("Total " + total);
    }
}
