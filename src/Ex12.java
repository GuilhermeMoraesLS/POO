import java.util.Scanner;

public class Ex12{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int n1 = teclado.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int n2 = teclado.nextInt();

        int soma = n1 + n2;
        float media = (float) soma / 2;

        if (n1 > n2){
            System.out.println(("Os números pares desse intervalo são: "));
            for (int i = n2 + 1; i <= n1-1; i++){
                if (i % 2 == 0){
                    System.out.println(i);
                }

            }
        }

        else{
            System.out.println(("Os números pares desse intervalo são: "));
            for (int i = n1 + 1; i <= n2-1; i++){
                if (i % 2 == 0){
                    System.out.println(i);
                }

            }


        }

        System.out.printf("A soma entre esses dois números é %d\n", soma);
        System.out.printf("A média entre esses dois números é %.2f", media);

    }
}