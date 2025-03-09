import java.util.Scanner;

public class Ex03{
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        double salario;
        double aumento;

        System.out.println("Digite o salário: ");
        salario = teclado.nextDouble();

        System.out.println("Digite o aumento percentual: ");
        aumento = teclado.nextDouble();

        double aumento_multi = 1 + (aumento / 100);
        double novo_salario = salario * aumento_multi;

        System.out.printf("O novo salário é de %.2f", novo_salario);

        teclado.close();

    }
}