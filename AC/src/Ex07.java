import java.util.Scanner;

public class Ex07 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int n = teclado.nextInt();
        if (n % 2 == 0){
            System.out.println("O número digitado é um número par");
        }
        else{
            System.out.println("O número digitado é um número ímpar");
        }

        teclado.close();

    }

}