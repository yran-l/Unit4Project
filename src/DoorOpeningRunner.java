import java.util.Scanner;
public class DoorOpeningRunner {
    public static void main(String[] args) {

//        /**
//         * Creating the animation / door.
//         */

        Animation door = new Animation();
        door.setVisible(true);
        Scanner s = new Scanner(System.in);
        DoorOpeningSimulator dos = new DoorOpeningSimulator();
        door.updateGif();

//        /**
//         * Displaying the initial information of the game/introduction to the game.
//         */

        System.out.print(dos.toString());
        String input = s.nextLine();

//        /**
//         * Game loop begins
//         */

        if (input.equals("-1")){
            String choice;
            while (dos.run){

//                /**
//                 * Randomization of names and outcomes.
//                 */

                DoorOpeningSimulator.wait(1000);
                int nameNumber = dos.nameRandomizer();
                int goodOutcomeNumber = dos.goodOutcomeRandomizer();
                int badOutcomeNumber = dos.badOutcomeRandomizer();
                double decision = Math.random();

//                /**
//                 * Displaying a menu to help guide the user.
//                 */

                System.out.println(dos.purple + "\n\nYour current reputation: " + dos.reputation);
                System.out.print(dos.purple + dos.putNameIntoEntrance(dos.names[nameNumber]) + "\nWill you let them in?");
                System.out.print(dos.white +"\nYour Choices:" +
                        dos.purple + "\n0." + dos.white + " Exit game" +
                        dos.purple + "\n1:" + dos.white + " Open the Door" +
                        dos.purple + "\n2:" + dos.white + " Do not open the Door" +
                        dos.purple + "\n: ");
                choice = s.nextLine();

//                /**
//                 * First choice in the menu.
//                 * Quitting the game, provides text and images depending on current reputation.
//                 */

                if (choice.equals("0")){
                    System.out.print(dos.purple + "You resigned...");
                    if (dos.reputation >= 3){
                        System.out.println(dos.purple + "\nWow! Why did you resign? You're built for this job! Take this trophy as compensation <3\n\n" +
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
                        System.out.println(dos.purple + "Thank god you resigned. This profession is not for you. This dog forever poop on your face.\n\n" +
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

//                /**
//                 * Second choice in the menu.
//                 * Opening the door.
//                 */

                if (choice.equals("1")){

//                    /**
//                     * Animation is updated, opening the door and closing the door in the separate window.
//                     */

                    door.updateGif();
                    System.out.println("You have gave, " + dos.names[nameNumber] + ", access to pookie.");
                    DoorOpeningSimulator.wait(6000);
                    door.updateGif();

//                    /**
//                     * Displays the good outcome, adds one reputation.
//                     */

                    if (decision > .50){
                        System.out.println(dos.names[nameNumber] + dos.goodOutcomes[goodOutcomeNumber]);
                        dos.reputation++;
                    }

//                    /**
//                     * Displays the bad outcome, deducts one reputation.
//                     */

                    else{
                        System.out.println(dos.names[nameNumber] + dos.badOutcomes[badOutcomeNumber]);
                        dos.reputation--;
                    }
                }

//                /**
//                 * Third choice in the menu.
//                 * Not opening the door.
//                 */

                if (choice.equals("2")){
                    if (decision > .50){

//                        /**
//                         * Displays avoided outcome.
//                         */

                        System.out.println("Avoided: " + dos.names[nameNumber] + dos.goodOutcomes[goodOutcomeNumber]);
                    }

                    else{
                        System.out.println("Avoided: " + dos.names[nameNumber] + dos.badOutcomes[badOutcomeNumber]);
                    }
                }

//                /**
//                 * Handles invalid choices.
//                 */

                if (!choice.equals("0") && !choice.equals("1") && !choice.equals("2") && !choice.equals("easteregg")){
                    System.out.println("this is not a choice. the person has not been let in, next person.");
                }

//                /**
//                 * Easter egg for those who read my code !
//                 * Also, Thanksgiving time, so enjoy !
//                 */

                if (choice.equals("easteregg")){
                    System.out.println("""
                                                         ,+*^^*+___+++_
                                                   ,*^^^^              )
                                                _+*                     ^**+_
                                              +^       _ _++*+_+++_,         )
                                  _+^^*+_    (     ,+*^ ^          \\+_        )
                                 {       )  (    ,(    ,_+--+--,      ^)      ^\\
                                { (@)    } f   ,(  ,+-^ __*_*_  ^^\\_   ^\\       )
                               {:;-/    (_+*-+^^^^^+*+*<_ _++_)_    )    )      /
                              ( /  (    (        ,___    ^*+_+* )   <    <      \\
                               U _/     )    *--<  ) ^\\-----++__)   )    )       )
                                (      )  _(^)^^))  )  )\\^^^^^))^*+/    /       /
                              (      /  (_))_^)) )  )  ))^^^^^))^^^)__/     +^^
                             (     ,/    (^))^))  )  ) ))^^^^^^^))^^)       _)
                              *+__+*       (_))^)  ) ) ))^^^^^^))^^^^^)____*^
                              \\             \\_)^)_)) ))^^^^^^^^^^))^^^^)
                               (_             ^\\__^^^^^^^^^^^^))^^^^^^^)
                                 ^\\___            ^\\__^^^^^^))^^^^^^^^)\\\\               \s
                                      ^^^^^\\uuu/^^\\uuu/^^^^\\^\\^\\^\\^\\^\\^\\^\\                    \s
                                         ___) >____) >___   ^\\_\\_\\_\\_\\_\\_\\)        \s
                                        ^^^//\\\\_^^//\\\\_^       ^(\\_\\_\\_\\)
                                          ^^^ ^^ ^^^ ^^
                            EASTER EGG +100 REPUTATION HAPPY THANKSGIVING!!""");
                    dos.reputation += 100;
                }
            }
        }
    }
}