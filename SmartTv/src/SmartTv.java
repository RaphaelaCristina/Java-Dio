public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume ++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume() {
        volume --;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void definirVolume(int novoVolume) {
        volume = novoVolume;
        System.out.println("Mudando o volume para: " + volume);
    }

    public void definirCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Mudando para o canal: " + canal);
    }

    public void subirCanal(){
        canal++;
        System.out.println("Subindo canal para: " + canal);
    }

    public void descerCanal(){
        canal--;
        System.out.println("Descendo canal para: " + canal);
    }
}
