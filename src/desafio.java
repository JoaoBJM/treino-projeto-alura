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

            if (opcao == 1 ) {

                System.out.println("O saldo é : " + saldo);
            }else if (opcao == 2) {
                System.out.println("Qual o valor que será transferido? ");
                double valor = leitura.nextDouble();
                if(valor > saldo){
                    System.out.println("Saldo insuficiente :( ");
                }else {
                    saldo =- valor;
                    System.out.println("Saldo atual"+ saldo);
                }
            } else if (opcao == 3 ) {
                System.out.println("Valor transferido: ");
               double valor = leitura.nextDouble();
                System.out.println("Saldo Atual:  " + saldo);
                } else if (opcao != 4) {
            }
        }
        }
        }
    }

