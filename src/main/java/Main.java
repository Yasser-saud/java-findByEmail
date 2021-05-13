import java.util.*;

public class Main {

    private class Search {

        public String findByEmail(HashMap<Integer, String> table, String input) {
            String match = new String();
            for (Map.Entry entry : table.entrySet()) {
                if (entry.getValue().equals(input)) {
                    return match = "Match: \n" + "ID: " + entry.getKey() + ", " + "Email: " + entry.getValue();
                }
            }
            return match = "not match";
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Main.Search search = new Main().new Search();
        HashMap<Integer, String> table = new HashMap<>();

        table.put(1, "example1@example1.com");
        table.put(2, "example2@example2.com");
        table.put(3, "example3@example3.com");
        table.put(4, "example4@example4.com");
        table.put(5, "example5@example5.com");
        table.put(6, "example6@example6.com");
        table.put(7, "example7@example7.com");
        table.put(8, "example8@example8.com");
        table.put(9, "example9@example9.com");
        table.put(10, "example10@example10.com");

        while (true) {
            System.out.print("Please enter the email address your trying to look for in the database: ");
            String input = s.nextLine();
            String result = search.findByEmail(table, input);
            System.out.println(result);

            System.out.print("want to continue? Enter Y to exit: ");
            String exit = s.nextLine().toUpperCase(Locale.ROOT);

            if (exit.equals("Y"))
                break;
            else
                continue;
        }

    }

}