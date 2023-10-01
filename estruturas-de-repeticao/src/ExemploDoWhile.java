import java.util.Random;

public class ExemploDoWhile {
      public static void main(String[] args) {

        //Enquanto o número não for 10, imprima o número. Quando ele for 10, imprima "Achou o número 10".

        do {
            System.out.println("gerando número");
        } while (gerarNumero());
        
        System.out.println("Você achou o número 10!");

    }

    public static boolean gerarNumero(){
        boolean ehDez = new Random().nextInt(20)==10;  
        System.out.println("O número é igual a 10 ? " + ehDez);     
        return !ehDez; //Negando o ato de gerar número
    }
}
