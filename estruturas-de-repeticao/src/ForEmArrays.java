public class ForEmArrays {
    
    public static void main(String[] args) {
        
        String listaNomes [] = {"Claudia", "Paulo", "Raphaela", "Diego", "Shirley", "Edison", "Ekundayo", "Olayinka", "Abiola"};

        //Percorra o array e escreva todos os nomes que tem nele
        for (int contador = 0; contador < listaNomes.length; contador++){
            System.out.println("Posição " + contador + " Nome: " + listaNomes[contador] );
        }

        //Qual é o quarto nome da lista ? "Diego"
        for (int contador = 0; contador < listaNomes.length; contador++){
            if(contador == 3){
                System.out.println("O quarto nome da lista é: " + listaNomes[contador]);
            }
        }

    }
}
