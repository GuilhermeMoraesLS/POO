
public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    private boolean ehBissexto() {
        return (ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0);
    }

    public boolean ehValida() {
        if (ano > 0) {
            if (mes == 2) {
                if (ehBissexto()) {
                    return dia >= 1 && dia <= 29;
                } else {
                    return dia >= 1 && dia <= 28;
                }

            }
            else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                return dia >= 1 && dia <= 31;
            }
            else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                return dia >= 1 && dia <= 30;
            }
            else {return false;}
        }
        else { return false;}
    }

    public void imprime(String separador){
        if (ehValida()){
            System.out.printf("Data: %d"+separador+"%d"+separador+"%d", dia, mes, ano);
        }
        else {
            System.out.println("Data INVÁLIDA!");
        }
    }

    public void imprimeDefault(){
        imprime("/");
    }


}
