package problems;

import java.util.Scanner;

public class palindrome_string {
    public static void main(String[] args) {
        System.out.println("Enter the string:");
        Scanner s = new Scanner(System.in);
        String str = s.next();
        // String orig_string=str;
        String rev = "";  //note

        for(int i=str.length()-1;i>=0;i--) {
            rev=rev+str.charAt(i);
        }
            System.out.println(rev);
            System.out.println(str);
            if (str.equalsIgnoreCase(rev))
                System.out.println(str + " is a palindrome");
            else
                System.out.println(str + " is not a palindrome string");
        }
    }

