/*
*there are 34 non-printable characters, 0-32 & 127
*Special characters 33-47, 91-96, 123-126
*letters, 65 -> A, 90 -> Z, 97 -> a, 122 -> z
*numbers, 48 -> 0, 57 -> 9
*/ 

public class UnicodeDemo {
    public static void main(String[] args) {

        for(int i = 0 ; i < 128 ; i++) {
            System.out.println(i + " - " + (char)i);
        }
    }
}