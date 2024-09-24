public class Test { //starting point of an application
    public static void main(String[] args) {
/*
    	// an array of Student objects
    	Student[] s = new Student[2]; //created an array of 5 Students
    	for(int i = 0; i < s.length; i++) {
    		s[i] = new Student(); // constructor, 5 times
    		s[i].disp();
    		s[i].findAvg();
    	}

    	Student s3 = new Student(123, "ASDF", 89, 90, 88); // parameterized constructor
    	s3.disp();
    	s3.findAvg();
*/
        Address a1 = new Address("114", "Dream Valley Road", "MNK","Hyd", "TS", "India", 444111);
        Student s1 = new Student(111, "ABC", 89, 87, 79, "DAC", "Male", a1); //a1 is passed
        s1.disp();
        s1.findAvg();

        Address a2 = new Address("204", "MG Road", "MNK","Hyd", "TS", "India", 400001);
        Student s2 = new Student(111, "ABC", 89, 87, 79, "DASSD", "Female", a2); //a2 is passed
        s2.disp();
        s2.findAvg();
    }
}
