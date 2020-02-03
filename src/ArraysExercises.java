import java.util.Arrays;


public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person person1 = new Person("Dylan");
        Person person2 = new Person("Carlos");
        Person person3 = new Person("Brittany");
        Person person4 = new Person("Quentin");
        Person[] people = {person1, person2, person3};
        for (Person them : people) {
            System.out.println(them.getName());
        }
        addPerson(people, person4);
    }
    public static void addPerson(Person[] people, Person them){
        people = Arrays.copyOf(people, people.length + 1);
        people[people.length - 1] = them;
        for(Person they: people){
            System.out.println(they.getName());
        }
    }
}
