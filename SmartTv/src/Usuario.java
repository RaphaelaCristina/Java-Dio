public class Usuario {

    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada: " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Sattus -> " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> " + smartTv.ligada);

        smartTv.aumentarVolume();
        // System.out.println("Novo volume: " + smartTv.volume);

        smartTv.diminuirVolume();
        // System.out.println("Novo volume: " + smartTv.volume);

        smartTv.diminuirVolume();
        // System.out.println("Novo volume: " + smartTv.volume);

        smartTv.definirVolume(10);
        // System.out.println("Novo volume: " + smartTv.volume);

        smartTv.subirCanal();
        // System.out.println("Novo canal " + smartTv.canal);

        smartTv.descerCanal();
        // System.out.println("Novo canal " + smartTv.canal);

        smartTv.definirCanal(5);

        System.out.println("O volume da televisão está em " + smartTv.volume + " e o canal atual é " + smartTv.canal);

    }
}
