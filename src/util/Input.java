package util;

import java.util.Scanner;

public class Input {
    public Scanner scanner;

    public String getString(){
        System.out.println("enter a string");
        return scanner.nextLine();
    }

    public boolean YesNo(){
        System.out.println("enter yes or no");
        return scanner.nextLine().equalsIgnoreCase("y") || scanner.nextLine().equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max){
        if (Integer.parseInt( scanner.nextLine() ) >= min && Integer.parseInt( scanner.nextLine() ) >= max){
            return Integer.parseInt( scanner.nextLine());
        }else {
            return getInt(min, max);
        }
    }

    public int getInt(){
        return scanner.nextInt();
    }

    public double getDouble(double min, double max){
        if (Double.parseDouble( scanner.nextLine() ) >= min && Double.parseDouble( scanner.nextLine() ) >= max){
            return Double.parseDouble( scanner.nextLine());
        }else {
            return getDouble(min, max);
        }
    }
}
