import java.util.Scanner;
public class DoorOpeningRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DoorOpeningSimulator DOS = new DoorOpeningSimulator();
        String purple = "\u001B[35m";
        String white = "\u001B[37m";
        System.out.print(white + "Door Opening Simulator ( BETA )"
        + white + "\nHere lies a door that invites its visitors to the land of " + purple + "pookie."
        + white + "\nYou are the " + purple + "gatekeeper of this door."
        + white + "\nPress " + purple + "-1 to start: ");
        String input = s.nextLine();
        if (input.equals("-1")){
            DOS.mainLoop();
        }
    }
}