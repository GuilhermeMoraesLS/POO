import java.util.Scanner;

class Ex01{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int a = teclado.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = teclado.nextInt();

        int soma = a + b;
        int multi = a * b;
        int sub = a - b;
        int div = a / b;

        System.out.printf("Soma: %d\n", soma);
        System.out.printf("Multiplicação: %d\n", multi);
        System.out.printf("Subtração: %d\n", sub);
        System.out.printf("Divisão: %d\n", div);

        teclado.close();
    }
}