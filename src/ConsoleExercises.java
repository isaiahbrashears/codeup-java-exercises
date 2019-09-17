import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;

        System.out.printf("The value of pi is approximately %.2f. \n", pi);


        Scanner number = new Scanner(System.in);

        System.out.print("Enter an int: ");
        int userNum = number.nextInt();

        System.out.println("You entered: --> \"" + userNum + "\" <--");


        Scanner threeWords = new Scanner(System.in);

        System.out.println("enter three words: ");
        String firstWord = threeWords.next();
        String secondWord = threeWords.next();
        String thirdWord = threeWords.next();

        System.out.println(firstWord + "\n " + secondWord + "\n " + thirdWord);


        Scanner sentence = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String userSentence = sentence.nextLine();

        System.out.println(userSentence);

        Scanner roomArea = new Scanner(System.in);

        System.out.println("what is the width of the Codeup Classroom? ");
        String width = roomArea.nextLine();


        System.out.println("what is the length of the Codeup Classroom:? ");
        String  length = roomArea.nextLine();


        System.out.println("what is the height of the Codeup Classroon? ");
        String height = roomArea.nextLine();

        float widthParsed = Float.parseFloat(width);
        float lengthParsed = Float.parseFloat(length);
        float heightParsed = Float.parseFloat(height);

        System.out.println("The area of the Codeup Classroom is: " + (widthParsed * lengthParsed));
        System.out.println("the perimeter of the Classroom is: " + (( widthParsed * 2) + (lengthParsed * 2)));
        System.out.println("the volume of the classroom is: " + (widthParsed * lengthParsed * heightParsed));


    }
}
