package excer1;

import java.util.Scanner;

public class PersonTest {

    public PersonTest() {
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj dane: imie, nazwisko,wiek i pesel:");
        Person person = new Person();
        try {
            person.NameUndefinedException(scanner.nextLine(), scanner.nextLine());
            person.IncorrectAgeException(scanner.nextInt());
            person.setPesel(scanner.nextInt());
            System.out.println(person);
            scanner.close();
        } catch (NameUndefinedException e) {
            System.err.println(e.getMessage());
        } catch (IncorrectAgeException e) {
            System.err.println(e.getMessage());
        }
    }
}