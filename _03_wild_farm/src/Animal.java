public abstract class Animal {
private String animalName;
private String animalType;
private Double animalWeight;
private  Integer foodEaten;
Animal(String animalName,String animalType,Double animalWeight,Integer foodEaten){
    this.animalName=animalName;
    this.animalType=animalType;
    this.animalWeight=animalWeight;
    this.foodEaten=foodEaten;
}
public void makeSound(String sound){
    System.out.println(sound);
}

    protected String getAnimalName() {
        return animalName;
    }

    public void setFoodEaten(Integer foodEaten) {
        this.foodEaten = foodEaten;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }

    public void eat(Food food,String animal,Food typeOfFood) {
        if(food.getClass() == typeOfFood.getClass()){
            this.setFoodEaten(getFoodEaten()+food.getQuantity());
        }else{
            throw new IllegalArgumentException(animal+ "s are not eating that type of food!");
        }
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       return sb.toString();
    }
}
