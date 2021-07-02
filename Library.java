package FPfinals;

// Arwin M. Montabon
// BSCS-101

public class Library {

    public static void main(String[] args) {

        System.out
                .println("\n\n" + ConsoleColors.GREEN_BOLD + "LIBRARY MANAGEMENT SYSTEM" + ConsoleColors.RESET + "\n");
        Commands.list();

        Commands.init();

    }
}