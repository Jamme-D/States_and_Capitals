/*****************************************************************************
 * Revising previous code to store the pairs of states and capitals in a Map *
 * using the HashMap function. Display the content of the Map, then use the  *
 * TreeMap class to sort the map while using a binary search tree for        *
 * storage. The program then prompts the user to enter a state and it then   *
 * displays the capital for the state. --By Dallas Jammé                     *
 *****************************************************************************/
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class SateCapitals2 {

    // Main method //
    public static void main(String[] args) {
        // Create an array from getData and use array to populate a HashMap of states and capitals
        String[][] stateCapitals = makeArray();
        HashMap<String, String> capitalCities = new HashMap<>();
        for (String[] strings : stateCapitals) {
            capitalCities.put(strings[0], strings[1]);
        }

        //print Hashmap using iterator method
        Iterator<String> keys = capitalCities.keySet().iterator();
        Iterator<String> values = capitalCities.values().iterator();
        while (keys.hasNext()) {
            System.out.print(values.next() + ", ");
            System.out.println(keys.next());
        }

        //Create a TreeMap from HashMap to sort data
        TreeMap<String, String> treeMapOfStateCapitals = new TreeMap<>(capitalCities);

        //Print TreeMap data
        Iterator<String> treeKeys = treeMapOfStateCapitals.keySet().iterator();
        Iterator<String> treeValues = treeMapOfStateCapitals.values().iterator();
        while (treeKeys.hasNext()) {
            System.out.print(treeValues.next() + ", ");
            System.out.println(treeKeys.next());
        }

        // Use Scanner to get user data
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a state and program returns the capital
        System.out.print("Enter a state to see the capital: ");
            String state = input.nextLine();
        System.out.println(treeMapOfStateCapitals.get(state));

    }

    // getData helps to create an array of states and capitals
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

