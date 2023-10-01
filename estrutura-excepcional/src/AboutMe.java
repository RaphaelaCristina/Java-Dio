import java.util.InputMismatchException;
import java.util.Scanner;

public class AboutMe {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        /*try permite que você defina um bloco de código para ser testado quanto a erros 
         enquanto está sendo executado
        */

               
        try{
            
            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Olá, me chamo " + nome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + " cm");
        
            scanner.close();
        }
        /*cath permite definir um bloco de código a ser executado, caso ocorra um erro no
         bloco try
        */
        catch(InputMismatchException e){
            System.err.println("Os campos idade e altura precisam ser numéricos.");
        }

        /*cath permite definir um bloco de código a ser executado, caso ocorra um erro no
         bloco try
        */

        /*finally permite definir um bloco de código a ser executado independente de ocorrer 
         um erro ou não
        */
    }
}
