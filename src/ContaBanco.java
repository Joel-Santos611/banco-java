public class ContaBanco {
 int numero;
 String agencia;
 String nomeCliente;
 double saldo;



 public void dadosDaConta(){//Esse metodo é responsavel por imprimir os dados da conta que serão inseridos pelo usuario via scanner
    System.out.println("Ola "+nomeCliente+
    ", obrigado por criar uma conta em nosso Banco, sua agencia é "+agencia+ 
    ", conta "+numero+" e seu saldo de "+saldo+" ja esta disponivel para saque!");
 }
}  