package polymorphism.wildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {

    private String livingRegion;


    public Mammal(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    protected String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            this.setFoodEaten(food.getQuantity());
        } else {
            String type = this.getAnimalType();
            if (this instanceof Mouse) {
                type = "Mice";
            }
//            String type = this.getClass().getSimpleName();
//            System.out.println((type.equalsIgnoreCase("mouse") ? "Mice" : type) + "s are not eating that type of food!");
            System.out.println(type + "s are not eating that type of food!");
        }
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        // "{AnimalType} [{AnimalName}, {AnimalWeight}, {AnimalLivingRegion}, {FoodEaten}]".
        String template = "%s[%s, %.2f, %s, %s]";
        return String.format(template,
                this.getAnimalType(),
                this.getAnimalName(),
                this.getAnimalWeight(),
                this.getLivingRegion(),
                this.getFoodEaten());
    }
}
