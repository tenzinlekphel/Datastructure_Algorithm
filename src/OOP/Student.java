package OOP;

public class Student extends Human implements Flyable {

    public Student(String name, int age, int heightInInches, String eyeColor) {
        super(name, age, heightInInches, eyeColor);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flying high......");
    }
}
