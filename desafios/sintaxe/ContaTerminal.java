package desafios.sintaxe;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta, sem caracteres: ");
        int conta = scanner.nextInt();
        System.out.println("Digite o número da agência, sem caracteres: ");
        int agencia = scanner.nextInt();
        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite o seu saldo atual: ");
        double saldo = scanner.nextDouble();
        scanner.close();

        System.out.println("Olá " + nome + " , obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
}
}