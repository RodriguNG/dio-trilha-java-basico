import java.util.Scanner;

public class ContaTerminal {
    double saldo = 17.50;
public static void main(String[] args) {
    
    Scanner scanner = new Scanner (System.in);

    double saldo = 237.48;

    System.out.println("Por favor, digite o número da Conta !");
    int numero = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Por favor, digite o número da Agência !");
    String agencia = scanner.nextLine();
 
    System.out.println("Por favor, digite o nome do Cliente:");
    String nome = scanner.nextLine();
    
    String mensagem = "Olá "+ nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
    System.out.println(mensagem);
    scanner.close();
}

}

