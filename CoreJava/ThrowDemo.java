
public class ThrowDemo{
    
    static void validate(int age) throws IllegalAccessException{ // declare - throws
        if(age<18)
            throw new IllegalAccessException("Invalid Age!"); // / by zero
        else 
            System.out.println("Welcome to Vote!");
    }
    public static void main(String[] args) {
        
        try{
        validate(19); //
        validate(17); // AE
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
                System.out.println("This is used to close resources before termination!!");
        }
        System.out.println("rest of the code......!");
    }
}
// AE  - unchecked - run-time 
// IAE - checked - compile -time -