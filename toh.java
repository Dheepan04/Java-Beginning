package problems;//tower of hanoi//
import java.util.*;
public class toh {
    static void toh(int n,String fromrod,String torod,String helperrod) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod" + fromrod + " to rod" + torod);
            return;
        } else {
            toh(n - 1, fromrod, helperrod, torod);

            System.out.println("Move disk " + n + " from rod" + fromrod + " to rod" + torod);
            toh(n - 1, helperrod, torod, fromrod);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of disks:");
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        toh(n,"a","c","b");
    }
}
