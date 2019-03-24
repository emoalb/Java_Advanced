public abstract class Mammal extends Animal {
String livingRegion;

    Mammal(String animalName, String animalType, Double animalWeight, Integer foodEaten,String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten);
        this.livingRegion=livingRegion;
    }
}
