import java.util.Scanner;
import java.lang.Math;

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


        String yesOrNo = "y";
        do {
            System.out.print("Enter a number between 1 and 10: ");
            System.out.println( factorial());
            System.out.println("Would you like to try another number? Y/N");
            yesOrNo = sc.nextLine();

        }while (yesOrNo.equalsIgnoreCase("Y"));

        System.out.println("How many sides do the dice have? ");
        int diceSides = sc.nextInt();

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
                return getInteger(1, 10);
            }else {
                return userNum;
            }
        }else {
            System.out.print("Invalid number, try again: ");
            return getInteger(1, 10);
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

//    public static int dice(int sides){
//        int di1 = java.lang.Math.random()
//    }



}
