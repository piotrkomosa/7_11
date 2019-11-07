package excer1;

public class NameUndefinedException extends Exception {
    public NameUndefinedException(String firsName,String lastName)
    {
        super("złe dane: " +firsName+" i " +lastName+" musza być dłuzsze od 1 i rożne od null");
    }
}
