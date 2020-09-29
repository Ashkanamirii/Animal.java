import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ashkan Amiri
 * Date:  2020-09-27
 * Time:  21:04
 * Project: Animal
 * Copyright: MIT
 */
public class AnimalHotel {

    public List<Animal> getListOfAnimal() {
        List<Animal> animalList = new ArrayList<>();

        Cat c1 = new Cat("Venus", 5000);
        Animal c2 = new Cat("Ove", 3000);

        Animal d1 = new Dog("Sixten", 5000);
        Animal d2 = new Dog("Dogge", 10000);

        Animal s = new Snake("Hypno", 1000);

        animalList.add(c1);
        animalList.add(c2);

        animalList.add(d1);
        animalList.add(d2);

        animalList.add(s);

        return animalList;
    }

    /**
     * return the animal or null.
     *
     * @param name The name of the animal
     * @return the animal or null
     */

    public Animal getAnimal(String name) {

        Animal animalFromGetAnimal = null;

        for (Animal animal : getListOfAnimal()) {
            if (name.trim().toUpperCase().equals(animal.getName().toUpperCase())) {
                animalFromGetAnimal = animal;
                break;
            }
        }

        return animalFromGetAnimal;
    }
}

