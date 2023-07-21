package Class1;

public class fourthexample {
    int age;
    String name;

    public fourthexample(int Age, String Name){
        age = Age;
        name = Name;
    };

    public static void main(String[] args) {
        fourthexample about = new fourthexample(18, "Jahid Hasan Noman");
        System.out.println(about.age+ " " + about.name);
    }
}
