import java.util.Scanner;

class Ex04
{
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        final double pi = 3.14;
        double raio;

        System.out.println("Digite o raio da circunferência(em m): ");
        raio = teclado.nextDouble();

        double perim = 2 * pi * raio;
        double area = pi * raio * raio;

        System.out.printf("Perímetro: %.2f m \n", perim);
        System.out.printf("Area: %.2f m2", area);

        teclado.close();
    }
}