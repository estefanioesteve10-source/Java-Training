import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What is your name? ");
        var scanner = new Scanner(System.in);
        var nome = scanner.next();
        System.out.printf("My name is %s", nome);

        }
    }