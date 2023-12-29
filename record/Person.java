package record;

public record Person(String name, int age) {
    // The above line declares a record class "Person" with two components: name and age
    // Records implicitly generate a constructor, accessors, equals(), hashCode(), and toString()
}

