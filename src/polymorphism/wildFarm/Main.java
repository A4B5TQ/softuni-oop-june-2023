package polymorphism.wildFarm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineCount = 0;

        String input;
        Animal animal = null;

        while (!"End".equals(input = scanner.nextLine())) {

            String[] elements = input.split("\\s+");

            if (lineCount % 2 == 0) {
                animal = animalFactory(elements);
            } else {
                Food food = foodFactory(elements);
                animal.makeSound();
                animal.eat(food);
                System.out.println(animal);
            }
            lineCount++;
        }
    }

    private static Animal animalFactory(String[] elements) {
        Animal animal = null;
        String animalType = elements[0];
        String animalName = elements[1];
        Double animalWeight = Double.parseDouble(elements[2]);
        String animalLivingRegion = elements[3];

        switch (animalType) {
            case "Cat":
                String breed = elements[4];
                animal = new Cat(animalName, animalType, animalWeight, animalLivingRegion, breed);
                break;
            case "Tiger":
                animal = new Tiger(animalName, animalType, animalWeight, animalLivingRegion);
                break;
            case "Mouse":
                animal = new Mouse(animalName, animalType, animalWeight, animalLivingRegion);
                break;
            case "Zebra":
                animal = new Zebra(animalName, animalType, animalWeight, animalLivingRegion);
                break;
        }
        return animal;
    }

    private static Food foodFactory(String[] elements) {
        Food food = null;

        String foodType = elements[0];
        Integer foodQuantity = Integer.parseInt(elements[1]);

        switch (foodType) {
            case "Vegetable":
                food = new Vegetable(foodQuantity);
                break;
            case "Meat":
                food = new Meat(foodQuantity);
                break;
        }

        return food;

    }
}
