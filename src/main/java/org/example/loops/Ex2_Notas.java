package org.example.loops;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

import java.util.Scanner;

public class Ex2_Notas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int nota;

        System.out.println("Forneça uma nota entre 0 a 10");
        nota = teclado.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Diga uma nota entre 0 a 10 : ");
            nota = teclado.nextInt();
        }
    }
}
