package Class2;

public class Incriment {
    int num= 10;
    int num2=20;

    public static void main(String[] args) {
        Incriment Num = new Incriment();
        Incriment Num2 = new Incriment();

        System.out.println(Num.num+Num2.num2);
        System.out.println(Num.num-Num2.num2);
        System.out.println(Num2.num2-Num.num);
        System.out.println(++Num.num);
        System.out.println(Num2.num2--);
        System.out.println(Num2.num2);
        System.out.println(++Num2.num2);
        System.out.println(Num2.num2++);
        System.out.println(Num2.num2);


    }
}
