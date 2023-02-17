public abstract class Person {
    private String name;
    private int age;
    private char gender;
    private String email;

    public Person(String name, int age, char gender, String email) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
    }

    @Override
    public String toString() {
        return "\n\nPerson" +
                "\nName='" + name +
                "\nAge=" + age +
                "\nGender=" + gender +
                "\nEmail='" + email;
    }
}
