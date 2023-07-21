package Assignment5.Polymorphism;

public class Overlooding {

    void Show(int a,int b){
        System.out.println(10);
    }

    void Show(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Overlooding overlooding = new Overlooding();
        overlooding.Show("Jahid Hasan Noman");
    }

}
