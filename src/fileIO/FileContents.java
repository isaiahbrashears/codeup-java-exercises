package fileIO;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileContents {

    public static void main(String[] args) {

        try{
            Files.write(
                    Paths.get("src", "fileIO", "test.txt"),
                    Arrays.asList("eggs"), // list with one item
                    StandardOpenOption.APPEND
            );
        }catch (IOException e){
            e.printStackTrace();
        }

        retrieveFileContents();

    }


    public static void retrieveFileContents(){

        Path filePath = Paths.get("data", "groceries.txt");
//        List<String> strList = null;

        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get("data", "groceries.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }



        List<String> newList = new ArrayList<>();
        for (String line : lines) {
            if (line.equals("starch")) {
                continue;
            }
            newList.add(line);

            System.out.println(newList);

            try {
                Files.write(
                        Paths.get("data", "groceries.txt"), newList);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//
//        try{
//            strList = Files.readAllLines(filePath);
//            for (int i = 0 ; i < strList.size(); i++ ){
//                System.out.println((i + 1) + ": " + strList.get(i));
//            }
//        }catch (IOException e){
//            e.printStackTrace();
//        }

    }

}
