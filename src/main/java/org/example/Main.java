package org.example;

//Create a Java record "Animal" that should have properties for ID, Name, Species, and Age.
// Choose suitable field names.
//In a main method, create multiple Animals.
//Call the automatically generated methods in the Record and check if they do what you expect (equals, toString)
//Create an Owner Record that stores some properties of a pet owner (Name, Age, Address).
//Let each Animal have an Owner
//Create a Species Record that stores the properties of an animal species (Name, Food requirement in grams per day).
//Let each Animal have a Species.
//In your main method, let multiple Animal objects have the same Species.
//If you have already completed this task earlier, you can work on the bonus task on the next page.

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
    }
}