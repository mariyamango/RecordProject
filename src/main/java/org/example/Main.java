package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Owner john = new Owner("John", 30, "5 First Street");
        Owner charlotte = new Owner("Charlotte", 24, "6 Second Street");
        Owner susan = new Owner("Susan", 25, "7 Third Street");
        Owner peter = new Owner("Peter", 16, "8 Forth Street");

        Species bigDog = new Species("Big Dog", 3000);
        Species cat = new Species("Cat", 500);
        Species smallDog = new Species("Small Dog", 600);
        Species parrot = new Species("Parrot", 200);

        Animal luna = new Animal(1,"Luna",smallDog, 8, john);
        Animal bella = new Animal(2,"Bella",cat, 15, charlotte);
        Animal max = new Animal(3,"Max",cat, 12, susan);
        Animal lucy = new Animal(4,"Lucy",bigDog, 6, peter);
        Animal buddy = new Animal(5,"Buddy",parrot, 25, charlotte);

        System.out.println(lucy);
        System.out.println(max.equals(bella));
        System.out.println();

        Zoo zoo = new Zoo(List.of(luna, bella, max, lucy, buddy));
        System.out.println(zoo);
        System.out.println("The Zoo requires food per day: " + zoo.totalFoodPerDay() + " grams.");
    }
}