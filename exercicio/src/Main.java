import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Qual o teu nome? ");
        var scanner = new Scanner(System.in);
        var nome = scanner.next();
        System.out.printf("Meu nome é %s", nome);

        }
    }