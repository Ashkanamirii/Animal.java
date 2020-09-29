/**
 * Created by Ashkan Amiri
 * Date:  2020-09-27
 * Time:  21:02
 * Project: Animal
 * Copyright: MIT
 */

public class Animal implements IFood, IAmountOfFood {
    private String name;
    private double weight;
    protected FoodType typeOfFood;
    protected double weightOfFood;

    // Create a class constructor for the Animal class
    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }

    @Override
    public FoodType getRightFood() {
        return typeOfFood;
    }

    @Override
    public double getAmountOfFood() {
        return weightOfFood;
    }

/*** ******TEST CODE********
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", typeOfFood=" + typeOfFood +
                ", weightOfFood=" + weightOfFood +
                '}';
    }
 **/
}
