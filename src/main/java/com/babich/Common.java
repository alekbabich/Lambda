package com.babich;

import com.babich.lambda.Gender;
import com.babich.lambda.Person;

import java.util.Arrays;
import java.util.List;

public class Common {
   
    public static final List<Person> people = Arrays.asList(
            new Person("Alek","Babich",42, Gender.MALE),
            new Person("Jennifer","Babich",41, Gender.FEMALE),
            new Person("Noah","Babich",11, Gender.MALE),
            new Person("Eli","Babich",11, Gender.MALE),
            new Person("John","Doe",88, Gender.MALE),
            new Person("Olivia","Garrett",13, Gender.FEMALE),
            new Person("Wilma","Ross",87, Gender.FEMALE),
            new Person("Jonah","Gavin",2, Gender.MALE)
    );
    
}
