import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner write = new Scanner(System.in);
        System.out.println("First number ");
        var firstNumber = write.nextInt();
        System.out.println("Second number ");
        var secondNumber = write.nextInt();
        System.out.println("Chose the operation ");
        var operation = write.next();
        var result = 0.0;
        switch (operation){
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if (firstNumber == 0 && secondNumber == 0) {
                    System.out.println("Indetermination (0/0)");
                } else if (secondNumber == 0) {
                    System.out.println("Infinite");
                } else {
                    result = firstNumber / secondNumber;
                }
                break;
        }
        System.out.println(result);
    }
}