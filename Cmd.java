package FPfinals;

// SHAJIB MILON
// CS-101


import java.util.*;
import java.lang.reflect.Method;


public class Cmd {
    public static Scanner inputs = new Scanner(System.in);

    
    
    public static void Cmd_init() {
        System.out.println("\n================================================== \n"
                + ConsoleColors.BLUE_BACKGROUND_BRIGHT + "Enter command:" + ConsoleColors.RESET);
        String check = inputs.nextLine();
        String finCheck[] = check.split(" ");
        check = finCheck[0].substring(0, 1).toUpperCase() + finCheck[0].substring(1).toLowerCase() + "s";

      
        try {
         switch (check) {
            case "Users":
               if (finCheck[1].equals("list")) {
                    System.out.println(Users.list());
               } else if (finCheck[1].equals("set")) {
                    System.out.println(Users.set());
               } else if (finCheck[1].equals("select")) {
                    System.out.println(Users.select());
               }
                 break;

              
                case "Books":
                    if (finCheck[1].equals("list")) {
                        System.out.println(Books.list());
                    } else if (finCheck[1].equals("set")) {
                        System.out.println(Books.set());
                    } else if (finCheck[1].equals("get")) {
                        System.out.println(Books.get());
                    }
                    break;              
                case "Cmds":            
                     Cmd_choice();
                    break;             
                case "Exits":          
                    System.exit(0);
                    break;             
                default:
                    System.out.println(ConsoleColors.RED + "Error, command not found" + ConsoleColors.RESET);
                    break;
            }
        } catch (Exception e) {
            // System.out.println(e);
        } finally {
            System.out.println("====== End of line =======");
            Cmd.Cmd_init();
        }
    }
    public static void Cmd_choice() {
        Users users = new Users();
        Books books = new Books("","","");
      
        System.out.println("\nCommand Lists:");
        System.out.println("cmd list");
        Method usersClass[] = users.getClass().getDeclaredMethods();
        for (Method user : usersClass) {
            if (user.getModifiers() == 9) {
                System.out.println("user " + user.getName());
            }
        }
        Method Books[] = books.getClass().getDeclaredMethods();
        for (Method book : Books) {
            if (book.getModifiers() == 9) {
                System.out.println("book " + book.getName());
            }
        }
        System.out.println("exit");
    }
}
