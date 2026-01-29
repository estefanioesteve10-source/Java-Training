
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> number = new ArrayList<>();

        int sum = 0;
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1){
                break;
            }
            number.add(input);
            sum += input;
        }
        if (!number.isEmpty()) System.out.print("Average: " + (double) sum / number.size());
    }
}
