import java.util.Scanner;

public class HighestValue {
    public static void main(String args[]){
        int highestNumber = 0;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 10; i++)
        {
            int userNum = scanner.nextInt();

            if(userNum > highestNumber){
                highestNumber = userNum;
            }
        }

        System.out.println(highestNumber);

        scanner.close();
    }
}
