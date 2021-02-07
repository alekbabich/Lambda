package com.babich.lambda;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static com.babich.Common.people;

public class LamdaSort {
    public static void main(String[] args) {
                
        people.sort(Comparator.comparing(Person::getAge));

        System.out.println("Printing all people");
        performConditionally(people, p -> true, System.out::println);
        System.out.println();
        System.out.println("Print people whose name starts with A");
        performConditionally(people, p -> p.getFirstName().startsWith("A"), p -> System.out.println(p.getFirstName()));
        System.out.println();
        System.out.println("Print older than 15");
        performConditionally(people, p -> p.getAge() > 15, p -> System.out.println(p.getFirstName() + " is " + p.getAge()));
        
    }
    
    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person person : people ) {
            if (predicate.test(person)) {
                consumer.accept(person);
            }
        }
    }
}
