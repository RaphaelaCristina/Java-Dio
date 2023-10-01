package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    
    public static void main(String[] args) {
        System.out.println("*********************************************");
        System.out.println("              PROCESSO SELETIVO               ");
        System.out.println("*********************************************");

        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        //System.out.println("Imprimindo a lista de candidatos informando a ordem/indice do elemento");
        //for(int indice = 0; indice < candidatos.length; indice++){
            //System.out.println("O candidato de nº " + (indice+1) + " é: " + candidatos[indice]);
        //}

        System.out.println("Forma abreviada de interação for each");
        System.out.println(" ");

        for(String candidato : candidatos){ //Minha variável temporária do tipo String chamada candidato é igual a todos os candidatos da minha lista candidatos
            System.out.println("O candidato selecionado foi " + candidato);
            entrandoEmContato(candidato);
            System.out.println(" ");
            System.out.println(" ");
        }
        //selecaoCandidatos();
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA","DANIELA", "JORGE"};
        
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) { //Slecionar 5 candidatos, enquanto tiver pessoas para buscar na lista de candidatura

            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou esse valor de salário: R$ " + salarioPretendido);
            
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            } else {
                System.out.println("O candidato " + candidato + " não foi selecionado para a vaga, pois seu salário solicitado foi de: R$ " + salarioPretendido);
            }

            candidatoAtual++;
        }   
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    //Método auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1; //Se o valor entre 1 e 3 for igual a 1, ele atendeu. Do contrário ele não atendeu e vai ficar forçando tentativa
    }

   static void entrandoEmContato(String candidato){
    int tentativasRealizadas = 1;
    boolean continuarTentando = true;
    boolean atendeu = false;

    do {
        atendeu = atender();
        continuarTentando = !atendeu; //Se atendeu, não vai continuar tentando

        if(continuarTentando)
            tentativasRealizadas++;
        else
            System.out.println("CONTATO REALIZADO COM SUCESSO");

    } while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
            System.out.println("CONTATO REALIZADO COM  " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        else 
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " NUMERO MÁXIMO DE TENTATIVAS " + tentativasRealizadas + " REALIZADA");

   }
}
