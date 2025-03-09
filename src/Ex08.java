import java.util.Scanner;

public class Ex08{
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a quantidade de kilowatts consumidos: ");
        int kw = teclado.nextInt();
        System.out.println("Digite o valor do kilowatt: ");
        int valor_kw = teclado.nextInt();

        double conta = kw * valor_kw;

        if (kw < 150){
            conta = conta * 0.9;

        }

        System.out.printf("O valor da conta é %.2f", conta);

        teclado.close();

    }

}