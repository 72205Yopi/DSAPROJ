package Dictionary;

import java.util.HashMap;
import java.util.Scanner;

public class DictionaryApp {
    private static HashMap<String, String> dictionary = new HashMap<>();

    public static void main(String[] args) {
        // Load the dictionary data from Book1 and Book2
        loadData();

        Scanner scanner = new Scanner(System.in);
        String option;

        // Display the menu
        do {
            System.out.println("\nDictionary Application");
            System.out.println("1. Look up a word");
            System.out.println("2. Add a new entry");
            System.out.println("3. Update an entry");
            System.out.println("4. Delete an entry");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");
            option = scanner.nextLine();

            switch (option) {
                case "1":
                    lookupWord(scanner);
                    break;
                case "2":
                    addEntry(scanner);
                    break;
                case "3":
                    updateEntry(scanner);
                    break;
                case "4":
                    deleteEntry(scanner);
                    break;
                case "5":
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (!option.equals("5"));
    }

    // Load data from Book1 and Book2
    private static void loadData() {
        // Load Book1 (English to Ilocano) data
        Book1.loadEnglishToIlocano(dictionary);

        // Load Book2 (Tagalog to Ilocano) data
        Book2.loadTagalogToIlocano(dictionary);
        
        System.out.println("Data loaded successfully.");
    }

    // Look up a word in the dictionary
    private static void lookupWord(Scanner scanner) {
        System.out.print("Enter the language (Eng/Tag): ");
        String language = scanner.nextLine().trim().toLowerCase(); // Trim and convert to lowercase
        System.out.print("Enter the word to look up: ");
        String word = scanner.nextLine().trim().toLowerCase(); // Trim and convert to lowercase

        String key = language + ":" + word;  // Form the key
        if (dictionary.containsKey(key)) {
            System.out.println("Translation: " + dictionary.get(key));
        } else {
            System.out.println("Word not found in the dictionary.");
        }
    }

    // Add a new entry to the dictionary
    private static void addEntry(Scanner scanner) {
        System.out.print("Enter the language (Eng/Tag): ");
        String language = scanner.nextLine().trim().toLowerCase(); // Trim and convert to lowercase
        System.out.print("Enter the word to add: ");
        String word = scanner.nextLine().trim().toLowerCase(); // Trim and convert to lowercase
        System.out.print("Enter the translation: ");
        String translation = scanner.nextLine().trim(); // Trim input

        String key = language + ":" + word;
        if (!dictionary.containsKey(key)) {
            dictionary.put(key, translation);
            System.out.println("Entry added successfully.");
        } else {
            System.out.println("Word already exists in the dictionary.");
        }
    }

    // Update an existing entry in the dictionary
    private static void updateEntry(Scanner scanner) {
        System.out.print("Enter the language (Eng/Tag): ");
        String language = scanner.nextLine().trim().toLowerCase(); // Trim and convert to lowercase
        System.out.print("Enter the word to update: ");
        String word = scanner.nextLine().trim().toLowerCase(); // Trim and convert to lowercase
        String key = language + ":" + word;

        if (dictionary.containsKey(key)) {
            System.out.print("Enter the new translation: ");
            String newTranslation = scanner.nextLine().trim(); // Trim input
            dictionary.put(key, newTranslation);
            System.out.println("Entry updated successfully.");
        } else {
            System.out.println("Word not found in the dictionary.");
        }
    }

    // Delete an entry from the dictionary
    private static void deleteEntry(Scanner scanner) {
        System.out.print("Enter the language (Eng/Tag): ");
        String language = scanner.nextLine().trim().toLowerCase(); // Trim and convert to lowercase
        System.out.print("Enter the word to delete: ");
        String word = scanner.nextLine().trim().toLowerCase(); // Trim and convert to lowercase

        String key = language + ":" + word;
        if (dictionary.containsKey(key)) {
            dictionary.remove(key);
            System.out.println("Entry deleted successfully.");
        } else {
            System.out.println("Word not found in the dictionary.");
        }
    }
}
