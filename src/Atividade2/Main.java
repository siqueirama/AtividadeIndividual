package Atividade2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ManipulaStrings manipulaStrings = new ManipulaStrings();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite Nome: ");
        String nome = teclado.nextLine();
        manipulaStrings.inverteString(nome);

        System.out.println("\n"+"Verifica palindromo"+"\n"+"Digite a frase");
        String frase = teclado.nextLine();
        manipulaStrings.palindromo(frase);



    }
}
