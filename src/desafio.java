import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        String nome = "joão";
        String tipoConta = "Corrente";
                double saldo = 1599.99;
           int opcao =0 ;
        System.out.println("___________");
        System.out.println("\nNome do cliente " + nome);
        System.out.println("Tipo Conta" + tipoConta);
        System.out.println("Saldo Atual:" + saldo);
        System.out.println("\n____________");

        String menu= """
                
                -- Digite Sua opção
                1 - Consultar Saldo
                2- Transferir
                3-Receber Valor
                4- Sair !
                """;
        Scanner leitura = new Scanner(System.in);
        while (opcao != 4){

            System.out.println(menu);
            opcao= leitura.nextInt();
        }
    }
}
