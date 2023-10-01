public class Break {

    public static void main(String[] args) {

        for (int numero = 0; numero <= 5; numero++) {

            if (numero == 3) 
                break; //Se o número for 3, a execução será parada

            System.out.println(numero);
        }

    }
}
