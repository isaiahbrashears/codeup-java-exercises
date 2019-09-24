package util;

import java.util.Scanner;

public class Input {
    public Scanner scanner = new Scanner(System.in);

    public String getString(){
        System.out.println("enter a string");
        return scanner.nextLine();
    }

    public boolean yesNo(){
        String yesorno = scanner.nextLine();
        return yesorno.equalsIgnoreCase("y") || yesorno.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max){
        System.out.format("enter int between %s and %s",min, max);
        int userNum = Integer.parseInt( scanner.nextLine() );
        if ( userNum >= min && userNum  <= max){
            return userNum;
        }else {
            return getInt(min, max);
        }
    }

    public int getInt(){
        System.out.println("enter an int");
        return scanner.nextInt();
    }

    public double getDouble(double min, double max){
        System.out.format("enter double between %s and %s",min, max);
        double userDbl = scanner.nextDouble();
        if ( userDbl >= min && userDbl <= max){
            return userDbl;
        }else {
            return getDouble(min, max);
        }
    }

    public double getDouble(){
        System.out.println("enter a double");
        return scanner.nextDouble();
    }
}
