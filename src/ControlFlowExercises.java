import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 5; i <= 15; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int x = 100; x > -10; x -= 5) {
            System.out.println(+x);
        }

        System.out.println();

        for (long y = 2; y < 1000000; y *= y) {
            System.out.println(y);
        }

        System.out.println();

        for (int f = 1; f <= 100; f++) {
            if (f % 3 == 0 && f % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (f % 3 == 0) {
                System.out.println("Fizz");
            } else if (f % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(f);
            }
        }

        String tableContinue = "Y";

        while (tableContinue.equalsIgnoreCase("y")) {

            System.out.println("Input an integer: ");
            int userNum = Integer.parseInt(input.nextLine());

            System.out.println(" Here is your table:");
            System.out.println("\n number | squared | cubed \n ------ | ------- | -----");

            for (int num = 1; num <= userNum; num++) {

                System.out.println("  " + num + "     | " + (num * num) + "       | " + (num * num * num));
            }

            System.out.println("do you want to continue? Y/N ");
            tableContinue = input.nextLine();
        }

        System.out.println("ok then");

        do {
            System.out.println("give me a number grade 1 - 100");
            int grade = Integer.parseInt(input.nextLine());

            if (grade > 87) {
                System.out.println("A");
            } else if (grade > 79) {
                System.out.println("B");
            } else if (grade > 66) {
                System.out.println("C");
            } else if (grade > 59) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }

            System.out.println("would you like to test another grade? y/n");

        }while (input.nextLine().equalsIgnoreCase("y"));

    }

}
