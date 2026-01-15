import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        class user {
            String username;
            int age;
            int numberBI;

            void iban (){
                var initIBAN = "EF11 0002.0000.0000.";
                var restIBAN = "";
                for (int i = 0; i < 9; i++) {
                    var store = (int)(Math.random() * 10);
                    if (i == 4 || i == 8) {
                        restIBAN = restIBAN + "." + store;
                    }
                    else restIBAN += store;

                }
                var ibanComp = initIBAN + restIBAN;
                System.out.println(ibanComp);
                System.out.println("\n=====================Dados da Conta Bancária===================================");
                System.out.println ("Name: " + username + "\n" + "Age: " + age + "\n" +
                        "BI number: " + numberBI + "\n" + "IBAN " + ibanComp);
                System.out.println("\n==================================================================");
            }
        }
        user user1 = new user();
        Scanner write = new Scanner(System.in);
        System.out.println("Write your name: ");
        var name = write.nextLine();
        System.out.println("Hello, " + name);
        System.out.println("Write your age: ");
        var age = write.nextInt();
        System.out.println("Your age is: " + age);
        System.out.println("Write your BI number: ");
        var numberBI = write.nextInt();
        user1.username = name;
        user1.age = age;
        user1.numberBI = numberBI;
        user1.iban();
        write.close();
    }


}
