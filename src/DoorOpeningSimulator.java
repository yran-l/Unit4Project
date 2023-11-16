/**
 * Imports / used to create variable lists
 */
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class DoorOpeningSimulator {
    Scanner s = new Scanner(System.in);
    /**
     * Instance variables
     */
    public boolean run = true;
    private boolean isDoorOpened = false;
    public int reputation = 0;
    public final String purple = "\u001B[35m";
    public final String white = "\u001B[37m";
    public final String[] names = new String[]{
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
    public final String[] entrances = new String[]{
            "Someone walks up to the door, name, asks to be let in.",
            "Someone sprints to the door, name, demanding you let them in.",
            "Someone crab-walks to the door, name, politely asks you to let them in.",
            "Someone nonchalantly walks to the door, name, could care less if you let them in.",
    };
    public final String[] badOutcome = new String[]{
            ", commits grand theft auto.",
            ", commits fraud.",
            ", stole some old lady's purse.",
            ", turned off the ethernet.",
            ", drove under the influence.",
            ", vandalised their colleague's car.",
            ", clogged the toilet.",

    };
    public final String[] goodOutcome = new String[]{
            ", gave the homeless money.",
            ", volunteered at a homeless shelter.",
            ", adopted a puppy.",
            ", finished their project.",
            ", gave somebody a car.",
            ", saved someone.",
            ", did your math homework.",
            ", donated money to orphans.",

    };

    /**
     * Constructor
     */
    public DoorOpeningSimulator() {
    }


    /**
     * Methods
     */

    public int nameRandomizer() {
        return (int) (Math.random() * names.length);
    }

    public int badOutcomeRandomizer() {
        return (int) (Math.random() * badOutcome.length);
    }

    public int goodOutcomeRandomizer() {
        return (int) (Math.random() * goodOutcome.length);
    }

    public int entranceRandomizer() {
        return (int) (Math.random() * entrances.length);
    }

    public String putNameIntoEntrance(String name) {
        int entranceRandom = entranceRandomizer();
        int i = entrances[entranceRandom].indexOf("name");
        return entrances[entranceRandom].substring(0, i) + name + entrances[entranceRandom].substring(i + 4);
    }

    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
