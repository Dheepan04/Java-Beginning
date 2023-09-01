import java.util.Scanner;
class student{
    private String name;
    public long regno;
    short ht;
    protected double wt;
    public void input(){
        Scanner s=new Scanner(System.in);
        name=s.nextLine();
    }
    public void output(){
        System.out.println(name);
    }
}
    class marks extends student{
    protected int m1,m2,m3;
        public void input1() {
            input();
            Scanner m=new Scanner(System.in);
            regno=m.nextLong();
            wt=m.nextDouble();
            ht=m.nextShort();
            m1=m.nextInt();
            m2=m.nextInt();
            m3=m.nextInt();
        }
        public void output1(){
            output();
            System.out.println(regno);
            System.out.println(wt);
            System.out.println(ht);
            System.out.println(m1);
            System.out.println(m2);
            System.out.println(m3);
        }
    }
public class single_inherit {
    public static void main(String[] args) {
        marks s=new marks();
        s.input1();
        System.out.println("outputs");
        s.output1();
    }
}
