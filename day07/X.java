public class X {
// data members
    // instance/non-static variable - stored in heap
    String name; // default values - null

    // class/static variables - stored in Class area
    static String organization = "CDAC Hyd";


// methods
    //setter ot mutator method
    // n local variable, stored in stack area
    void setName(String n) { 
        name = n;
    }

    //getter or accessor method
    String getName() {
        return name;
    }

    //getter to print both variables
    void getX() {
        System.out.println(name + " " + organization);
    }

// to make these executable, we have main()
    public static void main(String[] args) {
        
        /** CE: cannot access non-staic variable/methods from static method
         * System.out.println(name);
         * setName("Java");
         * System.out.println(getName());
         */

        // Creating object of the class X
        X x1 = new X(); // X() - class constructor - compiler supplies it
        //since no arguments in X() - default constructor

        System.out.println(x1.name); //null
        x1.setName("Java");
        String str = x1.getName(); // returns name
        System.out.println(str);

        // Another object
        X x2 = new X();
        System.out.println(x2.name); //null
        x2.setName("Python");
        System.out.println(x2.getName());

        System.out.println(x1.name); // Java
        System.out.println(x2.name); // Python

        X s1, s2, s3; // declaring references

        s1 = new X(); //creating object s1
        s2 = new X(); //creating object s2
        s3 = new X(); //creating object s3
        
        s1.setName("PG-DAC");
        s2.setName("PG-DASSD");
        s3.setName("PG-DESD");

        s1.getX();
        s2.getX();
        s3.getX();
    }
}