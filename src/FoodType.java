/**
 * Created by Ashkan Amiri
 * Date:  2020-09-27
 * Time:  21:08
 * Project: Animal
 * Copyright: MIT
 */
public enum FoodType {
    // Tree constants
    DOGFOOD(100), CATFOOD(150), SNAKEFOOD(20);
    // Constant variable
    private final int divided;

    //Constructor
    FoodType(int divided) {
        this.divided = divided;
    }

    public int dividedBy() {
        return divided;
    }

}