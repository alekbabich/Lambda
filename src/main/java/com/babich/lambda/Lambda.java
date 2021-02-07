package com.babich.lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda{
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>();
        numbers.add("One");
        numbers.add("Two");
        numbers.add("Three");

        numbers.forEach(System.out::println);

        }
    }
