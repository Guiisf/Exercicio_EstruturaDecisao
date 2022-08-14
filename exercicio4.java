package com.mycompany.exercicio_estruturadecisao;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class exercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float peso,
                altura,
                IMC;

        System.out.println("===============================");
        System.out.println("        Calcule seu IMC        ");
        System.out.println("===============================");
        System.out.println("Digite o seu peso (EX:75,2):");
        peso = input.nextFloat();
        System.out.println("Digite sua altura (EX:1,80m):");
        altura = input.nextFloat();
        IMC = peso / (altura * altura);
        if (IMC < 17) {
            System.out.println("Muito abaixo do peso");
        } else if (IMC >= 17 && IMC < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (IMC >= 18.5 && IMC < 25) {
            System.out.println("Peso ideal");
        } else if (IMC >= 25 && IMC <= 30) {
            System.out.println("Sobre peso");
        } else if (IMC > 30 && IMC < 40) {
            System.out.println("Obesidade severa");
        } else if (IMC > 40) {
            System.out.println("Obesidade morbida");
        }
    }
}
