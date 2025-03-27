public class Sequencia {
    private int inicio;
    private int fim;

    public Sequencia(int inicio, int fim) {
        if (inicio > fim) {
            this.inicio = fim;
            this.fim = inicio;
        } else {
            this.inicio = inicio;
            this.fim = fim;
        }
    }


    public void mostrar(int inc) {
        for (int i = inicio; i <= fim; i += inc) {
            System.out.println(i);
        }
    }


    public void mostrarDefault() {
        mostrar(1);
    }
}
