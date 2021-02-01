/*****************************************************************************
 * Develop a program that asks the user to enter a capital for a U.S. state. *
 * Upon receiving the user input, the program reports whether the user input *
 * is correct. For this application, the 50 states and their capitals are    *
 * stored in a two-dimensional array in order by state name. Display the     *
 * current contents of the array then use a bubble sort to sort the content  *
 * by capital. Next, prompt the user to enter answers for all the state      *
 * capitals and then display the total correct count. The user's answer is   *
 * not case-sensitive. -By Dallas Jammé                                      *
 *****************************************************************************/

import java.util.Scanner;

public class StateCapitals {
    // Main method //
    public static void main(String[] args) {

        // Use getData to create an array from the states and capitals information
        String[][] stateCapitals = makeArray();

        //print original array
        System.out.println("Current Array: ");
        for (String[] states : stateCapitals) {
            System.out.print(states[1] + ", ");
            System.out.println(states[0] + " ");
        }

        // Use getData to create a new array
        String[][] sortedByCapitals = makeArray();

        //Print bubble sorted array by capital
        System.out.println("Sorted Array: ");
        bubbleSort(sortedByCapitals);
        for (String[] states : sortedByCapitals) {
            System.out.print(states[1] + ", ");
            System.out.println(states[0] + " ");
        }

        // Use Scanner to get user data
        Scanner input = new Scanner(System.in);

        // Prompt user to enter each state capital
        int counter = 0;	// Correct answer
        for (String[] stateCapital : stateCapitals) {
            System.out.print("What is the capital of "
                    + stateCapital[0] + "? ");
            String capital = input.nextLine();

            if(capital.equals("end")) {
                break;
            }

            if (isEqual(stateCapital[1], capital)) {
                System.out.println("You are correct!");
                counter++;
            } else {
                System.out.println("The correct answer is " +
                        stateCapital[1]);
            }
        }

        // Display the number of correct answers
        System.out.println("\nThe correct count is " + counter);
        }

    // Bubble sort for 2D string array
    public static void bubbleSort(String[][] str) {
        String state;
        String capital;

        for (int j = 0; j < str.length; j++) {
            for (int k = j + 1; k < str.length; k++) {

                // comparing and swapping adjacent strings
                if (str[k][1].compareTo(str[j][1]) < 0) {
                    state = str[j][0];
                    capital = str[j][1];
                    str[j][0] = str[k][0];
                    str[j][1] = str[k][1];
                    str[k][0] = state;
                    str[k][1] = capital;
                }
            }
        }
    }

    //isEqual will help compare strings to see if entered data is correct
    public static boolean isEqual(String c, String a) {
        String inputCapital = a.toLowerCase();
        String actualCapital = c.toLowerCase();
        if (actualCapital.length() != inputCapital.length())
            return false;

        for (int i = 0; i < c.length(); i++) {
            if (actualCapital.charAt(i) != inputCapital.charAt(i))
                return false;
        }

        return true;
    }

    // getData helps to create arrays of states and capitals
    public static String[][] makeArray() {
        return new String[][]{
                {"Alabama", "Montgomery"}, {"Alaska", "Juneau"}, {"Arizona", "Phoenix"},
                {"Arkansas", "Little Rock"}, {"California", "Sacramento"},
                {"Colorado", "Denver"}, {"Connecticut", "Hartford"},
                {"Delaware", "Dover"}, {"Florida", "Tallahassee"},
                {"Georgia", "Atlanta"},{"Hawaii", "Honolulu"}, {"Idaho", "Boise"},
                {"Illinois", "Springfield"}, {"Indiana", "Indianapolis"},
                {"Iowa Des", "Moines"}, {"Kansas", "Topeka"}, {"Kentucky","Frankfort"},
                {"Louisiana", "Baton Rouge"}, {"Maine", "Augusta"},
                {"Maryland", "Annapolis"}, {"Massachusetts", "Boston"},
                {"Michigan", "Lansing"}, {"Minnesota", "Saint Paul"},
                {"Mississippi", "Jackson"}, {"Missouri", "Jefferson City"},
                {"Montana", "Helena"}, {"Nebraska", "Lincoln"},
                {"Nevada	", "Carson City"}, {"New Hampshire", "Concord"},
                {"New Jersey", "Trenton"}, {"New Mexico", "Santa Fe"},
                {"New York", "Albany"}, {"North Carolina", "Raleigh"},
                {"North Dakota", "Bismarck"},{"Ohio", "Columbus"},
                {"Oklahoma", "Oklahoma City"}, {"Oregon", "Salem"},
                {"Pennsylvania", "Harrisburg"}, {"Rhode Island", "Providence"},
                {"South Carolina", "Columbia"}, {"South Dakota", "Pierre"},
                {"Tennessee", "Nashville"}, {"Texas", "Austin"},
                {"Utah", "Salt Lake City"}, {"Vermont", "Montpelier"},
                {"Virginia", "Richmond"}, {"Washington", "Olympia"},
                {"West Virginia", "Charleston"}, {"Wisconsin", "Madison"},
                {"Wyoming", "Cheyenne"}};
    }
}
