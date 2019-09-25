package util;

import java.util.Scanner;

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

    public int getInt(int min, int max){
        int userNum = Integer.parseInt( scanner.nextLine() );
        if ( userNum >= min && userNum  <= max){
            return userNum;
        }else {
            System.out.format("invalid number, choose number between %s and %s: \n", min, max);
            return getInt(min, max);
        }
    }

    public int getInt(){
        return scanner.nextInt();
    }

    public double getDouble(double min, double max){
        double userDbl = scanner.nextDouble();
        if ( userDbl >= min && userDbl <= max){
            return userDbl;
        }else {
            System.out.format("invalid number, choose number between %s and %s: \n", min, max);
            return getDouble(min, max);
        }
    }

    public double getDouble(){
        return scanner.nextDouble();
    }
}
