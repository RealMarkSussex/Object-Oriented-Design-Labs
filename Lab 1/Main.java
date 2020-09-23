public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Bob");
        System.out.println("Name of person1 is " + person1.getName());
        person1.setName("Bobby");
        System.out.println("New name of person1 is " + person1.getName());

        Lecturer person2 = new Lecturer("Tom", 1);
        System.out.println("Person2 has not been assigned an office location: " + person2.getOfficeLocation());
        OfficeLocation greatOffice = new OfficeLocation("Great Office", "The best room");
        Lecturer person3 = new Lecturer("Tom2", 2, greatOffice);
        System.out.println("Person3 has been assigned an office location: " + person3.getOfficeLocation());

        // Variable of type lecturer can be assigned to a variable of type person
        person1 = person3;
        System.out.println("New name of person1 is " + person1.getName());

        //Overriding example
        System.out.println("Name of person3 is: " + person3.getName());

        // Even though it is a person it will use the lecturer getName as person1 has been assigned to something that is a lecturer on line 15 
        System.out.println(person1.getName());

        //A normal person should just print out the name however
        Person person4 = new Person("Mark");
        System.out.println(person4.getName());
    }
}