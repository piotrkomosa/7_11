package excer1;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private int pesel;

    public Person(String firstName, String lastName, int age, int pesel) throws NameUndefinedException, IncorrectAgeException {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
        nameCheck(firstName, lastName);
        ageCheck(age);
    }

    public Person() {

    }
    void ageCheck(int age) throws IncorrectAgeException {
        if (age < 1)
            throw new IncorrectAgeException(age);
    }

     void nameCheck(String firstName, String lastName) throws NameUndefinedException {
        if (firstName.length() < 2 || firstName == null)
            throw new NameUndefinedException(firstName, lastName);
        if (lastName.length() < 2 || lastName == null)
            throw new NameUndefinedException(firstName, lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    @Override

    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
//    void IncorrectAgeException(int age) throws IncorrectAgeException {
//        if (age < 2) {
//            throw new IncorrectAgeException(age);
//        }
//    }
//    void NameUndefinedException(String firstName, String lastName) throws NameUndefinedException {
//        if (firstName.length() < 2 || lastName.length() < 2) {
//            throw new NameUndefinedException(firstName, lastName);
//        } else if (firstName == null || lastName == null) {
//            throw new NameUndefinedException(firstName, lastName);
//        }
    
    