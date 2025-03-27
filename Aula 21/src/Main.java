import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número da sequência: ");
        int n1 = teclado.nextInt();

        System.out.println("Digite o segundo número da sequencia: ");
        int n2 = teclado.nextInt();

        Sequencia sequencia = new Sequencia(n1, n2);

        System.out.println("Digite o p (0 - para não ter p): ");
        int p = teclado.nextInt();




    }
}