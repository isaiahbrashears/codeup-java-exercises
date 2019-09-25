
public class Person {
    private String name;
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello from " + name);
    }

    public Person(String name){
       setName(name);
    }

    public static void main(String[] args) {
        Person izzy = new Person("Izzy");

        System.out.println(izzy.getName());
        izzy.setName("Brash");
        izzy.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); //true
//        System.out.println(person1 == person2); //false

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); //true

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());//John
//        System.out.println(person2.getName());//John
//        person2.setName("Jane");
//        System.out.println(person1.getName());//Jane
//        System.out.println(person2.getName());//Jane

    }
}

