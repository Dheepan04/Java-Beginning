package problems;
import java.util.Scanner;
public class fib_recursion {
   static int fib(int n){
        if(n<=1)
            return n;
        else
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        int N;
        Scanner hi=new Scanner(System.in);
        System.out.println("Enter the no:");
        N= hi.nextInt();
        for(int i=0;i<N;i++)
        {
            System.out.print(fib(i));
            System.out.print("\t");
        }
    }
}
