import java.util.Random;
public class ServerNameGenerator {
    private static String[] adjectives = {"fast", "cool", "slick", "rad", "sick", "weak", "crazy", "lean", "tight", "dry"};
    private static String[] nouns = {"dog", "hammer", "mouse", "skateboard", "cat", "pencil", "jet", "ferrari", "ocelot", "hat"};

    private static String randomElement(String[] arr ){
        Random random = new Random();
        int index = random.nextInt(arr.length);
        return arr[index];
    }

    public static void main(String[] args) {

        String newServerName = randomElement(adjectives) + "-" + randomElement(nouns);
        System.out.println("Your new server name is:\n" + newServerName);

    }
}
