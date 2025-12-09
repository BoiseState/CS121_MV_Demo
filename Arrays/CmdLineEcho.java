/**
 * 
 */
public class CmdLineEcho {
    public static void main(String[] args) {
        System.out.println("These are your " + args.length + " command line arguments:");
        for(int index = 0; index < args.length; index++) {
            System.out.println(args[index]);
        }
    }
}
