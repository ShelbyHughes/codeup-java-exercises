public class Person {
    private String name;

    public static void main(String[] args){
        Person p1 = new Person("Dylan");
        System.out.println(p1.getName());
        p1.setName("Quinny");
        p1.sayHello();

        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

        Person person3 = new Person("John");
        Person person4 = person3;
        System.out.println(person3 == person4);

        Person person5 = new Person("John");
        Person person6 = person5;
        System.out.println(person5.getName());
        System.out.println(person6.getName());
        person6.setName("Jane");
        System.out.println(person5.getName());
        System.out.println(person6.getName());
    }

    public Person(String name){
        this.name = name;
    }

    // returns the person's name
    public String getName(){
       return this.name;
    }

    // changes the name property to the passed value
    public void setName(String name){
        this.name = name;
    }

    // prints a message to the console using the person's name
    public void sayHello(){
        System.out.println("Hello from " + this.name + "!");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
