import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero da sua agencia!");
        int agencia = scanner.nextInt();
        System.out.println("Digite o numero da sua conta!");
        String numero = scanner.next();
        System.out.println("Digite o seu nome");
        String nomeCliente = scanner.next();
        System.out.println("Digite seu saldo");
        BigDecimal saldo = scanner.nextBigDecimal();

        scanner.close();

        System.out.println("Ola " +nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agencia: " + agencia + 
        ", conta: " + numero + " e seu saldo R$:" + saldo + " já está disponível para saque!");

    }
}
