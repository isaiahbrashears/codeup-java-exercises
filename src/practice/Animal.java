package practice;

public class Animal {
    private int age;
    private String species;
    private boolean isAlive;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public Animal(String species, int age, boolean isAlive){
        this.species = species;
        this.age = age;
        this.isAlive = isAlive;
    }

}
