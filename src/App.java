import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ContaBanco conta=new ContaBanco();
        Scanner scanner=new Scanner(System.in);

        System.out.println("Ola, vamos criar sua conta");
        System.out.println("Por favor, digite o numero da agencia:\n");
        conta.agencia=scanner.next();

        System.out.println("Digite o numero de conta:\n");
        conta.numero=scanner.nextInt();

        System.out.println("Digite seu nome:\n");
        conta.nomeCliente=scanner.next();
        
        System.out.println("Digite o valor que deseja depositar na conta:\n");
        conta.saldo=scanner.nextDouble();

        conta.dadosDaConta();

    }
}
