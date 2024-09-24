
package mypack;
import myexceptions.user.*;
public class VotingApp{
    
    void vote(int age) throws InvalidAgeException{
        if(age<18)
            throw new InvalidAgeException("under 18");
        else
            System.out.println("Welcome to vote!");
    }
    public static void main(String[] args) {
        
        VotingApp v=new VotingApp();
        try{
            v.vote(19); //
            v.vote(17); //
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Rest of the code .....follows!");
    }
}