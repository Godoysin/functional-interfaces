package org.lambdas.example;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercice2 {

    private static final List<Integer> NUMBERS = List.of(1, 3, 4, 12, 33, 100, 0);
    private static final List<Integer> NEGATIVE_NUMBERS = List.of(-1, -3, -4, -1, -3, -12, -33, -100);

    public static void printAllNumbers() {
        NUMBERS.stream().forEach(System.out::println);
    }

    public static void printAdd() {
        System.out.println(getAdd());
    }

    private static Integer getAdd() {
//         return NUMBERS.stream()
//                .reduce(0, (x,y) -> x+y);

        return NUMBERS.stream()
                .reduce(0, Integer::sum);
    }

    private static void printMaximum() {
        // There is no 0 in the number list
//        System.out.println(NEGATIVE_NUMBERS.stream()
//                .reduce(0, Integer::max));

        System.out.println(NUMBERS.stream()
                .reduce(Integer.MIN_VALUE, (x,y) -> x>y ? x : y)
        );
    }

    public static void printSumOfSquares() {
        System.out.println(
                NUMBERS.stream()
                        .map(e -> e*e)
                        .reduce(0, Integer::sum)
        );
    }

    public static void printSumOfEvenNumbersCubed() {
        System.out.println(
                NUMBERS.stream()
                        .filter(e -> e%2 == 0)
                        .map(e -> e*e*e)
                        .reduce(0, Integer::sum)
        );
    }

    public static void printEvenList() {
        createEvenList().stream().forEach(System.out::println);
    }

    public static List<Integer> createEvenList() {
        return NUMBERS.stream()
                .filter(e -> e%2 == 0)
                .collect(Collectors.toList());
    }

    public static void printNonRepeatedSortedNegativeNumbers() {
        NEGATIVE_NUMBERS.stream().distinct().sorted().forEach(System.out::println);
    }

    public static void functionalInterfaceWithReduce() {
        BinaryOperator<Integer> add = (x1, x2) -> x1 + x2;

        System.out.println(NUMBERS.stream().reduce(0, add));
    }

    public static void functionalInterfaceWithMap() {
        Function<Integer, Integer> toSquare = x -> x*x;

        (NUMBERS.stream().map(toSquare).collect(Collectors.toList())).forEach(System.out::println);
    }

}
