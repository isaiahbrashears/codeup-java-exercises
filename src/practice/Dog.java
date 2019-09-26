package practice;

public class Dog extends Animal {
    private String breed;
    private String name;

    public Dog(String species, int age, boolean isAlive, String breed, String name) {
        super(species, age, isAlive);
        this.breed = breed;
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
