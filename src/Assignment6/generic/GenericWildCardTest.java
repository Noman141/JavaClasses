package Assignment6.generic;

public class GenericWildCardTest {
    public static void main(String[] args) {
        GenericWildCard<Integer> genericWildCard = new GenericWildCard<Integer>(10);
        System.out.println(genericWildCard.getWildCard());
        GenericWildCard<Double> doubleGenericWildCard = new GenericWildCard<Double>(100.100);
        System.out.println(doubleGenericWildCard.getWildCard());
    }
}
