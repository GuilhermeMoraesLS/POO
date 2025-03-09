import java.util.Scanner;

public class Ex13{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o número de alunos: ");
        int alunos = teclado.nextInt();

        float nota;
        float soma = 0;




        for (int i = 1; i <= alunos; i++){
            System.out.printf("Digite a nota de aluno %d: ", i);
            nota = teclado.nextFloat();
            soma = soma + nota;




        }

        float media = soma / alunos;

        System.out.printf("A média da turma %.2f", media);

    }
}
