
package problems;
import java.util.Scanner;
    public class factorial {
        int fact(int n) {

            if (n == 1)
                return 1;
            else
                return fact(n - 1) * n;

        }



            public static void main(String args[]) {
                int  n;
                factorial i =new factorial();
                System.out.println("Enter the no:");
                Scanner hi = new Scanner(System.in);
                    n = hi.nextInt();


                System.out.println("Factorial of " + n + " is :" + i.fact(n));

            }
        }




