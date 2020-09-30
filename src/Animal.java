/**
 * Created by Ashkan Amiri
 * Date:  2020-09-27
 * Time:  21:02
 * Project: Animal
 * Copyright: MIT
 */

public class Animal implements IFood {
    private String name;
    private double weight;
    protected FoodType typeOfFood;
    protected double weightOfFood;

    public Animal(){} //test code

    // Create a class constructor for the Animal class
    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
// polymorphism and interface
    public double getRightFood() {
         return weightOfFood;
    }




/* ******TEST CODE********
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
