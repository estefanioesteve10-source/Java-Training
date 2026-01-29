import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            // Read input INSIDE the loop
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 9999) {
                break;
            }

            numbers.add(input);
        }

        // Check if the list is empty to avoid errors
        if (numbers.isEmpty()) {
            return;
        }

        int minVal = numbers.get(0);
        for (int num : numbers) {
            if (num < minVal) {
                minVal = num;
            }
        }

        System.out.println("Smallest number: " + minVal);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == minVal) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}