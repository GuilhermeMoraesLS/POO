public class Curso {
    private String nome;
    private int nrVagas;
    private Aluno[] alunos;

    public Curso(String nome, int nrVagas) {
        this.nome = nome;
        this.nrVagas = nrVagas;
        this.alunos = new Aluno[nrVagas - 1];
    }

    public boolean matricular(Aluno a) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null && a.getMatricula().equals(alunos[i].getMatricula())) {
                System.out.println("Aluno já matriculado no Curso");
                return false;
            } else if (alunos[i] == null) {
                alunos[i] = a;
                System.out.println("Aluno matriculado com sucesso!");
                return true;
            }
        }
        System.out.println("Curso sem vagas");
        return false;
    }

    public boolean cancelarMatricula(String matricula){
        for (int i = 0; i < alunos.length; i++){
            if (alunos[i] != null && matricula.equals(alunos[i].getMatricula())){
                for (int j = i; j < alunos.length - 1; j++){
                    alunos[j] = alunos[j + 1];
                }
                alunos[alunos.length - 1] = null;
                return true;
            }
        }
        return false;
    }

    public void imprimirInfo(){
        System.out.println("-----------------------------"+nome+"----------------------------");
        System.out.println("Vagas: "+ nrVagas);
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < alunos.length; i++){
            if (alunos[i] != null){
                System.out.println("Aluno(Matrícula): "+alunos[i].getNome()+"("+alunos[i].getMatricula()+")");
            }
        }
    }




        

}