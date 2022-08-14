package com.mycompany.exercicio_estruturadecisao;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class exercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        int num1, num2, total;

        System.out.println("Calculadora Java de dois numeros\n");
        System.out.println("Escola uma opção da sua operação matematica\n");
        System.out.println("Selecione + para Soma\n Selecione - para Subtrair\n"
                + "Selecione * para Multiplicar\n Selecione / para Dividir\n"
                + "Selecione % para obter o Resto da Divisão\n ");
        choice = sc.nextLine();
        switch (choice) {

            case "+":
                System.out.println("Então vamos somar\n");
                System.out.println("Digite um numero");
                num1 = sc.nextInt();
                System.out.println("Digite outro numero para somar");
                num2 = sc.nextInt();
                total = (num1 + num2);
                System.out.println("Total da Soma = " + total);
                break;

            case "-":
                System.out.println("Então vamos subtrair\n");
                System.out.println("Digite um numero");
                num1 = sc.nextInt();
                System.out.println("Digite outro numero para subtrair");
                num2 = sc.nextInt();
                total = (num1 - num2);
                System.out.println("Total da Subtração = " + total);
                break;

            case "*":
                System.out.println("Então vamos multiplicar\n");
                System.out.println("Digite um numero");
                num1 = sc.nextInt();
                System.out.println("Digite outro numero para multiplicar");
                num2 = sc.nextInt();
                total = (num1 * num2);
                System.out.println("Total da multiplicação = " + total);
                break;

            case "/":
                System.out.println("Então vamos dividir\n");
                System.out.println("Digite um numero");
                num1 = sc.nextInt();
                System.out.println("Digite outro numero para dividir");
                num2 = sc.nextInt();
                total = (num1 / num2);
                System.out.println("Total da Divisão = " + total);
                break;

            case "%":
                System.out.println("Então vamos ver qual é o resto da divisão\n");
                System.out.println("Digite um numero");
                num1 = sc.nextInt();
                System.out.println("Digite outro numero para dividir");
                num2 = sc.nextInt();
                total = (num1 % num2);
                System.out.println("Resto da Divisão = " + total);
                break;

            default:
                System.out.println("operação inválida");

        }
    }
}
