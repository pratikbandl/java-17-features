package record;
public class RecordExample {
    public static void main(String[] args) {
        // Creating a new Person record
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);

        // Accessing data using generated accessor methods
        System.out.println("Person 1: " + person1.name() + ", Age: " + person1.age());
        System.out.println("Person 2: " + person2.name() + ", Age: " + person2.age());

        // Records have built-in equals(), hashCode(), and toString() methods
        System.out.println("Are they equal? " + person1.equals(person2));
        System.out.println("Person 1 details: " + person1);
        System.out.println("Person 2 hash code: " + person2.hashCode());
    }
}

