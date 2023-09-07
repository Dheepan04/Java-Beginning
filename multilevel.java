import java.util.Scanner;

class stu{
    private String name;
    public long regno;
    short ht;
    protected double wt;
    public void input(){
        Scanner s=new Scanner(System.in);
        name=s.nextLine();
    }
    public void output(){
        System.out.println("NAME:"+name);
    }
}
class mark extends stu{
    protected int m1,m2,m3;
    public void input1(){
        input();
        Scanner s=new Scanner(System.in);
        ht=s.nextShort();
        wt=s.nextDouble();
        m1=s.nextInt();
        m2=s.nextInt();
        m3=s.nextInt();
        }
        public void output1(){
        output();
            System.out.println("HEIGHT:"+ht);
            System.out.println("WEIGHT:"+wt);
            System.out.println("MARK 1:"+m1);
            System.out.println("MARK 2;"+m2);
            System.out.println("MARK 3:"+m3);
        }
    }
class avg extends mark{
    protected double avg;
    protected int cutoff;
    public void calling(){
        input1();
        avg=(m1+m2+m3)/3.0;
        cutoff=((m2+m3)/2)+m1;
    }
    public void output3(){
        output1();
        System.out.println("AVERAGE:"+avg);
        System.out.println("CUTOFF:"+cutoff);
    }
}
public class multilevel {
    public static void main(String[] args) {
        avg o1=new avg();
        o1.calling();
        System.out.println("OUTPUTS");
        o1.output3();
    }
}
