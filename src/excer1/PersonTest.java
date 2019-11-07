package excer1;

import java.util.Scanner;

public class PersonTest {


    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("podaj dane: imie, nazwisko,wiek i pesel:");
            Person person = new Person();
            person.setFirstName(scanner.nextLine());
            person.setLastName(scanner.nextLine());
            person.setAge(scanner.nextInt());
            person.setPesel(scanner.nextInt());
            scanner.close();
            System.out.println(person);
        } catch (NameUndefinedException ex) {
            System.err.println(ex.getMessage());
        } catch (IncorrectAgeException ex) {
            System.err.println(ex.getMessage());
        }
    }
}