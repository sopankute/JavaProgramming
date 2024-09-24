public class DataTypes2 {
    public static void main(String[] args) {
    //error code
        // float cGPA = 8.9; //CE, 8.9 defaults to double
        // cGPA = cGPA + 1.1; //CE, 1.1 defaults to double

    //solution
        float cGPA = 8.9f; //f to tell that this is a float type
        cGPA = cGPA + 1.1f;
        System.out.println(cGPA);
    }
}
