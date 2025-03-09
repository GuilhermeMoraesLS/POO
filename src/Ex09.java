import java.util.Scanner;

public class Ex09{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero real ");
        float n = teclado.nextFloat();


        if (n % 1 < 0.5) {

            int under = (int) n;
            System.out.println(under);
        } else{
            int up = (int) n + 1;
            System.out.println(up);
        }
    }
}
