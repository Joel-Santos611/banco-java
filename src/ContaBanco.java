public class ContaBanco {
 int numero;
 String agencia;
 String nomeCliente;
 double saldo;



 public void dadosDaConta(){
    System.out.println("Ola "+nomeCliente+
    ", obrigado por criar uma conta em nosso Banco, sua agencia é "+agencia+ 
    ", conta "+numero+" e seu saldo de "+saldo+" ja esta disponivel para saque!");
 }
}  