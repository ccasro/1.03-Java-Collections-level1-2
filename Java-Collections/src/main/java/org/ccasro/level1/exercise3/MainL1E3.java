package org.ccasro.level1.exercise3;

import java.io.*;
import java.util.*;

public class MainL1E3 {
    public static void main(String[] args) {

        Map<String, String> countries = new HashMap<>();

        try (InputStream is = MainL1E3.class.getResourceAsStream("/countries.txt")) {
            if (is == null) {
                throw new FileNotFoundException("File countries.txt not found");
            }
            try (Scanner file = new Scanner(is)) {
                while (file.hasNextLine()) {
                    String[] parts = file.nextLine().split(" ");
                    if (parts.length == 2) {
                        countries.put(parts[0].trim(), parts[1].trim());
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading countries file: " + e.getMessage());
        }

        if(countries.isEmpty()){
            System.out.println("File is empty");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String userName = input.nextLine();

        List<String> countriesList = new ArrayList<>(countries.keySet());
        Collections.shuffle(countriesList);

        int score = 0;
        int times = Math.min(10, countriesList.size());

        for (int i = 0; i < times; i++){
            String country = countriesList.get(i);
            String capital = countries.get(country);

            System.out.printf("%d - What is the capital of %s? ", i+1, country);
            String answer = input.nextLine().trim();

            if(answer.equalsIgnoreCase(capital)){
                System.out.println("you guessed right!");
                score++;
            }  else {
                System.out.printf("Incorrect! The correct answer is %s \n", capital);
            }
        }

        System.out.println();
        System.out.printf("Result: your username: %s, your score is: %d ", userName, score);

        try (PrintWriter writer = new PrintWriter(new FileWriter("classification.txt", true))) {
            writer.println(userName + " : " + score);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}