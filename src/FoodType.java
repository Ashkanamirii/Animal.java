/**
 * Created by Ashkan Amiri
 * Date:  2020-09-27
 * Time:  21:08
 * Project: Animal
 * ****************************************************
 * An enum (Note enum keyword inplace of class keyword)
 */
public enum FoodType {
    // Demonstrates the declaration of enum
    DOGFOOD(100), CATFOOD(150), SNAKEFOOD(20);

    // Constant variable
    private final int divided;

    //Constructor
    FoodType(int divided) {
        this.divided = divided;
    }

    /**
     * To use divided numbers
     * @return formulas numbers
     */
    public int dividedBy() {
        return divided;
    }

}