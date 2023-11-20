public class DoorOpeningSimulator {

    /**
     * This DoorOpeningSimulator class generates all randomization data, and contains ANSI variables.
     */

    public boolean run = true;
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
    public final String[] badOutcomes = new String[]{
            ", commits grand theft auto.",
            ", commits fraud.",
            ", stole some old lady's purse.",
            ", turned off the ethernet.",
            ", drove under the influence.",
            ", vandalised their colleague's car.",
            ", clogged the toilet.",

    };
    public final String[] goodOutcomes = new String[]{
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
     * Constructor for the DoorOpeningSimulator class. Initializes this class into the runner class.
     */

    public DoorOpeningSimulator() {
    }


    /**
     * The nameRandomizer method will generate a random number for the names in the list above, under the variable "names".
     * @return returns an integer that is used as the randomization of names.
     */

    public int nameRandomizer() {
        return (int) (Math.random() * names.length);
    }

    /**
     * The badOutcomeRandomizer method will generate a random number for the bad outcomes in the list above, under the variable "badOutcomes".
     * @return returns an integer that is used as the randomization of bad outcomes.
     */

    public int badOutcomeRandomizer() {
        return (int) (Math.random() * badOutcomes.length);
    }

    /**
     * The goodOutcomeRandomizer method will generate a random number for the good outcomes in the list above, under the variable "goodOutcomes".
     * @return returns an integer that is used as the randomization of good outcomes.
     */

    public int goodOutcomeRandomizer() {
        return (int) (Math.random() * goodOutcomes.length);
    }

    /**
     * The entranceRandomizer method will generate a random number for the entrances in the list above, under the variable "entrances".
     * @return returns an integer that is used as the randomization of entrances.
     */

    private int entranceRandomizer() {
        return (int) (Math.random() * entrances.length);
    }

    /**
     * putNameIntoEntrance method for DoorOpeningSimulator class. Method will return a String that
     * puts the randomized name into the entrance.
     * @param name represents the current name in DoorOpeningSimulator.
     * @return returns a String that has the name substituted within the entrance.
     */

    public String putNameIntoEntrance(String name) {
        int entranceRandom = entranceRandomizer();
        int i = entrances[entranceRandom].indexOf("name");
        return entrances[entranceRandom].substring(0, i) + name + entrances[entranceRandom].substring(i + 4);
    }

    /**
     * toString method for DoorOpeningSimulator class.
     * @return returns a String that represents the introduction of the story.
     */

    public String toString(){
        return white + "Door Opening Simulator ( early access )"
                + white + "\nHere lies a door that invites its visitors to the land of " + purple + "pookie."
                + white + "\nYou are the " + purple + "gatekeeper of this door."
                + purple + "\n-1 " + white + "to start: ";
    }
    /**
     * wait method for DoorOpeningSimulator class. Method will pause the console for ms long.
     * @param ms represents milliseconds you would like to wait.
     */

    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
