package Assignment5.Polymorphism;

class Overriding {
    void Show(){
        System.out.println(1);
    }
}

class OverridingSecondary extends Overriding {
    void Show(){
        System.out.println(2);
    }

}

class Main {
    public static void main(String[] args) {
        Overriding overriding = new Overriding();
        OverridingSecondary overridingSecondary = new OverridingSecondary();
        overriding.Show();
        overridingSecondary.Show();
    }
}