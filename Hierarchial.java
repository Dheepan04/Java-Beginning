class shape{
    float length,breadth,radius;
}
class rect extends shape{
    public rect(float l,float b){
    length=l;
    breadth=b;
}
float rect_area(){
        return length*breadth;
                }
}
class square extends shape {
     square(float l) {
        length = l;
    }

    float square_area() {
        return length * length;
    }

     class circle1 extends shape {
        public circle1(float r){
            radius=r;
            this.radius=radius;
        }

         float circlearea() {
            return (float) Math.PI*(radius*radius);
        }
    }
}
public class Hierarchial {
    public static void main(String[] args) {
        rect o1=new rect(2,10);
        System.out.println("AREA OF THE RECTANGLE:"+o1.rect_area());
        square o2=new square(2);
        System.out.println("AREA OF THE SQUARE:"+o2.square_area());


    }



}


