package Java.Multilevel.Inheritance;

public class IPhone11 extends IPhone{
    public static void main(String[] args) {
        IPhone11 iPhone11 = new IPhone11();

        iPhone11.name="IPhone11";

        iPhone11.camera();
        iPhone11.MakeCall();
        iPhone11.playVideo();
    }

}
