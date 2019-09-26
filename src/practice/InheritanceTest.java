package practice;

public class InheritanceTest {
    public static void main(String[] args) {
        Dog hobbes = new Dog("Dog", 2, true, "PitBull", "Hobbes");
        System.out.println(hobbes.getName());
        System.out.println(hobbes.getSpecies());
        System.out.println(hobbes.getBreed());
        System.out.println(hobbes.getAge());
        System.out.println(hobbes.isAlive());
    }
}
