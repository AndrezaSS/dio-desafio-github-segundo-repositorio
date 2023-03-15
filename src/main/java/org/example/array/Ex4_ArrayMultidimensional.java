package org.example.array;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/

import java.util.Random;
import java.util.Scanner;

public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        Random random = new Random();
//
//        int[][] array = new int[4][4];
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = random.nextInt(9);
//
//            }
//        }
//        System.out.println("Matriz: ");
//        for (int[] linha : array) {
//            for (int coluna : linha) {
//                System.out.print(coluna + " ");
//            }
//            System.out.println();
//        }
//
//    }
//}
        int num = 5, count = 1;
        while(count <= 3) {
            ++count;
            num += count;
        }
        System.out.println(num);



    }}