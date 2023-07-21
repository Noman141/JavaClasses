package Assignment6.generic;

public class Play {
    public static void main(String[] args) {
        Generic<Double> generic = new Generic<>(10.1000);
        System.out.println(generic.getGeneric());

        Generic<String> stringGeneric = new Generic<>("Jahid Hasan Noman");
        System.out.println(stringGeneric.getGeneric());

        Generic<Integer> integerGeneric = new Generic<>(100);
        System.out.println(integerGeneric.getGeneric());

    }
}
