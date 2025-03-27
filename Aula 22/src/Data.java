
public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    private boolean ehBissexto(){
        return (ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0);
    }

    public boolean ehValida () {
        if (mes == 2){
            if (ehBissexto()){
                return dia >= 1 && dia <= 29;
            } else {
                return dia >= 1 && dia <= 28;
            }

        }
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            return dia >= 1 && dia <= 31;
        }
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
            return dia >= 1 && dia <= 30;
        }
    }

}
