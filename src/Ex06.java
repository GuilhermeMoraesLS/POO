import java.util.Scanner;

public class Ex06{
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a distância em Km: ");
        float km = teclado.nextFloat();
        System.out.println("Digite o tempo em h: ");
        float t = teclado.nextFloat();
        System.out.println("Digite a gasoliona gasta em l: ");
        float l = teclado.nextFloat();


        float vel_med= km / t;
        float consumo = km / l;

        System.out.printf("O tempo médio foi de %.2f Km/h\n", vel_med);
        System.out.printf("O consumo médio de gasolina foi de %.2f Km/l", consumo);

        teclado.close();
    }
}