package ru.javawebinar.basejava;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Number {

    public static void main(String[] args) {
        List <Integer> listInt = Arrays.asList(5,7,8,3,2,5);
        List <Integer> result = listInt.stream().reduce(0, (a, b) -> a + b)%2 == 0 ?
                oddOrEven(listInt, p->p%2==0) : oddOrEven(listInt, p->p%2!=0);
        System.out.println(result);
    }

    private static List <Integer> oddOrEven(List <Integer> listInt, Predicate <Integer> predicate) {
        return listInt.stream().filter(predicate).collect(Collectors.toList());
    }

}
