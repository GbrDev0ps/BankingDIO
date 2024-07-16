import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá! Aqui é o Banking da DIO");

        System.out.println("Digite seu nome para iniciarmos a abertura de sua conta: ");
        String nome = scanner.next();

        System.out.println("Olá " + nome + ", sua conta foi criada com sucesso aqui no Banking DIO!");
    }
}
