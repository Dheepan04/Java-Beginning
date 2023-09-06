public class methodargs {
    public static void getNames(String...names){
        for(String name:names){
            System.out.println(name);
        }
    }
    public static void main(String args[]){
        getNames("dheepan","dhee");
    }

}
