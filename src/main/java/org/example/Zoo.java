package org.example;

import java.util.List;

public record Zoo(List<Animal> animals) {

    public int totalFoodPerDay(){
        int totalSum = 0;
        for (Animal animal : animals) {
            totalSum += animal.species().foodPerDay();
        }
        return totalSum;
    }
}
