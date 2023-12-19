package com.teachmeskills.lesson15.hw.homework3;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Runner {
    public static void main(String[] args) {
        Set<String> name = new HashSet<>();
        Collections.addAll(name, "Andrew", "Arthur", "Dmitriy", "Daniil", "Elisaveta", "Polina", "Ivan", "Sergey", "Mark", "Stepan", "Fedor");
        System.out.println(name);
    }
}