import java.util.Scanner;
public class DoorOpeningRunner {
    public static void main(String[] args) {
        Animation door = new Animation();
        door.setVisible(true);
        Scanner s = new Scanner(System.in);
        DoorOpeningSimulator dos = new DoorOpeningSimulator();
        String purple = "\u001B[35m";
        String white = "\u001B[37m";
        System.out.print(white + "Door Opening Simulator ( early access )"
        + white + "\nHere lies a door that invites its visitors to the land of " + purple + "pookie."
        + white + "\nYou are the " + purple + "gatekeeper of this door."
        + purple + "\n-1 " + white + "to start: ");
        String input = s.nextLine();
        if (input.equals("-1")){
            String choice;
            while (dos.run){
                if (dos.isDoorOpened){
                    door.updateGif();
                }
                DoorOpeningSimulator.wait(3000);
                int nameNumber = dos.nameRandomizer();
                int goodOutcomeNumber = dos.goodOutcomeRandomizer();
                int badOutcomeNumber = dos.badOutcomeRandomizer();

                double decision = Math.random();
                System.out.println(purple + "\n\nYour current reputation: " + dos.reputation);
                System.out.print(purple + dos.putNameIntoEntrance(dos.names[nameNumber]) + "\nWill you let them in?");
                System.out.print(dos.white +"\nYour Choices:" +
                        purple + "\n0." + dos.white + " Exit game" +
                        purple + "\n1:" + dos.white + " Open the Door" +
                        purple + "\n2:" + dos.white + " Do not Open the Door" +
                        purple + "\n: ");
                choice = s.nextLine();

                if (choice.equals("0")){
                    System.out.print(purple + "You resigned...");
                    if (dos.reputation >= 3){
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
                    if (dos.reputation <= -3){
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
                    dos.run = false;
                }
                if (choice.equals("1")){
                    door.updateGif();
                    DoorOpeningSimulator.wait(3000);
                    System.out.println("You have gave, " + dos.names[nameNumber] + ", access to pookie.");
                    door.updateGif();
                    dos.isDoorOpened = true;
                    if (decision > .50){
                        System.out.println(dos.names[nameNumber] + dos.goodOutcome[goodOutcomeNumber]);
                        dos.reputation++;
                    }
                    else{
                        System.out.println(dos.names[nameNumber] + dos.badOutcome[badOutcomeNumber]);
                        dos.reputation--;
                    }
                }
                if (choice.equals("2")){
                    if (decision > .50){
                        System.out.println("Avoided: " + dos.names[nameNumber] + dos.goodOutcome[goodOutcomeNumber]);
                    }
                    else{
                        System.out.println("Avoided: " + dos.names[nameNumber] + dos.badOutcome[badOutcomeNumber]);
                    }
                }
            }
        }
    }
}