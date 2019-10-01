import util.Input;

import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("talk to Bob: ");
        String chat = input.nextLine();

        if (chat.endsWith("?")) {
            System.out.println("Sure");
        } else if (chat.endsWith("!")) {
            System.out.println("Whoa, Chill out!");
        } else if (chat.isEmpty()) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("whatever");
        }
    }
}


