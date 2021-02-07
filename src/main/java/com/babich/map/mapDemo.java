package com.babich.map;

import java.util.Arrays;

class MapDemo {
    public static void main(String[] args) {
        //map
        String[] names = {"Tom","Jack","Harry"};        
        Arrays.stream(names).map(String::toUpperCase)
                .forEach(System.out::println);
        
    }
}
