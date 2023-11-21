//Kyle Andersen
//External Sources
//https://www.geeksforgeeks.org/largest-substring-with-same-characters/
//w3schools.com

public class LStreak {
    public static void main(String args[]) {
        longestStreak("CCCAAAAAAATTTTT");
    }

    public static void longestStreak(String str) {

        if (!str.isEmpty()) {
            char currentChar = str.charAt(0);// We need to start at the first index of our string, There is probably a
                                             // simpler way to find this
            int currentStreak = 1; // Obviously if there are any characters, the currentStreak must be 1
            char longestChar = currentChar; // This too, if there is only one character this allows us to use a simpler
                                            // test case than writing an if statement
            int longestStreak = currentStreak; // What is our current Streak?
            for (int i = 1; i < str.length(); i++) { // This confused me at first, starting at index 1 might be an error
                                                     // but whatever
                if (str.charAt(i) == currentChar) { // We will compare the char in the string
                    currentStreak++; // increment our largest streak
                } else {// IMPORTANT!!! if we don't have a matching char, our sequence is broken and we
                        // must restart all over again we then will set our currentStreak to 1 as this
                        // is the new first occurence
                    currentStreak = 1;
                    currentChar = str.charAt(i);
                }

                if (currentStreak > longestStreak) { // The most important part of the code is right here
                                                     // with this statement we check if our streak is currently larger
                                                     // than the previous one, if so change the variables
                    longestStreak = currentStreak;
                    longestChar = currentChar;
                }
            }

            System.out.print(longestChar + " " + longestStreak);
        } else {
            System.err.println("You cannot pass an empty string into this method");
        }

    }
}
