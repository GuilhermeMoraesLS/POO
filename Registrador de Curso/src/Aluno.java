import java.util.concurrent.ThreadLocalRandom;

public class Aluno {
    private String matricula;
    private String nome;

    public Aluno(String nome) {
        this.matricula = gerarMatriculaAleatoria();
        this.nome = nome;
    }

    private static String gerarMatriculaAleatoria() {
        return String.valueOf(ThreadLocalRandom.current().nextInt(10000000, 100000000));
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }
}