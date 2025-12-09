/**
 * Example code that expects a String for name, an int for age,
 * and a boolean for interest in this example.
 */
public class CmdLineValidation {
    public static void main(String[] args) {
        if (args.length != 3) { //right number of expected args?
            System.out.println("Usage: java CmdLineValidation [name] [age] [interest (true/false)]");
            return;
        }
        String name = args[0];
        int age;
        try {
            age = Integer.parseInt(args[1]); //is it an integer?
        } catch (NumberFormatException e) {
            System.out.println("Usage: java CmdLineValidation [name] [age] [interest (true/false)]");
            return;
        }
        boolean interested = Boolean.parseBoolean(args[2]);
        
        //after validation, I can do whatever the program wanted
        System.out.println("What? " + name + " is " + age + "?!? It is " + interested + " you are interested.");
        
    }
}
