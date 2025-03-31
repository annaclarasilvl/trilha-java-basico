import java.util.Scanner;

public class Contador {
    Scanner terminal = new Scanner(System.in);

    public void contar () throws ParametroInvalidoException {
        System.out.println("Digite um número inteiro positivo: ");
        int numero1 = terminal.nextInt();
        System.out.println("Digite outro número: ");
        int numero2 = terminal.nextInt();
        terminal.close();
        while (numero1 <= numero2) {
            System.out.println("Contando: " + numero1);
            numero1++;
        }
    }

    public static void main(String[] args) {
        Contador contador = new Contador();
        System.out.println("Iniciando o contador...");
        try {
            contador.contar();
        } catch (ParametroInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
