public class Person {
    private String name;

    public Person(String name) {
        System.out.println("Person Constructor");
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}