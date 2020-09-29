import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 * Created by Ashkan Amiri
 * Date:  2020-09-27
 * Time:  21:19
 * Project: Animal
 * Copyright: MIT
 */
public class Main {

    public static void main(String[] args) {
        run();
    }

    // Create a class constructor for the Main class
    static void run() {
        // Creat a instance of
        AnimalHotel animalHotel = new AnimalHotel();

        String inputParam = showInputDialog("Which one will get food?\n" +
                "(Venus,Ove,Sixten,Dogge,Hypno)");
        while (true) {
            Animal animal = animalHotel.getAnimal(inputParam);
            if (animal != null) {
                showMessageDialog(null, "You will give " + animal.getName() + " "
                        + animal.getAmountOfFood() + " gram "
                        + animal.getRightFood().toString() + " !");
                //System.out.println(animal.toString()); Test code
                break;
            } else {
                inputParam = showInputDialog("Please write their right names." +
                        "\n(Venus,Ove,Sixten,Dogge,Hypno)");
            }
        }
    }
}