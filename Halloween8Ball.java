import java.util.Random;  // Importing Random class to generate random numbers
import java.util.Scanner; // Importing Scanner class to take input from the user

// This class defines the Halloween8Ball program
public class Halloween8Ball {
    
    // The main method is where the program starts executing
    public static void main(String[] args) {
        
        // Step 1: Create an array (list) of spooky responses for the Halloween 8-ball
        // This array contains all the possible answers the 8-ball will provide to the user.
        String[] responses = {
            "The spirits say yes",                // Positive response
            "Beware of what lies ahead",          // Mysterious, cautionary response
            "A ghostly no",                       // Negative response
            "The pumpkins foresee trouble",       // Cautionary response
            "You are cursed with uncertainty",    // Unclear or uncertain response
            "The bats fly, the answer is yes",    // Positive, spooky response
            "The witch cackles no",               // Negative response with a spooky twist
            "Darkness clouds your fate"           // Mysterious and unclear response
        };

        // Step 2: Set up the scanner to take user input
        // The Scanner class helps capture input from the keyboard.
        Scanner scanner = new Scanner(System.in);

        // Step 3: Ask the user to input a yes/no question
        // The program prompts the user to type a question that expects a yes/no answer.
        System.out.println("Ask the Halloween 8-ball a yes/no question:");
        
        // Step 4: Read the user's input
        // The user's question is captured and stored in a variable, although it's not used in any further logic.
        String question = scanner.nextLine();

        // Step 5: Generate a random response index
        // A random number is generated to pick a random response from the list of spooky responses.
        Random random = new Random();
        int index = random.nextInt(responses.length);  // Ensures the random number is within the bounds of the array

        // Step 6: Display the randomly chosen spooky response
        // The program selects a response based on the random number generated in the previous step and prints it to the screen.
        System.out.println(responses[index]);

        // Step 7: Close the scanner to avoid resource leaks
        // It's important to close the scanner once we're done using it to free up system resources.
        scanner.close();
    }
}
