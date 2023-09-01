package problems;

import java.util.Scanner;
public class palindrome_no {
        public static void main(String[] args) {
            Scanner a=new Scanner(System.in);
            System.out.println("Enter the no:");
            int n=453;
             n=a.nextInt();
            int temp=n;
            int reverse=0,rem;
            while(n!=0){
                rem=n%10;//123=3,2 1
                reverse=(reverse*10)+rem;//0*10 +3=3,32,321
                n=n/10;//12,1,0
            }
            System.out.println("The reversed number is :"+reverse);
            if(temp==reverse)
                System.out.println(temp+" is a palindrome no");
            else
                System.out.println(temp+" is not a palindrome no");
        }
    }


