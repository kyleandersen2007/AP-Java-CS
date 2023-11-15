import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class vip {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        List<String> vipNames = new ArrayList<String>(); //Elements on the list, this is interchangable, and is used to compare the string(s)
        List<String> peopleInClub = new ArrayList<String>(); // Elements inside of the "club", this is used to add and make sure there is no duplicates

        //Loop/Input until the club is full of the VIPs
        do {
            String guestToCheck = scanner.nextLine();

            if (vipNames.contains(guestToCheck) && !peopleInClub.contains(guestToCheck)) {
                peopleInClub.add(guestToCheck);
            }     

        }
        while (!vipNames.equals(peopleInClub));

        scanner.close();
    }
}
