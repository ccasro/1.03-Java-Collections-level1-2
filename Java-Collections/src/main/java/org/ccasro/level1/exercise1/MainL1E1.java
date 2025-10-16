package org.ccasro.level1.exercise1;

import java.util.*;

public class MainL1E1 {
    public static void main(String[] args) {
        List<Month> months = new ArrayList<>();

        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));

        System.out.println("Before add August");
        for (Month month: months){
            System.out.println(month);
        }

        System.out.println();

        months.add(7,new Month("August"));

        System.out.println("After add August");
        for (Month month: months){
            System.out.println(month);
        }
        System.out.println();

        Set<Month> monthSet = new HashSet<>(months);

        Iterator<Month> iterator = monthSet.iterator();
        while(iterator.hasNext()) {
            Month m = iterator.next();
            System.out.println(m);
        }

        System.out.println();

        monthSet.add(new Month("January"));
        monthSet.add(new Month("Unknown"));

        for (Month m: monthSet){
            System.out.println(m);
        }
    }
}
