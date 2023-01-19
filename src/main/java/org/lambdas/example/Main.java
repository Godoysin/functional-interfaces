package org.lambdas.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

//        printAllNumbersInListStructured(List.of(1,2,3,4,5,6));
//        printAllEvenNumbersInListStructured(List.of(1,2,3,4,5,6));

//        Exercice1.printAllCourses();
//        Exercice1.printSpringCourses();
//        Exercice1.printPlus4LetterCourses();
//        Exercice1.printOddNumberCubeCourses();
//        Exercice1.printCourseTitlesLengthList();

//        Exercice2.printAdd();
//        Exercice2.printMaximum();
//        Exercice2.printSumOfSquares();
//        Exercice2.printSumOfEvenNumbersCubed();
//        Exercice2.printEvenList();
//        Exercice2.printNonRepeatedSortedNegativeNumbers();
//        Exercice2.functionalInterfaceWithReduce();
//        Exercice2.functionalInterfaceWithMap();

//        Exercice3.checkLegalAge();
        Exercice3.asd();
    }

    private static void printAllNumbersInListStructured(List<Integer> numberList) {
//        numberList.stream().forEach(e -> System.out.println());
//        numberList.stream().forEach(Main::print);
        numberList.stream().forEach(System.out::println);
    }

    private static void printAllEvenNumbersInListStructured(List<Integer> numberList) {
//        numberList.stream()
//                .filter(e -> e%2 == 0)
//                .forEach(System.out::println);
        numberList.stream()
                .filter(Main::isEven)
                .forEach(System.out::println);
    }

    private static boolean isEven(Integer number) {
        return number%2 == 0;
    }

    private static void print(Integer number) {
        System.out.println(number);
    }
}