import java.util.Scanner;

class students {
    private String name;
    public long regno;  //accessed by only this same class
    protected int phy, chem; //access within same package

    public void input() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name:");
        name = s.nextLine();
    }

    public void output() {
        System.out.println("NAME: " + name);
    }
}
class engg extends students {
    protected int maths;
    protected int cutoff;
    public void input1() {
        input();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the register no:");
        regno = s.nextLong();
        System.out.println("Enter the physics mark:");
        phy = s.nextInt();
        System.out.println("Enter the chemistry mark:");
        chem = s.nextInt();
        System.out.println("Enter the maths mark:");
        maths = s.nextInt();
        cutoff=((phy+chem)/2)+maths;
    }

    public void output1() {
        output();
        System.out.println("register no:" + regno);
        System.out.println("phy:" + phy);
        System.out.println("chem:" + chem);
        System.out.println("maths:" + maths);
        System.out.println("engg cutoff:"+cutoff);
    }
}
class medi extends students{
        protected int bio;
        protected int cutoff;
        public void input1(){
            input();
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the reg no:");
            regno=s.nextLong();
            System.out.println("Enter the phy mark:");
            phy=s.nextInt();
            System.out.println("Enter the chem mark:");
            chem=s.nextInt();
            System.out.println("Enter the bio mark:");
            bio=s.nextInt();
            cutoff=((phy+chem)/2)+bio;
        }
        public void output1(){
            output();
            System.out.println("regno"+regno);
            System.out.println("phy"+phy);
            System.out.println("chem"+chem);
            System.out.println("bio"+bio);
            System.out.println("medical cutoff:"+cutoff);
        }
    }

public class hier2important {
    public static void main(String[] args) {
        engg s2 = new engg();
        medi s3 = new medi();
        System.out.println("input for engineering students");
        s2.input1();
        System.out.println("___________________________________");
        System.out.println("input for medical students");
        s3.input1();
        System.out.println("output for engg ");
        s2.output1();
        System.out.println("___________________________________");
        System.out.println("medical outputs");
        s3.output1();
    }
}


