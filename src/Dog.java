/**
 * Created by Ashkan Amiri
 * Date:  2020-09-27
 * Time:  21:05
 * Project: Animal
 * Copyright: MIT
 */
public class Dog extends Animal {
    // Create a class constructor for the Dog class
    public Dog(String name, double weight) {
        super(name, weight);
        typeOfFood = FoodType.DOGFOOD;
    }
    public double getRightFood() {
        weightOfFood = Math.round(this.getWeight() / typeOfFood.dividedBy());
        return weightOfFood;
    }
}
