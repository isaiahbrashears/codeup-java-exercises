import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        System.out.println(higherLower(100, 0));
    }
    public static String higherLower(int randomNum, int count){
        Scanner sc = new Scanner(System.in);
        int userInput =  Integer.parseInt(sc.nextLine());
        if(count >= 4){

            if (userInput > randomNum) {
                count++;
                System.out.println("guess number " + count);
                System.out.println("LOWER");
                return "out of guesses";
            } else if (userInput < randomNum) {
                count++;
                System.out.println("guess number " + count);
                System.out.println("HIGHER");
                return "out of guesses";
            } else if (userInput == randomNum) {
                count = count + 1;
                System.out.println("guess number " + count);
                return "GOOD GUESS!";
            }

        }else if (userInput > 0 && userInput < 101) {

            if (userInput > randomNum) {
                count++;
                System.out.println("guess number " + count);
                System.out.println("LOWER");
                return higherLower(randomNum, count++);
            } else if (userInput < randomNum) {
                count++;
                System.out.println("guess number " + count);
                System.out.println("HIGHER");
                return higherLower(randomNum, count++);
            } else if (userInput == randomNum) {
                count = count + 1;
                System.out.println("guess number " + count);
                return "GOOD GUESS!";
            }

        }else {
            System.out.println( "Invalid Input try again: ");
            return higherLower(randomNum, count);
        }
        return "";
    }

}
