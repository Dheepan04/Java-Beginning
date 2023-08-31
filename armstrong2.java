//check armstrong no between 100 and 999
package problems;
public class armstrong2 {
    public static void main(String[] args) {

        System.out.println(" no between 100 and 999 which are armstrong");

        int d1,d2,d3,result,temp,num;
        for( num=100;num<=999;num++){
            temp=num;
            d3=temp%10;
            temp=temp/10;

            d2=temp%10;
            temp=temp/10;

            d1=temp%10;

            result=(d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3);
            if(result==num)
                System.out.println(num+" is a armstrong no");
        }
    }

}
