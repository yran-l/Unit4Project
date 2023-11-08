/**
 * Imports / used to create variable lists
 */
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DoorOpeningSimulator
{
    Scanner s = new Scanner(System.in);
    /**
     * Instance variables
     */
    private boolean run = true;
    private int doorOpenedCounter = 0;
    private String[] doorAnimations =new String[] {
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""};
    private String[] lore =new String[] {
            "a",
            "b",
            "c",
            "d",
            "e",
            "f",
            "g"};
    /**
     * Constructor
     */
    public DoorOpeningSimulator(){}


    /**
     * Methods
     */
    public void mainLoop(){
        String choice = "";
        while (run){
            clearScreen();
            System.out.println(loreRandomizer());
            System.out.println("Your Choices:" +
                    "\n0. Exit game" +
                    "\n1: Open the Door" +
                    "\n2: Do not Open the Door");
            choice = s.nextLine();

            if (choice.equals("0")){
                run = false;
            }
            if (choice.equals("1")){
                openDoor();
            }
            if (choice.equals("2")){

            }
        }

    }

    public String loreRandomizer(){
        int random_number = (int)(Math.random() * (lore.length + 1) + 0);
        return lore[random_number];
    }
    public String openDoor(){

        return "";
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

