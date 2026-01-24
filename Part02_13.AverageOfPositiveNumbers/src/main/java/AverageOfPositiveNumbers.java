
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            if (number > 0) {
                sum += number;
                num = num +1;
            }
        }
        if (sum != 0) {
            System.out.println("Number of numbers: " + (double)sum/num);
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
