import java.util.Scanner;

public class Ex15 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        int total_caracteres = 0;
        int total_vogais = 0;
        int total_digitos = 0;

        while (true){
            System.out.println("Digite caracteres ('.' para parar): ");
            String caractere = teclado.nextLine();

            if (caractere.equals(".")){
                break;
            }

            if (caractere.equals("a") || caractere.equals("e") || caractere.equals("i") || caractere.equals("o") || caractere.equals("u") ){
                total_vogais++;

            }

            if (caractere.equals("1") || caractere.equals("2") || caractere.equals("3") || caractere.equals("4") || caractere.equals("5") || caractere.equals("6")|| caractere.equals("7")|| caractere.equals("8")|| caractere.equals("9") || caractere.equals("0")){
                total_digitos++;

            }


            total_caracteres ++;

        }

        System.out.printf("O total de vogais é %d\n", total_vogais);
        System.out.printf("O total de dígitos é %d\n", total_digitos);
        System.out.printf("A quantidade dos demais caracteres é %d\n", total_caracteres - (total_vogais + total_digitos));

    }
}
