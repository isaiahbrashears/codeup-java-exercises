
import java.util.Arrays;

public class ArraysExercises {
    private static Person[] people = new Person[3];
    private static Person[] addPerson(Person[] arr, Person name) {
        int index = arr.length;
        Person[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[index] = name;
        return newArr;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString( numbers));
        people[0] = new Person("Matt Greco");
        people[1] = new Person("Mark Munter");
        people[2] = new Person("Bash Anglo");

        for (Person person : people){
            System.out.println(person.getName());

        }

        System.out.println("\n");
        people = addPerson(people, new Person("izzy Brash"));

        for (Person person : people){
            System.out.println(person.getName());

        }
    }

}
