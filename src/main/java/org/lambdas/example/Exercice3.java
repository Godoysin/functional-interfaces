package org.lambdas.example;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exercice3 {

    private static List<Person> personList = List.of(
            new Person("David", 28),
            new Person("Maria", 24),
            new Person("Juan", 17)
    );

    public static void checkLegalAge() {
        Predicate<Person> ofLegalAgePredicate = person -> person.getAge() > 18;

        System.out.println("Are all over 18?: " + personList.stream().allMatch(ofLegalAgePredicate));
        System.out.println("Is any over 18?: " + personList.stream().anyMatch(ofLegalAgePredicate));
        personList.stream().filter(ofLegalAgePredicate).forEach(e -> System.out.println(e.getName() + " is of legal age"));
    }

    public static void asd() {
        System.out.println(personList.stream()
                .collect(Collectors.groupingBy(Person::getName, Collectors.toList()))
        );

        personList.stream()
                .collect(Collectors.groupingBy(
                        Person::getName,
                        Collectors.mapping(Person::getName, Collectors.toList()))
                )
                .values().stream()
                .map(e -> e.get(0))
                .forEach(System.out::println);
    }

}
