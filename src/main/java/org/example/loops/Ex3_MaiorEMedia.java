package org.example.loops;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

import java.util.Scanner;

public class Ex3_MaiorEMedia {

    //FIZ DESSA FORMA

 /*   public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("digite num1 : ");
        double num1 = teclado.nextInt();
        System.out.print("digite num2 : ");
        double num2 = teclado.nextInt();
        System.out.print("digite num3 : ");
        double num3 = teclado.nextInt();
        System.out.print("digite num4 : ");
        double num4 = teclado.nextInt();
        System.out.print("digite num5 : ");
        double num5 = teclado.nextInt();

        System.out.print("O maior número é : ");
        if (num1>num2  && num1>num3 && num1>num4 && num1>num5 ){
            System.out.println(num1);
        } else if (num2>num3  && num2>num4 && num2>num5) {
            System.out.println(num2);
        }else if (num3>num4  && num3>num5) {
            System.out.println(num3);
        }else if (num4>num5) {
            System.out.println(num4);
        } else {
            System.out.println(num5);
        }

        double media = (num1+num2+num3+num4+num5)/5;
        System.out.print("A média é : " + media);
    }
}*/

    //PROFESSORA FEZ DESSA FORMA

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            count = count + 1;
        } while(count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/5));

    }
}