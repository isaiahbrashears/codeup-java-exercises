package util;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        return scanner.nextLine();
    }

    public boolean yesNo(){
        String yesorno = scanner.nextLine();
        return yesorno.equalsIgnoreCase("y") || yesorno.equalsIgnoreCase("yes");
    }

    private static int userNum;
    public int getInt(int min, int max){
        System.out.format("Choose number between %s and %s: \n", min, max);

        try{
            userNum = Integer.valueOf( scanner.nextLine() );;

            if ( userNum >= min && userNum  <= max){
                return userNum;
            }else {
                System.out.format("invalid number, choose number between %s and %s: \n", min, max);
                return getInt(min, max);
            }
        }catch (Exception e){
            System.out.println("Not valid integer");
            return getInt(min, max);
        }

    }

    public int getInt(){
        try{
            userNum = Integer.valueOf( scanner.nextLine() );
            return userNum;

        }catch (Exception e){
            System.out.println("Not valid integer");
            return getInt();
        }

    }



    private static double userDbl;
    public double getDouble(double min, double max){

        try{
            userDbl = Double.valueOf(scanner.nextLine());
            if ( userDbl >= min && userDbl <= max){
                return userDbl;
            }else {
                System.out.format("invalid number, choose number between %s and %s: \n", min, max);
                return getDouble(min, max);
            }
        }catch (Exception e){
            System.out.println("Not Valid Double");
            return getDouble(min,max);
        }
    }

    public double getDouble(){
        try{
            userDbl = Integer.valueOf( scanner.nextLine() );
            return userDbl;
        }catch (Exception e){
            System.out.println("Not valid double");
            return getDouble();
        }
    }

    public Object getBinary(){
        try {
            userNum = Integer.valueOf(scanner.nextLine(),2);
            return userNum;
        }catch (Exception e){
            System.out.println("Invalid Binary");
            return getBinary();
        }
    }

    public Object getHex(){
        try {
            userNum = Integer.valueOf(scanner.nextLine(),16);
            return userNum;
        }catch (Exception e){
            System.out.println("Invalid Hex");
            return getBinary();
        }
    }


    public static void main(String[] args) {

        Input input = new Input();
        System.out.println(input.getHex());

    }
}
