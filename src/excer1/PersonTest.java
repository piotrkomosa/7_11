package excer1;

import java.util.Scanner;

public class PersonTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("podaj dane: imie, nazwisko,wiek i pesel:");
            Person person = new Person(scanner.nextLine(), scanner.nextLine(), scanner.nextInt(), scanner.nextInt());
            System.out.println(person);

        } catch (NameUndefinedException ex) {

            System.out.println("Imie jest nullem bądz jest krotsze niz 2 znaki");

        } catch (IncorrectAgeException ex) {
            System.out.println("Wiek nie moze byc mniejszy niz 1");

        }
    }
}
