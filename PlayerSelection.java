import java.util.Scanner;

public class PlayerSelection {
    public static void Menu()
    {
        System.out.println("Enter A to add a player");
        System.out.println("Enter V to view players");
        System.out.println("Enter B to Display two best batmans");
        System.out.println("Enter C to Display two best bowlers");
        System.out.println("Enter D to Display the best keeper");

        Scanner sc = new Scanner(System.in);
        String value = sc.next();
        getinput(value);
    }

    public static void getinput(String value)
    {
        switch(value)
        {
            case "A":
                addPlayer();
                break;
            case "V":
                ViewPlayer();
                break;
            case "B":
                bestBatsman();
                break;
            case "C":
                BestBowler();
                break;
            case "D":
                bestKeeper();
                break;
            default:
                System.out.println("Invalid input");    
        }
    }

    public static void addPlayer(){

    }
    public static void ViewPlayer(){

    }
    public static void bestBatsman(){

    }
    public static void BestBowler(){

    }
    public static void bestKeeper(){

    }
}
