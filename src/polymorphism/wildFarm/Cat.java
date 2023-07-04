package polymorphism.wildFarm;

import java.text.DecimalFormat;

public class Cat extends Felime {

    private String breed;

    public Cat(String animalName,
               String animalType,
               Double animalWeight,
               String livingRegion,
               String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
        super.setFoodEaten(food.getQuantity());
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        // "{AnimalType} [{AnimalName}, {AnimalWeight}, {AnimalLivingRegion}, {FoodEaten}]".
        String template = "%s[%s, %s, %.2f, %s, %s]";
        return String.format(template,
                this.getAnimalType(),
                this.getAnimalName(),
                this.breed,
                this.getAnimalWeight(),
                this.getLivingRegion(),
                this.getFoodEaten());
    }
}
