import java.util.Scanner;

public class LeapYear {

    public static boolean IsLeapYear(int year){

        if((year % 4 == 0) || (year % 400 == 0 && year % 100 != 0)){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        if(year < 1582){
            System.out.println("ERROR:The calender was not created before this time!");
        }

        System.out.println(IsLeapYear(year));
        
        scanner.close();

    }
}
