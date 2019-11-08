package excer1;

import java.util.Scanner;

public class PersonTest {

    public static void main(String[] args) throws NameUndefinedException, IncorrectAgeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj dane: imie, nazwisko,wiek i pesel:");
        try {
            Person person = new Person();
            person.nameCheck(scanner.nextLine(), scanner.nextLine());
            person.ageCheck(scanner.nextInt());
            person.setPesel(scanner.nextInt());
            System.out.println(person.toString());
        } catch (NameUndefinedException | IncorrectAgeException e) {
            System.err.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}