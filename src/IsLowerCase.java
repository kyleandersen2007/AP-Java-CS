import java.util.Scanner;

public class IsLowerCase {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        char c = scanner.nextLine().charAt(0);

        Character myCharacter = Character.toUpperCase(c);

        System.out.println(myCharacter);

        scanner.close();
    }
}
