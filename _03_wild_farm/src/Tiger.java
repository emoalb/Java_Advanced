public class Tiger extends Felime {
    String livingRegion;
    private final String sound;
    Tiger(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.sound="ROAAR!!!";
    }
    private String getSound() {
        return sound;
    }

    public void eat(Food food) {
        super.eat(food, this.getAnimalName(),new Meat(food.getQuantity()){

        });
    }


    public void makeSound() {
        super.makeSound(this.getSound());
    }
}
