package excer1;

public class IncorrectAgeException extends Exception{
   public IncorrectAgeException(int age)
   {
       super("Wiek " +age+ " musi byc wiekszy od 1");
   }
}
