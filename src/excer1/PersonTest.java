package excer1;

import java.util.Scanner;

public class PersonTest {

    public PersonTest() {
    }
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("podaj dane: imie, nazwisko,wiek i pesel:");
            Person person = new Person();
        try{
            person.setFirstName(scanner.nextLine());
            person.setLastName(scanner.nextLine());
        } catch (NameUndefinedException e) {
            System.err.println(e.getMessage());
        }
        try {
            person.setAge(scanner.nextInt());
        }catch (IncorrectAgeException e) {
            System.err.println(e.getMessage());
        }
            person.setPesel(scanner.nextInt());
            scanner.close();
            System.out.println(person);
        }
    }


