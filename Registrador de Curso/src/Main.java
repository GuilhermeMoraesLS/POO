import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do Curso: ");
        String nomeCurso = teclado.nextLine();

        System.out.println("Digite o número de vagas do Curso: ");
        int nrVagas = teclado.nextInt();

        Curso curso = new Curso(nomeCurso, nrVagas);

        int comando;

        while (true){
            System.out.println("------------------Menu--------------------");
            System.out.println("Matricular aluno -> [1]");
            System.out.println("Cancelar matrícula -> [2]");
            System.out.println("Imprimir informações do Curso -> [3]");
            System.out.println("Sair -> [4]");
            System.out.println("------------------------------------------");
            System.out.println("Digite o comando: ");
            comando = teclado.nextInt();

            switch (comando){
                case 1:
                    teclado.nextLine();
                    System.out.println("--------Matrícula de Aluno-------");
                    System.out.println("Digite o nome do Aluno: ");
                    String nome = teclado.nextLine();

                    Aluno a = new Aluno(nome);
                    curso.matricular(a);
                    break;

                case 2:
                    System.out.println("--------Cancelamento de matrícula-------");
                    System.out.println("Digite a matrícula do Aluno: ");
                    String matriculaCancelada = teclado.nextLine();

                    curso.cancelarMatricula(matriculaCancelada);
                    break;

                case 3:
                    curso.imprimirInfo();
                    break;

                case 4:
                    System.out.println("Fechando o programa...");
                    return;

                default:
                    System.out.println("COMANDO INVÁLIDO");
                    break;
            }


        }
    }
}