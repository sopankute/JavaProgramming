
package myexceptions.user;
public class InvalidAgeException extends Exception{
    public InvalidAgeException(String errMsg){
        super(errMsg);
    }
}