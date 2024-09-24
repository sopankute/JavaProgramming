package myexceptions.user;

public class InvalidAgeException extends Exception{ //step01

	public InvalidAgeException(String errMessage) { //step02
		//invokes parent class's parameterized constructor
		super(errMessage); 
	}
}

//Now using this custom exception in VotingApp.java
//step03 is using this exception