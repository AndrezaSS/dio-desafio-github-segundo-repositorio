package org.example.loops;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;

        System.out.println("tabuada de : ");
        num = teclado.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(num + " X " + i + " = " + (num*i));


        }
    }
}
