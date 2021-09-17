package Atividade2;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ManipulaStrings {

    private String nome;

    public String getNome() {
        return nome;
    }

    public ManipulaStrings() {
    }

    public void inverteString(String nome) {
        System.out.println(new StringBuilder(nome).reverse().toString().toUpperCase(Locale.ROOT));
    }

    public void palindromo(String frase) {
      String semEspaco = frase.replace(" ", "").toLowerCase(Locale.ROOT);
        int i = 0;
        while (i < semEspaco.length()) {
            if (semEspaco.charAt(i) != semEspaco.charAt(semEspaco.length() - i -1)) {
                System.out.println("Não é um Palíndromo.");
                System.exit(0);
            }
            i++;
        }
        System.out.println("É um palíndromo");
    }

}
