import java.util.Scanner;

public class Ex05{
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o tempo em segundos: ");
        int t = teclado.nextInt();

        int horas = t / 3600;
        int minutos = (t%3600)/60;
        int segundos = ((t%3600)%60);

        System.out.printf("Tempo: %d horas, %d minutos e %d segundos", horas, minutos, segundos);

    }

}