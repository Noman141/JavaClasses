package Assignment6.nongeneric;

import Assignment6.generic.Generic;

public class GenericTypeTest {
    public static void main(String[] args) {
        Generic<Integer> generic = new Generic<>(10);
        System.out.println(generic.getGeneric());
    }
}
