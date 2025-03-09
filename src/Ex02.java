import java.util.Scanner;

class Ex02{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        float a = teclado.nextFloat();
        System.out.print("Digite o segundo número: ");
        float b = teclado.nextFloat();

        float soma = a + b;
        float multi = a * b;
        float sub = a - b;
        float div = a / b;

        System.out.printf("Soma: %.2f\n", soma);
        System.out.printf("Multiplicação: %.2f\n", multi);
        System.out.printf("Subtração: %.2f\n", sub);
        System.out.printf("Divisão: %.2f\n", div);

        teclado.close();
    }
}