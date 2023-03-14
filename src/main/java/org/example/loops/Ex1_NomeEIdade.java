package org.example.loops;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

import java.util.Scanner;

public class Ex1_NomeEIdade {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.println("NOME : ");
            nome = teclado.next();
            if(nome.equals("0"))
                break;

            System.out.println("IDADE : ");
            idade = teclado.nextInt();
        }
    }
}
