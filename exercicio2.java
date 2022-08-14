package com.mycompany.exercicio_estruturadecisao;

import java.util.Scanner;
/**
 *
 * @author guilh
 */
public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1;
        int num2;
        
        
        int total;
        System.out.println("Media de notas\n");
        System.out.println("Digite a nota 1");
        num1 = sc.nextInt();
        System.out.println("Digite a nota 2");
        num2 = sc.nextInt();
       
        total = (num1 + num2) / 2;
        System.out.println("Media " + total);
        
        if(total >= 5){
            System.out.println("Aprovado");
        }
        
    }
}
