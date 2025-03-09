import java.util.Scanner;

public class Ex10{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int n = teclado.nextInt();

        System.out.println("Digite o primeiro número do intervalo: ");
        int n_intervalo_1 = teclado.nextInt();

        System.out.println("Digite o segundo número do intervalo: ");
        int n_intervalo_2 = teclado.nextInt();

        if ( (n > n_intervalo_1 && n < n_intervalo_2 ) || (n < n_intervalo_1 && n > n_intervalo_2)){
            System.out.println("O número se encontra no intervalo");

        }

        else {
            System.out.println("O número não se encontra no intervalo");

        }
    }
}