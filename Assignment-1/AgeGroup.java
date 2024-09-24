
// Question 3
public class AgeGroup{
	public static void main(String[] args)
	{
		int age = (int)(Math.random()*100);
		System.out.print("The Age of Person : "+age);

		if(age <=3)
			System.out.println(" Toddlers ");
		else if(age > 3 && age <= 8)
			System.out.println(" Kids ");
		else if(age > 8 && age <= 12)
			System.out.println(" Child ");
		else if(age > 12 && age <=18)
			System.out.println(" Teens ");
		else if(age > 18 && age <= 40)
			System.out.println(" Adult ");
		else if(age > 40 && age <= 60)
			System.out.println(" Matured Adult ");
		else if(age > 60 && age <= 75)
			System.out.println(" Seniors ");
		else
			System.out.println(" Super Seniors ");
	}
}
// OUTPUT :
// The Age of Person : 31 Adult
// The Age of Person : 53 Matured Adult
// The Age of Person : 95 Super Seniors
// The Age of Person : 11 Child