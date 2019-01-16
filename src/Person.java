package src;

public class Person {
    public static void main(String[] args) {
        // Call methods here
        Person mike = new Person("Mike");
        System.out.println(mike.name);
        mike.setName("Michael");
        System.out.println(mike.name);
        mike.sayHello();
        System.out.println("========");
       // TEST 1
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getTitle().equals(person2.getTitle()));
//        System.out.println(person1 == person2);
        // TEST 2
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
        // TEST 3
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getTitle());
//        System.out.println(person2.getTitle());
//        person2.setTitle("Jane");
//        System.out.println(person1.getTitle());
//        System.out.println(person2.getTitle());
    }
    //build methods & objects here

    // constructor
    public String name;
    public Person(String name) {
        this.name = name;
    }

    // GETTER
    // returns the person's title
    public String getName(){
        return this.name;
    }

    //SETTER
    // changes the title property to the passed value
    public void setName(String name){
        this.name = name;
    }

    // GREETING METHOD
    // prints a message to the console using the person's title
    public void sayHello(){
        System.out.println("Hello, " + name + "!");
    }

    //END OF EVERYTHING
}
