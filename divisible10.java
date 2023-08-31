package problems;/*
find the nearest no divisible by 10 which is less than or equal to n
 */
import java.util.Scanner;

public class divisible10 {
    public static void main(String[] args) {
        System.out.println("Enter the no:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n >= 0) {
            if (n % 10 == 0) {
                System.out.println("The nearest number is:" + n);
                break;
            } else {
                n--;
            }

        }
    }
}