package FPfinals;

// Main Method //

public class LibManSys {

    public static void main(String[] args) {
       
        System.out.println("\n\n" + ConsoleColors.GREEN_BOLD + "----LIBRARY MANAGEMENT SYSTEM---" + ConsoleColors.RESET + "\n");
        Cmd.Cmd_init();
        Cmd.Cmd_choice();

    }
}
