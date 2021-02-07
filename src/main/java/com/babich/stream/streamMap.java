package com.babich.stream;

import com.babich.lambda.Gender;
import com.babich.lambda.Person;

import java.util.Comparator;

import static com.babich.Common.people;

class StreamMap {
    public static void main(String[] args) {
      
        people.stream()
                .sorted(Comparator.comparing(Person::getGender).thenComparing(Person::getAge))
                .filter(p -> p.getGender().equals(Gender.FEMALE))
                .filter(p -> p.getAge() > 40)
                .map(Person::getFirstName)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
