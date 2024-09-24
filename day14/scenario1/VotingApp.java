package mypack;

import myexceptions.user.*;

public class VotingApp {

	void vote(int age) throws InvalidAgeException { //step04
		if(age < 18)
			//step03
			throw new InvalidAgeException("Under 18, can't vote"); 
		else
			System.out.println("Welcome! You can vote!");
	}

	public static void main(String[] args) {
		VotingApp v = new VotingApp();

		try {
			v.vote(20); //no exception generated
			v.vote(17);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		System.out.println("Rest of the code...");
	}
}