package Class2;

public class MathmaticalOperation {
    int x;
    int y;

    public MathmaticalOperation(){
        x = 50;
        y = 5;
    }

    public static void main(String[] args) {
        MathmaticalOperation X =  new MathmaticalOperation();
        MathmaticalOperation Y = new MathmaticalOperation();

        System.out.println(X.x * Y.y);
        System.out.println(X.x / Y.y);
        System.out.println(X.x % Y.y);
        System.out.println(X.x + Y.y);
        System.out.println(X.x - Y.y);
    }
}
