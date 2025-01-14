package shima.design;

import java.util.ArrayList;

public class UserInterface {
    public static final String CURR_VERSION = "Version 9.0";

    /**
     * Displays all the welcome screens and designs when the program starts
     */
    public UserInterface() {
        printLogo();
        printWelcomeMessage();
        printVersionDescription();
    }

    /**
     * Print the logo and greeting message
     */
    private void printLogo() {
        System.out.println("\t              ##*                                 ");
        System.out.println("\t   .      . .&####%                               ");
        System.out.println("\t    #%%%%((&%######%**.                           ");
        System.out.println("\t    %#############%#%&&%%%%%##(*.                 ");
        System.out.println("\t . .%%#######%%%%%##############%%%%#(.           ");
        System.out.println("\t/##&@%####&%####&#####%&&&&&&&&&%%%####&/  .      ");
        System.out.println("\t&######%%######%&%%%#################%%%%&#       ");
        System.out.println("\t(@####&#####%&%########################%###@(     ");
        System.out.println("\t,&%#%%%%##%%############%%%%%%%%%%%##########%.   ");
        System.out.println("\t*&#&%%&#%&########&%#(%#/((((((/****#&%&%#####%,  ");
        System.out.println("\t  ,&#%%%%#####%%#(%(((&#(&(((((((((/%#(((%##%%#%. ");
        System.out.println("\t  (%##%%####%%(((/%&((%&#%##((((((((&#(((%#(((&&, ");
        System.out.println("\t  (%#%&####%#((##(#(/###.%#.*(##(((%, /##((%#(#( .");
        System.out.println("\t  *&(&%###%#(((((#/@%%%&,. ...     &%%&%  (&###*  ");
        System.out.println("\t . (%%%###%(((((#/#####&, .. .... /&(#(&,.%(((#(  ");
        System.out.println("\t    *&&##%%(((((%*(%###%. .. .. . *%(##&, (%((#(  ");
        System.out.println("\t      (&#%%((((#%/ .**,. ..... . ...,,,. . (#(%(  ");
        System.out.println("\t        .(%(((((&/ .   .  ...... .. .. . .(%/#%,  ");
        System.out.println("\t          .(%(((#&*,,.           . .,*/*%#((#&*   ");
        System.out.println("\t              ,/(#(    .,,******,.     ####%*     ");
    }

    /**
     * Print the welcome message and the ASCII art when the program starts
     */
    private void printWelcomeMessage() {
        System.out.println("   __          ________ _      _____ ____  __  __ ______    ");
        System.out.println("   \\ \\        / /  ____| |    / ____/ __ \\|  \\/  |  ____|  ");
        System.out.println("    \\ \\  /\\  / /| |__  | |   | |   | |  | | \\  / | |__     ");
        System.out.println("     \\ \\/  \\/ / |  __| | |   | |   | |  | | |\\/| |  __|    ");
        System.out.println("      \\  /\\  /  | |____| |___| |___| |__| | |  | | |____   ");
        System.out.println("     __\\/_ \\/   |______|______\\_____\\____/|_|  |_|______|_ ");
        System.out.println("    / ____| |  | |_   _|  \\/  |   /\\   |  __ \\|_   _| \\ | |");
        System.out.println("   | (___ | |__| | | | | \\  / |  /  \\  | |__) | | | |  \\| |");
        System.out.println("    \\___ \\|  __  | | | | |\\/| | / /\\ \\ |  _  /  | | | . ` |");
        System.out.println("    ____) | |  | |_| |_| |  | |/ ____ \\| | \\ \\ _| |_| |\\  |");
        System.out.println("   |_____/|_|  |_|_____|_|  |_/_/    \\_\\_|  \\_\\_____|_| \\_|");
        //greeting
        System.out.println("\nHi there! My name is Shima Rin and I am a robot that can help you do some wonderful jobs!");
    }

    /**
     * Show the current version's functionality of the bot
     */
    private void printVersionDescription() {
        ArrayList<String> versionDescriptions = new ArrayList<>();
        int maxDescriptionsLength = 0;
        versionDescriptions.add("* " + CURR_VERSION);
        versionDescriptions.add("* In this version, I am equipped with several functions, including PROFILE, HELP, TODO, DEADLINE, EVENT, LIST, DONE, DELETE, DATE, FIND and EXIT");
        versionDescriptions.add("* To know more about how to use the command, you can type \"help\" to view the help menu written by me :P");
        versionDescriptions.add("* I am able to understand your command in any case, meaning that you are free to enter command with any case :D");
        //Finds the length of the longest description to align all '*' displayed
        for (String str : versionDescriptions) {
            if (str.length() > maxDescriptionsLength) {
                maxDescriptionsLength = str.length();
            }
        }
        //Draws the frame for the version description
        for (int i = 0; i < maxDescriptionsLength + 2; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (String str : versionDescriptions) {
            //Uses format string to print the '*' at the correct position after each sentence is completed
            System.out.printf("%1$-" + (maxDescriptionsLength + 1) + "s", str);
            System.out.println("*");
        }
        for (int i = 0; i < maxDescriptionsLength + 2; i++) {
            System.out.print("-");
        }
    }

    /**
     * Shows the message string with a message box
     *
     * @param message The message to print, multiple message strings are accepted
     */
    public void showMessage(String... message) {
        int longestMessageLength = 0;
        for (String msg : message) {
            longestMessageLength = Math.max(msg.length(), longestMessageLength);
        }
        longestMessageLength += 4; //Adds 4 more spaces for each message box
        drawMessageBoxFrame(longestMessageLength);
        for (String msg : message) {
            System.out.println("\t   " + msg);
        }
        drawMessageBoxFrame(longestMessageLength);
    }

    /**
     * Draws the frame for the message box display
     *
     * @param longestMessageLength The string length of the longest message
     */
    private void drawMessageBoxFrame(int longestMessageLength) {
        System.out.print("\t@");
        for (int i = 0; i < longestMessageLength; i++) {
            System.out.print("-");
        }
        System.out.println("@");
    }
}
