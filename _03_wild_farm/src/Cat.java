public class Cat extends Felime {
    private String breed;
    private final String sound;

    Cat(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
        this.sound="Meowwww";
    }

    private String getSound() {
        return sound;
    }

    public void eat(Food food) {
        super.eat(food, this.getAnimalName(),new Food(food.getQuantity()){

        });
    }


    public void makeSound() {
        super.makeSound(this.getSound());
    }

    @Override
    public String toString() {
     StringBuilder sb = new StringBuilder(this.getAnimalName()).append("[");
     return sb.toString();
    }
}
