package org.example;

import java.util.HashMap;
import java.util.Map;


//Define a testing class with a main() method where you:

public class Exercise_Maps {
    public static void main(String[] args) {
        HashMap<Integer, String> firstFiveNumbersMap = new HashMap<>();
        //create an HashMap that maps the numbers from 1 to 5 with their respective English names
        firstFiveNumbersMap.put(1, "One");
        firstFiveNumbersMap.put(2, "Two");
        firstFiveNumbersMap.put(3, "Three");
        firstFiveNumbersMap.put(4, "Four");
        firstFiveNumbersMap.put(5, "Five");


        HashMap<Integer, String> oddsNumbersMap = new HashMap<>();
        //create an HashMap that maps the odd number from 1 to 9 with their respective Italian names
        oddsNumbersMap.put(1, "Uno");
        oddsNumbersMap.put(3, "Tre");
        oddsNumbersMap.put(5, "Cinque");
        oddsNumbersMap.put(7, "Sette");
        oddsNumbersMap.put(9, "Nove");

        //merge (without using merge()) the second hashmap into the first one (duplicate keys' values are overwritten in the first HashMap)
        for (Map.Entry<Integer, String> entry : oddsNumbersMap.entrySet()) {
            firstFiveNumbersMap.put(entry.getKey(), entry.getValue());
        }                                          //chiedere differenza---> firstFiveNumbersMap.putAll(oddsNumbersMap);
        //print the modified firstHashMap
        System.out.println("The merge result is: " + firstFiveNumbersMap);

        //print on screen the value of the keys 5, 6, 7, 8 and 9 if there's no mapping for a specific key, print No associated value
        System.out.println("The Value of key 5: " + firstFiveNumbersMap.getOrDefault(5, "No associated value"));
        System.out.println("The Value of key 6: " + firstFiveNumbersMap.getOrDefault(6, "No associated value"));
        System.out.println("The Value of key 7: " + firstFiveNumbersMap.getOrDefault(7, "No associated value"));
        System.out.println("The Value of key 8: " + firstFiveNumbersMap.getOrDefault(8, "No associated value"));
        System.out.println("The Value of key 9: " + firstFiveNumbersMap.getOrDefault(9, "No associated value"));
    }


}