class rectangle {
    private int length, width;

    int getlength() {
        return length;
    }

    void setlength(int l) {
        length = l;
    }

    int getWidth() {
        return width;
    }

    void setWidth(int w) {
        width = w;
    }

    int area() {
        int a = length * width;
        return a;
    }
}
    public class get_set {
        public static void main(String[] args) {
            rectangle hi = new rectangle();
            hi.setlength(10);
            hi.setWidth(20);
            System.out.println("Area of the rectangle:" + hi.area());
            System.out.println(hi.getlength());
        }

    }


