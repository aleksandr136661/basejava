package ru.javawebinar.basejava;

import java.util.stream.Stream;

public class Value {
    public static void main(String[] args) {
        int result = minValue();
        System.out.println(result);
    }

    private static int minValue() {
        return Stream.of(1, 2, 3, 2, 2, 3)
                        .distinct()
                        .reduce(0, (a, b) -> 10 * a + b);
    }
}
