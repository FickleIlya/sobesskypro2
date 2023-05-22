package org.example;

import java.util.Arrays;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        String[] arrayString = new String[] {"1", "2", "3", "2"};
        System.out.println(task(arrayString));
    }

    public static String task(String[] arrayString) {
        HashSet<String> setString = new HashSet<String>(Arrays.asList(arrayString));
        return String.join("", setString);
    }
}
