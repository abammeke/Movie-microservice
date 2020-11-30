package com.webnet.moviecatalog;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainLambda {

    public static void main(String[] args) {

        MySum sum = (a, b, c) -> a + b + c;
        //System.out.println(sum.sumIt(6, 8, 9));

        // Thread t = new Thread(()-> System.out.println("Printed inside runnable"));
        List<Person> people = Arrays.asList(
                new Person("John", "Kenedy", 78),
                new Person("John", "Doe", 86),
                new Person("Ade", "Chain", 74),
                new Person("Charles", "Lewis", 60),
                new Person("Lewis", "Caroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Mathew", "Bronte", 45),
                new Person("Mathew", "Arnold", 39)
        );

        //people.sort(Comparator.comparing(Person::getLastName).thenComparing(Person::getAge));

        //people.sort((o1, o3) -> o1.getLastName().compareTo(o3.getLastName()));

        //Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
        List<String> my = people.stream().map(Person::getLastName).collect(Collectors.toList());

       // System.out.println(my);
        //printAll(people);
        //printLastNameWithC(people, p -> p.getLastName().startsWith("C"));
        printLastNameWithC(people, p->true, System.out::println);
    }

    public static void printLastNameWithC(List<Person> pp, Predicate<Person> predicate, Consumer<Person> c) {
        for (Person p : pp) {
            if (predicate.test(p))
                c.accept(p);
        }
    }

    public static void printAll(List<Person> pp) {
        for (Person p : pp) {
            System.out.println(p);
        }
    }

}


interface MySum {

    int sumIt(int a, int b, int c);
}

@Data
@AllArgsConstructor
class Person {
    private String firstName;
    private String lastName;
    private int age;
}