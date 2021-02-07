package com.babich.stream;

import com.babich.lambda.Gender;
import com.babich.lambda.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.babich.Common.people;

class StreamExamples {
    public static void main(String[] args) {

//        // Filter
//        List<Person> females = people.stream()
//                .filter(p -> p.getGender().equals(Gender.FEMALE))
//                .collect(Collectors.toList());
//
//        females.forEach(System.out::println);

        // Sort
//        List<Person> sortedByAge = people.stream()
//                .sorted(Comparator.comparing(Person::getGender).thenComparing(Person::getAge))
//                .collect(Collectors.toList());

//        sortedByAge.forEach(System.out::println);

        // All match
//        boolean b = people.stream()
//                .allMatch(p -> p.getAge() > 5);

//        System.out.println(b);

        // Max
//        System.out.println("Oldest");
//        people.stream()
//                .max(Comparator.comparing(Person::getAge))
//                .ifPresent(System.out::println);
//        
//        // Min
//        System.out.println("Youngest");
//        people.stream()
//                .min(Comparator.comparing(Person::getAge))
//                .ifPresent(System.out::println);
//        
//        // Group
//        Map<Gender, List<Person>> genderListMap = people.stream()
//                .collect(Collectors.groupingBy(Person::getGender));
//        
//        genderListMap.forEach(((gender, people1) -> {
//            System.out.println(gender);
//            people1.forEach(System.out::println);
//        }));

//        Optional<String> oldestFemale = people.stream()
//                .filter(person -> person.getGender().equals(Gender.FEMALE))
//                .max(Comparator.comparing(Person::getAge))
//                .map(Person::getFirstName);
//


        //Streams
        Path path = Paths.get("src/main/java/com/babich/stream/flatmaptest.txt");
        try {
            Files.lines(path)
                    .map(l -> l.split("\\s+"))
                    .flatMap(Arrays::stream)
                    .distinct()
                    .sorted(Comparator.comparing(String::length).reversed())
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
