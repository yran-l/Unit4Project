/**
 * Imports / used to create variable lists
 */

import java.util.Scanner;
import java.io.IOException;
public class DoorOpeningSimulator
{
    Scanner s = new Scanner(System.in);
    /**
     * Instance variables
     */
    private boolean run = true;
    private boolean isDoorOpened = false;
    private int reputation = 0;
    private String purple = "\u001B[35m";
    private String white = "\u001B[37m";
    private String introLine1 = "You open the door to find a person by the name of, ";
    private String introLine2 = ", do you wish to let them in?";
    private String openedLine1 = "You have gave, ";
    private String openedLine2 = ", access to pookie.\n";
    private String[] doorAnimations = new String[] {
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""};
    private String[] names = new String[] {
    "Shakib Amin",
    "Naya Antaki",
    "Haroon Awan",
    "Leandra Boodram",
    "Rafael Bui",
    "Ryan Chen",
    "Tian Ying Chen",
    "Xin Chen",
    "Akzel Davila",
    "Farian Faruqee",
    "Ricky Jiang",
    "Veronica Joseph",
    "Stanley Lee",
    "Sharon Lin",
    "Nikita Manannikov",
    "Fiona Meyerhoff",
    "Adib Miah",
    "Enamul Muttakin",
    "Jack Ni",
    "Nafisa Patwary",
    "Irsal Siam",
    "Siyam Siddique",
    "Artyom Simonyan",
    "Dariusz Smola",
    "Rahman Tanjid",
    "Jason Teo",
    "Benjamin Tso",
    "Christian Wan",
    "Yanbo Wang",
    "Noelle Wu",
    "Brandon Yeung",
    "Tracy Zhou",
    "Mr. Das",
    };
    private String[] badOutcome = new String[]{
    ", commits grand theft auto.",
    ", commits fraud.",
    ", stole some old lady's purse.",
    ", turned off the ethernet.",
    ", drove under the influence.",
    ", vandalised their colleague's car.",
    };
    private String[] goodOutcome = new String[]{
    ", gave the homeless money.",
    ", volunteered at a homeless shelter.",
    ", adopted a puppy.",
    ", finished their project.",
    ", gave somebody a car.",
    ", saved someone.",
    };
    /**
     * Constructor
     */
    public DoorOpeningSimulator(){}


    /**
     * Methods
     */

    public int nameRandomizer(){
        int random_number = (int)(Math.random() * names.length);
        return random_number;
    }

    public int outcomeRandomizer(){
        int random_number = (int)(Math.random() * goodOutcome.length);
        return random_number;
    }

    public String openDoor(){

        return "Door Opens ( ANIMATION WIP )";
    }
    public String closeDoor(){

        return "Door Closes ( ANIMATION WIP )";
    }

    public void mainLoop(){
        String choice = "";
        while (run){
            if (isDoorOpened){
                System.out.println(closeDoor());
                isDoorOpened = false;
            }
            int nameNumber = nameRandomizer();
            int outcomeNumber = outcomeRandomizer();
            double decision = Math.random();
            System.out.print("Your current reputation: " + reputation);
            System.out.print("\nYou open the door to find a person by the name of, " + names[nameNumber] + ", do you wish to let them in?");
            System.out.print(white +"\nYour Choices:" +
                    purple + "\n0." + white + " Exit game" +
                    purple + "\n1:" + white + " Open the Door" +
                    purple + "\n2:" + white + " Do not Open the Door" +
                    purple + "\n: ");
            choice = s.nextLine();

            if (choice.equals("0")){
                System.out.print(purple + "You resigned...");
                if (reputation >= 5){
                    System.out.print(purple + "Wow! Why did you resign? You're built for this job!");
                }
                if (reputation <= -5){
                    System.out.print(purple + "Thank god you resigned. This profession is not for you.");
                }
                run = false;
            }
            if (choice.equals("1")){
                System.out.println(openDoor());
                isDoorOpened = true;
                if (decision > .50){
                    System.out.println(names[nameNumber] + goodOutcome[outcomeNumber]);
                    reputation++;
                }
                else{
                    System.out.println(names[nameNumber] + badOutcome[outcomeNumber]);
                    reputation--;
                }
            }
            if (choice.equals("2")){
                if (decision > .50){
                    System.out.println("Avoided: " + names[nameNumber] + goodOutcome[outcomeNumber]);
                }
                else{
                    System.out.println("Avoided: " + names[nameNumber] + badOutcome[outcomeNumber]);
                }
            }
        }
    }
}

