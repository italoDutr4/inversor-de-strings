import java.util.Scanner;

public class inverterStrings {

    public static void main(String [] args) {
        System.out.println("Insira uma palavra:");
        Scanner leitor = new Scanner(System.in);
        String palavra = leitor.next();
        String novaPalavra = "";

        for(int i = palavra.length() - 1; i >= 0; i--){
            novaPalavra = novaPalavra + Character.toString(palavra.charAt(i));
        }
        System.out.println(novaPalavra);
    }
}
