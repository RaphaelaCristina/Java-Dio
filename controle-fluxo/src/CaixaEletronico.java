public class CaixaEletronico {

    public static void main(String[] args) {
         double saldo = 25.00;
         double valorSolicitado = 25.00;

         if(valorSolicitado <= saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Saque de R$ " + valorSolicitado + " realizado com sucesso. O novo salvo é de R$ " 
            + saldo);
         } else {
            System.out.println("Saque não realizado pois não há dinheiro suficiente");
         }
    }
}
