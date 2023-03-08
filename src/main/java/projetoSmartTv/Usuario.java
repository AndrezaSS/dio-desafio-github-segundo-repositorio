package projetoSmartTv;

public class Usuario {

    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

         System.out.println("Tv ta ligada? : " + smartTv.ligada);
         System.out.println("o volume é : " + smartTv.volume);
         System.out.println("o canal é : " + smartTv.canal);

         smartTv.ligar();
        System.out.println("novo status da TV:" + smartTv.ligada);


        smartTv.aumentarVolume();
        System.out.println("novo volume da TV: " + smartTv.volume);

        smartTv.mudarCanalPositivo();
        System.out.println("novo canal da TV é : " + smartTv.canal);

        smartTv.mudarCanalNegativo();
        System.out.println("novo canal da TV é : " + smartTv.canal);

        smartTv.mudarCanal(101);
        System.out.println("novo canal da TV mudando é : " + smartTv.canal);

        smartTv.mudarCanalPositivo();
        System.out.println("novo canal da TV é : " + smartTv.canal);
    }
}
