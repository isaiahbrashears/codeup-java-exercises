import java.sql.Array;
import java.util.Arrays;

public class ArraysExercises {
    static Person[] person = new Person[3];
    static Person[] addPerson(Person[] arr){
        Person[] newArr = Arrays.copyOf(arr, arr.length+1);
        return newArr;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString( numbers));
        person[0] = new Person("Matt Greco");
        person[1] = new Person("Mark Munter");
        person[2] = new Person("Bash Anglo");

        for (Person name : person){
            System.out.println(name.getName());
        }

        int test = addPerson(person).length;
        System.out.println(test);






    }

}
