//initialization example
public class ArrayDemo2 {
    public static void main(String[] args) {
        
        String[] languages = {"Java", "C++", "Python", "C#", "Javascript", "SQL", "HTML5"};

        for(String x : languages)
            System.out.println(x);

        java.util.Arrays.sort(languages); //FQN - Fully Qualified Name

        System.out.println();
        System.out.println("Sorted order:");
        for(String x : languages)
            System.out.println(x);

    }
}
