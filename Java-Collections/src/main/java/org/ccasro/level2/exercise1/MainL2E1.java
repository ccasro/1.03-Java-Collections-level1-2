package org.ccasro.level2.exercise1;

import java.util.HashSet;
import java.util.Set;

public class MainL2E1 {
    public static void main(String[] args) {

        Set<Restaurant> restaurants = new HashSet<>();

        Restaurant r1 = new Restaurant("Loser", 1);
        Restaurant r2 = new Restaurant("Chen Ji", 9);
        Restaurant r3 = new Restaurant("Loser", 3);
        Restaurant r4 = new Restaurant("Loser", 1);

        restaurants.add(r1);
        restaurants.add(r2);
        restaurants.add(r3);
        restaurants.add(r4);
        restaurants.add(r1);

        for (Restaurant res : restaurants){
            System.out.println(res);
        }
    }
}
