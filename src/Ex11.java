import java.util.Scanner;

public class Ex11{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha uma operação (+, -, *, /): ");
        String op = teclado.nextLine();
        System.out.println("Digite o primeiro número: ");
        float a = teclado.nextFloat();
        System.out.println("Digite o segundo número: ");
        float b = teclado.nextFloat();




        switch (op){
            case "+":
                System.out.printf("O resultado é %.2f", a + b);
                break;
            case "-":
                System.out.printf("O resultado é %.2f", a - b);
                break;
            case "*":
                System.out.printf("O resultado é %.2f", a * b);
                break;
            case "/":
                System.out.printf("O resultado é %.2f", a / b);
                break;
            default:
                System.out.println("Operação inválida!");
                break;

        }

        teclado.close();

    }
}