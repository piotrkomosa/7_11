package excer1;

import java.util.Scanner;

public class PersonTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj dane: imie, nazwisko,wiek i pesel:");
        Person person = new Person();
        person.setFirstName(scanner.nextLine());
        person.setLastName(scanner.nextLine());
        person.setAge(scanner.nextInt());
        person.setPesel(scanner.nextInt());
        System.out.println(person);
    }

}
