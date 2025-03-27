import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o ano: ");
        int ano = teclado.nextInt();

        System.out.println("Digite o mês: ");
        int mes = teclado.nextInt();

        System.out.println("Digite o dia: ");
        int dia = teclado.nextInt();

        Data data = new Data(dia, mes , ano);

        data.imprimeDefault();

        }
    }
