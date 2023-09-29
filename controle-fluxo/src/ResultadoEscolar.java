public class ResultadoEscolar {
    
    public static void main(String[] args) {
        int nota = 7;

        //if(nota >= 7){
            //System.out.println("Aprovado!");
        //} else if (nota < 7 && nota >= 5) {
            //System.out.println("Recuperação!");
        //} else {
            //System.out.println("Reprovado!");
        //}

        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado); //Se nota maior ou igual a 7, aprovado. Se não, reprovado.
    }
}
