/**
 * Created by Ashkan Amiri
 * Date:  2020-09-27
 * Time:  21:05
 * Project: Animal
 * Copyright: MIT
 */
public class Cat extends Animal {
    /* public Cat(){
        typeOfFood = FoodType.CATFOOD;
    }*/ //TEST CODE

    // Create a class constructor for the Cat class
    public Cat(String name, double weight) {
        super(name, weight);
        typeOfFood = FoodType.CATFOOD;
    }
    public double getRightFood() {
        weightOfFood = Math.round(this.getWeight() / typeOfFood.dividedBy());
        return weightOfFood;
    }
}
