/*
 * KYLE ANDERSEN 2023
 */

import java.util.Scanner;

public class PPPPP{
    public static void main(String args[]){
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        Scanner scanner = new Scanner(System.in);

        int a_count = 0, e_count = 0, i_count = 0, o_count = 0, u_count = 0, other = 0;

        String line = scanner.nextLine();
        System.out.println(line.length());

        for(int i = 0; i < line.length(); i++){
            if(line.charAt(i) == vowels[0]){
                a_count++;
            }
            else if(line.charAt(i) == vowels[1]){
                e_count++;
            }
            else if(line.charAt(i) == vowels[2]){
                i_count++;
            }
            else if(line.charAt(i) == vowels[3]){
                o_count++;
            }
            else if(line.charAt(i) == vowels[4]){
                u_count++;
            }
            else{
                other++;
            }
        }

        System.out.println(a_count);
        System.out.println(e_count);
        System.out.println(i_count);
        System.out.println(o_count);
        System.out.println(u_count);
        System.out.println(other);

        scanner.close();
    }
}