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

    /**
     * Run method
     * Exception free
     */
    static void run() {
        // Instance of AnimalHotel
        AnimalHotel animalHotel = new AnimalHotel();
        try {
            boolean count = true;
            while (count) {
                String inputParam = showInputDialog("Which one will get food?\n" +
                        "(Venus,Ove,Sixten,Dogge,Hypno)");
                if (inputParam == null)
                    System.exit(0);
                Animal animal = animalHotel.getAnimal(inputParam);
                if (animal != null) {
                    double amountofFood = animal.getRightFood();
                    showMessageDialog(null, "You will give " + animal.getName() + " "
                            + amountofFood + " gram "
                            + animal.typeOfFood + " !");

                    System.out.println(animal.typeOfFood); //test code
                    System.out.println(amountofFood); // test code

                    String s = showInputDialog("If you want continue write 'Y' or 'y' ");
                    if (s == null)
                        System.exit(0);
                    if (!s.equals("Y") && !s.equals("y"))
                        count = false;
                } else {
                    inputParam = showInputDialog("Please write their right names." +
                            "\n(Venus,Ove,Sixten,Dogge,Hypno)");
                }

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
