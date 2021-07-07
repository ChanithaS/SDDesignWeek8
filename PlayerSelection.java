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
        System.out.print("Enter player name: ");
        String name = mScanner.nextLine();

        System.out.print("Enter the number of years the players have played: ");
        int years = Integer.parseInt(mScanner.nextLine());

        System.out.print("Enter the player's type (batting, bowling, keeping): ");
        String type = mScanner.nextLine();
        Player.Type pType;

        // Validate the type.
        {
            if (type.equalsIgnoreCase("batting"))
                pType = Player.Type.BATTING;
            else if (type.equalsIgnoreCase("bowling"))
                pType = Player.Type.BOWLING;
            else
                pType = Player.Type.KEEPING;
        }

        System.out.print("Enter player's statistics: ");
        double stat = Double.parseDouble(mScanner.nextLine());

        System.out.print("Enter player rating: ");
        int rating = Integer.parseInt(mScanner.nextLine());

        mPlayers.add(new Player(name, pType, years, stat, rating));
    }
    public static void ViewPlayer(){
        for (Player iterator : mPlayers) {
            System.out.println(iterator);
        }
    }
    public static void bestBatsman(){
        Player[] players = { new Player(), new Player() };

        int counter = 1;
        for (Player player : mPlayers) {
            if (player.getType() == Player.Type.BATTING) {
                if (counter < 0)
                    return;

                players[counter] = player;
                counter--;
            }
        }
    }
    public static void BestBowler(){
        Player[] players = { new Player(), new Player() };

        int counter = 1;
        for (Player player : mPlayers) {
            if (player.getType() == Player.Type.BOWLING) {
                if (counter < 0)
                    return;

                players[counter] = player;
                counter--;
            }
        }
    }
    public static void bestKeeper(){
        Player[] players = { new Player(), new Player() };

        int counter = 1;
        for (Player player : mPlayers) {
            if (player.getType() == Player.Type.KEEPING) {
                if (counter < 0)
                    return;

                players[counter] = player;
                counter--;
            }
        }
    }
}
