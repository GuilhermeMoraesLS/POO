import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int alunos = 0;
        float maior = -1;
        float menor = 11;
        float soma = 0;

        while (true){
            System.out.println("Digite as notas dos alunos (-1 para parar): ");
            float nota = teclado.nextFloat();

            if (((nota > 10) || (nota < 0)) && (nota != -1)){
                System.out.println("Nota inválida! Dados fornecidos a partir da última nota válida: ");
                break;
            }

            if (nota == -1){
                System.out.printf("A quantidade de alunos da classe é %d\n", alunos);
                System.out.printf("A média da classe é %.2f\n", soma / alunos);
                System.out.printf("A maior nota da classe é %.2f\n", maior);
                System.out.printf("A menor nota da classe é %.2f\n", menor);
                break;
            }

            soma = soma + nota;

            if (nota > maior){
                maior = nota;
            }

            if (nota < menor){
                menor = nota;
            }
            alunos ++;

        }


        teclado.close();



    }
}
