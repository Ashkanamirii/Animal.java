/**
 * Created by Ashkan Amiri
 * Date:  2020-09-27
 * Time:  21:05
 * Project: Animal
 * Copyright: MIT
 */
public class Snake extends Animal {
    // Create a class constructor for the Snake class
    public Snake(String name,double weight){
        super(name,weight);
        typeOfFood = FoodType.SNAKEFOOD;
        weightOfFood =  FoodType.SNAKEFOOD.dividedBy();
    }
}