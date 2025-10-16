package org.ccasro.level2.exercise1;

public class Restaurant {
    private String name;
    private int score;

    public Restaurant(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Restaurant restaurant = (Restaurant) obj;
        return name != null && name.equalsIgnoreCase(restaurant.name) && score == restaurant.score;
    }

    @Override
    public int hashCode() {
        return name == null ? 0 : name.toLowerCase().hashCode() + score;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
