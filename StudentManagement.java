package APJSC9550;

import java.util.ArrayList;

class Person1 {  // Make sure this class is not abstract
    private String name;
    private int age;

    public Person1(String name, int age) {  // Valid constructor
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<Person1> people = new ArrayList<>();
        
        // Adding 10 people to the ArrayList
        people.add(new Person1("Aniruddha", 20));
        people.add(new Person1("Radhika", 21));
        people.add(new Person1("Ram", 22));
        people.add(new Person1("Mansi", 23));
        people.add(new Person1("Akshay", 24));
        people.add(new Person1("Aadarsh", 25));
        people.add(new Person1("Grace", 26));
        people.add(new Person1("Hannah", 27));
        people.add(new Person1("Ivan", 28));
        people.add(new Person1("Jack", 29));

        // Using for-each loop to print the people
        for (Person1 person : people) {
            System.out.println(person);
        }
    }
}
/* Output:
Name: Aniruddha, Age: 20
Name: Radhika, Age: 21
Name: Ram, Age: 22
Name: Mansi, Age: 23
Name: Akshay, Age: 24
Name: Aadarsh, Age: 25
Name: Grace, Age: 26
Name: Hannah, Age: 27
Name: Ivan, Age: 28
Name: Jack, Age: 29
*/
