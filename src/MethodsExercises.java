import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(addition(1,5));
        System.out.println(subtraction(5,2));
        System.out.println(multiplication(2,3));
        System.out.println(division(9,3));
        System.out.println(modulus(5,2));



        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        System.out.println(userInput);

//
        String yesOrNo = "y";
        do {
            System.out.print("Enter a number between 1 and 10: ");
            System.out.println( factorial());
            System.out.println("Would you like to try another number? Y/N");
            yesOrNo = sc.nextLine();

        }while (yesOrNo.equalsIgnoreCase("Y"));

        System.out.println("How many sides do the dice have? ");

        int diceSides = sc.nextInt();
        sc.nextLine();

        String diceContinue = "y";
        do {
            System.out.println(dice(diceSides));
            System.out.println("Would you like to roll again? Y/N");
            diceContinue = sc.nextLine();
        }while (diceContinue.equalsIgnoreCase("y"));

        System.out.println("pick a number between 1-100 ");
        System.out.println(higherLower());


    }



    public static double addition(double num1, double num2){
       return num1 + num2;
    }

    public static double subtraction(double num1, double num2){
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2){
        int total = 0;
        for (int i = 0; i < num2; i++) {
            total += num1;
        }

        return total;
    }

    public static double division(double num1, double num2){
        return num1 / num2;
    }

    public static double modulus(double num1, double num2){
        return num1 % num2;
    }

    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int userNum = Integer.parseInt(sc.nextLine());
            if ( userNum < min || userNum > max ){
                System.out.print("Invalid number, try again: ");
                return getInteger(min, max);
            }else {
                return userNum;
            }
        }else {
            System.out.print("Invalid number, try again: ");
            return getInteger(min, max);
        }
    }

    public static long factorial(){
        long fact = 1;
        long userInput = getInteger(1,10);
        for (long i = 1; i <= userInput; i++){
            fact *= i;
        }
        return fact;
    }

    public static String dice(int sides){
        Random random = new Random();
        int di1 = random.nextInt(sides);
        int di2 = random.nextInt(sides);
        return "Your dice landed on " + di1 + " and " + di2;
    }

    public static String higherLower(){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int oneThroughOneHundred = random.nextInt(100);
        int userInput =  Integer.parseInt(sc.nextLine());
        if (userInput > 0 && userInput < 101) {
            if (userInput < oneThroughOneHundred) {
                System.out.println(oneThroughOneHundred);
                return "LOWER";
            } else if (userInput > oneThroughOneHundred) {
                System.out.println(oneThroughOneHundred);
                return "HIGHER";
            } else if (userInput == oneThroughOneHundred) {
                System.out.println(oneThroughOneHundred);
                return "GOOD GUESS!";
            }

        }else {
            System.out.println( "Invalid Input try again: ");
            return higherLower();
        }
        return "";
    }


}
