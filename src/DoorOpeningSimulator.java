/**
 * Imports / used to create variable lists
 */
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DoorOpeningSimulator
{
    Scanner s = new Scanner(System.in);
    /**
     * Instance variables
     */
    private boolean run = true;
    private boolean isDoorOpened = false;
    private int reputation = 0;
    private final String purple = "\u001B[35m";
    private final String white = "\u001B[37m";
    private final String[] doorAnimations = new String[] {
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""};
    private final String[] names = new String[] {
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
    private final String[] badOutcome = new String[]{
        ", commits grand theft auto.",
        ", commits fraud.",
        ", stole some old lady's purse.",
        ", turned off the ethernet.",
        ", drove under the influence.",
        ", vandalised their colleague's car.",
    };
    private final String[] goodOutcome = new String[]{
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
    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

    public void mainLoop(){
        String choice = "";
        while (run){
            wait(2000);
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
                    System.out.println(purple + "\nWow! Why did you resign? You're built for this job! Take this trophy as compensation <3\n\n" +
                            "              .-=========-.\n" +
                            "              \\'-=======-'/\n" +
                            "              _|   .=.   |_\n" +
                            "             ((|  {{1}}  |))\n" +
                            "              \\|   /|\\   |/\n" +
                            "               \\__ '`' __/\n" +
                            "                 _`) (`_\n" +
                            "               _/_______\\_\n" +
                            "              /___________\\                                                                                                                                                             jgs\n");
                }
                if (reputation <= -5){
                    System.out.println(purple + "Thank god you resigned. This profession is not for you. This dog forever poop on your face.\n\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣤⡀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣤⣤⣄⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⣿⣿⣷⣶⣶\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣴⣶⣶⣶⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟\n" +
                            "⠀⠀⠀⠀⣀⠀⠀⠀⣠⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⠛⠛⠁⠀\n" +
                            "⠀⠀⠀⢰⣿⣷⣦⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠁⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠉⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠋⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠈⠻⣿⣿⣿⣿⣿⡇⠀⠀⢿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⢀⡄⠀⠀⠀⠀⠈⠻⣿⣿⣿⠇⠀⠀⢸⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⣀⢼⣿⣦⡄⠀⠀⠀⢰⣿⣿⠏⠀⠀⠀⠈⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠼⠿⠿⠿⠿⠿⠆⠀⠀⠿⠿⠏⠀⠀⠀⠀⠀⠹⠿⠿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                }
                run = false;
            }
            if (choice.equals("1")){
                System.out.println(openDoor());
                isDoorOpened = true;
                System.out.println("You have gave, " + names[nameNumber] + ", access to pookie.");
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

