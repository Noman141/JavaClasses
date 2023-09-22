package Datatypes;

public class TernaryOperator {
    public static void main(String[] args) {
        int x=20;
        int y=10;
        int z=x;
        z=(x>y)?(x+y) : (x/y);
        System.out.println(z);
        z=(x<y)?(x+y) : (x/y);
        System.out.println(z);
    }
}
