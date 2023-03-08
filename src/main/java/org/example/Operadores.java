package org.example;

public class Operadores {

    public static void main(String[] args) {

        String x = "Andreza";
        String y = "Santos";

        String nomeCompleto = "Andreza" + " " + "Santos";
        String nomeCompleto2 = x.concat(y);

        System.out.println(nomeCompleto);
        System.out.println(nomeCompleto2);

        //Exemplos:
        String concatenacao = "?";
        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);
    }
}
