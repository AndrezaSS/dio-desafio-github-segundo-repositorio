package projetoSmartTv;

public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 12;


    public boolean ligar() {
        return ligada = true;
    }
    public boolean desligar() {

        return ligada = false;
    }

    public int aumentarVolume() {
        return volume += 1;
    }

    public int diminuirVolume() {

        return volume -= 1;
    }

    public int mudarCanal(int novoCanal){
        return canal = novoCanal;
    }

    public int mudarCanalPositivo() {

        return canal += 1;
    }

    public int mudarCanalNegativo() {

        return canal -= 1;
    }

}
