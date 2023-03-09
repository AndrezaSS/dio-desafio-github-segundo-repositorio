package org.example.controledeFluxo;

public class ExercicioIf {

    //DECISÃO: if, if-else,if-else-if, switch e operador ternário ( ? : )
    //REPETIÇÃO: for, while, do while
    //INTERRUPÇÃO: break, continue e return
    public static void main(String[] args) {


        int mes = 2;

        if (mes == 1) {
            System.out.println("JANEIRO");
        } else if (mes == 2) {
            System.out.println("FEVEREIRO");
        } else if (mes == 3) {
            System.out.println("MARÇO");
        } else if (mes == 4) {
            System.out.println("ABRIL");
        }
        else if (mes == 5) {
            System.out.println("MAIO");
        }
        else if (mes == 6) {
            System.out.println("JUNHO");
        }
        else if (mes == 7) {
            System.out.println("JULHO");
        }
        else if (mes == 8) {
            System.out.println("AGOSTO");
        }
        else if (mes == 9) {
            System.out.println("SETEMBRO");
        }
        else if (mes == 10) {
            System.out.println("OUTUBRO");
        }
        else if (mes == 11) {
            System.out.println("NOVEMBRO");
        }
        else if (mes == 12) {
            System.out.println("DEZEMBRO");
        }
        if (mes == 7 || mes == 12 || mes == 1){
            System.out.println("FERIAS");
        }
    }
}

