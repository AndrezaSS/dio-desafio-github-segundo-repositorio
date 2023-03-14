package org.example.loops;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("digite um número : ");
        int num = teclado.nextInt();
        int fatorial = 1;


        for (int i = num; i >= 1; i--) {
            fatorial = fatorial *i;
        }
        System.out.print(num +"! = ");
        System.out.println(fatorial);
    }
}
