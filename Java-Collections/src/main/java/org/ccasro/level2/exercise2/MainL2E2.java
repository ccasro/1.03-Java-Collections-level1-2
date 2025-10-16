package org.ccasro.level2.exercise2;

import org.ccasro.level2.exercise1.Restaurant;

import java.util.*;

public class MainL2E2 {
    public static void main(String[] args) {
        Set<Restaurant> treeSet = new TreeSet<>(Comparator.comparing(Restaurant::getName,String.CASE_INSENSITIVE_ORDER).thenComparing(Restaurant::getScore, Comparator.reverseOrder()));

        List<Restaurant> list = List.of(
                new Restaurant("Loser", 1),new Restaurant("Chen Ji", 9),new Restaurant("Loser", 3),new Restaurant("Loser", 1),new Restaurant("Loser", 10)
        );

        treeSet.addAll(list);

        for( Restaurant res : treeSet){
            System.out.println(res);
        }
    }
}
