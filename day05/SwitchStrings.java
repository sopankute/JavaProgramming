public class SwitchStrings {
    public static void main(String[] args) {

        String color = args[0]; //first cmd line argument

        switch(color.toLowerCase()) { //converts input string to lower case
            case "red": System.out.println("Roses are red.");
                        System.out.println("Sun is red too!");
                        break;
            case "green":System.out.println("Earth is green.");
                        System.out.println("Grasses are green too!");
                        break;
            case "blue":System.out.println("Sky is blue.");
                        System.out.println("There's a blue whale too!");
                        break;
            default:    System.out.println("Please enter RGB color only.");
        }

    }
}
