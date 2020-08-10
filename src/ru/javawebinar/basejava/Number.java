package ru.javawebinar.basejava;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Number {

    public static void main(String[] args) {
        System.out.println (oddOrEven(Arrays.asList (8,9)));
}
    public static List<Integer> oddOrEven(List<Integer> integers) {
        Map<Boolean,List<Integer>>
                oddsAndEvens = integers.stream()
                .collect(Collectors.partitioningBy(i->i%2==0));
        return oddsAndEvens.get(false).size() % 2 == 0 ?
                oddsAndEvens.get(false) :
                oddsAndEvens.get(true);
    }
}