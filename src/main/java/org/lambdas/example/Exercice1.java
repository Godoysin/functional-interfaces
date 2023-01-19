package org.lambdas.example;

import java.util.List;
import java.util.stream.Collectors;

public class Exercice1 {

    private static final List<String> COURSES = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");

    public static void printAllCourses() {
        COURSES.stream().forEach(System.out::println);
    }

    public static void printSpringCourses() {
        COURSES.stream()
                .filter(e -> e.contains("Spring"))
                .forEach(System.out::println);
    }

    public static void printPlus4LetterCourses() {
        COURSES.stream()
                .filter(e -> e.length() >= 4)
                .forEach(System.out::println);
    }

    public static void printOddNumberCubeCourses() {
        COURSES.stream()
                .filter(e -> e.length()%2 != 0)
                .map(e -> e + ": " + e.length()*e.length()*e.length())
                .forEach(System.out::println);
    }

    public static void printCourseTitlesLengthList() {
        createCourseTitlesLengthList().stream().forEach(System.out::println);
    }

    private static List<Integer> createCourseTitlesLengthList() {
        return COURSES.stream()
                .map(e -> e.length())
                .collect(Collectors.toList());
    }

}
