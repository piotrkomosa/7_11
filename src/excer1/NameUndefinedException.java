package excer1;

public class NameUndefinedException extends Exception {
    public NameUndefinedException(String firstName,String lastName)
    {
        super("złe dane: " +firstName+" i " +lastName+" musza być dłuzsze od 1 i rożne od null");
    }
}
