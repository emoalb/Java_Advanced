public class Zebra extends Mammal {
    private final String sound;
    Zebra(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.sound="Zs";
    }

    private String getSound() {
        return sound;
    }

    public void eat(Food food) {
        super.eat(food, this.getAnimalName(),new Vegetable(food.getQuantity()));
    }


    public void makeSound() {
        super.makeSound(this.getSound());
    }
}
