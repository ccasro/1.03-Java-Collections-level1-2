package org.ccasro.level1.exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class MainL1E2 {
    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<>(Arrays.asList(3,6,12,56,23,56,89));
        List<Integer> secondList = new ArrayList<>();

        ListIterator<Integer> it = firstList.listIterator(firstList.size());
        while (it.hasPrevious()){
            int num = it.previous();
            secondList.add(num);
        }

        System.out.println(firstList);
        System.out.println(secondList);
    }
}
