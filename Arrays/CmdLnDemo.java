/**
 * Demo taking in and validating command line arguments.
 * @author mvail
 */
public class CmdLnDemo {
    public static void main(String[] args) {
        //When expecting command line arguments,
        // you should always validate that you
        // got what you needed. If not, you should
        // report what was expected with a "usage"
        // statement and exit.
        if (args.length != 2) {
            System.out.println("Usage: java CmdLnDemo age name");
            System.out.println("where age is an integer and name is a string.");
            return; //ends main()
        }

        //Let's just repeat back ("echo") the
        // command line arguments.
        for (String arg : args) {
            System.out.println(arg);
        }

        //What if we wanted numbers or some other
        // data type? Use wrapper class parse
        // methods!
        int age = Integer.parseInt(args[0]);
        String name = args[1];

        System.out.println("Oh, my word! " + name + " is " + age + " years old!?!");
    }
}
