import java.util.*;

class Person {
    // Private member variables to store person's name, address, and age
    private String name;
    private String address;
    private int age;

    // Constructor to initialize person's name, address, and age
    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    // Copy constructor to create a new Person object with the same values as another Person object
    public Person(Person obj) {
        name = obj.name;
        address = obj.address;
        age = obj.age;
    }

    // Method to display the details of the person
    public void display() {
        System.out.println("Name Of Person: " + name);
        System.out.println("Address Of Person: " + address);
        System.out.println("Age Of Person: " + age);
    }
}

public class PersonDetails {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user for person's name, address, and age
        System.out.println("Enter Person Name:");
        String name = sc.nextLine();
        System.out.println("Enter Person Address:");
        String address = sc.nextLine();
        System.out.println("Enter Person Age:");
        int age = sc.nextInt();

        // Creating a Person object using the parameterized constructor
        System.out.println("Calling Parameterized Constructor");
        Person person1 = new Person(name, address, age);
        person1.display();
        System.out.print("\n");

        // Creating a Person object using the copy constructor
        System.out.println("Calling Copy Constructor");
        Person person2 = new Person(person1);
        person2.display();
        sc.close();
    }
}
