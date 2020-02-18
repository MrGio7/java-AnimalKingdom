package animals;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** Animals ***");

        Mammals Panda = new Mammals("Panda", 1869, 35);
        Mammals Zebra = new Mammals("Zebra", 1778, 14);
        Mammals Koala = new Mammals("Koala", 1816, 30);
        Mammals Sloth = new Mammals("Sloth", 1869, 25);
        Mammals Armadillo = new Mammals("Armadillo", 1758, 21);
        Mammals Raccoon = new Mammals("Raccoon", 1758, 17);
        Mammals Bigfoot = new Mammals("Bigfoot", 2021, 20);

        Birds Pigeon = new Birds("Pigeon", 1837, 22);
        Birds Peacock = new Birds("Peacock", 1821, 21);
        Birds Toucan = new Birds("Toucan", 1758, 17);
        Birds Parrot = new Birds("Parrot", 1824, 24);
        Birds Swan = new Birds("Swan", 1758, 17);

        Fish Salmon = new Fish("Salmon", 1758, 17);
        Fish Catfish = new Fish("Catfish", 1817, 18);
        Fish Perch = new Fish("Perch", 1758, 38);
        
        ArrayList<AbstractAnimals> animalData = new ArrayList<AbstractAnimals>();

        animalData.add(Panda);
        animalData.add(Zebra);
        animalData.add(Koala);
        animalData.add(Sloth);
        animalData.add(Armadillo);
        animalData.add(Raccoon);
        animalData.add(Bigfoot);
        animalData.add(Pigeon);
        animalData.add(Peacock);
        animalData.add(Toucan);
        animalData.add(Parrot);
        animalData.add(Swan);
        animalData.add(Salmon);
        animalData.add(Catfish);
        animalData.add(Perch);

        System.out.println("\n%%% Animal List %%%");
        System.out.println(animalData.toString());

        System.out.println("\n%%% Sorted by Year %%%");
        animalData.sort((a, b) -> Integer.compare(b.getYear(), a.getYear()));
        System.out.println(animalData.toString());

        System.out.println("\n%%% Sorted alphabetically %%%");
        animalData.sort((a, b) -> a.getName().compareToIgnoreCase(b.getName()));
        System.out.println(animalData);

        System.out.println("\n%%% Sort by Categories %%%");
        animalData.sort((a, b) -> a.getMove().compareToIgnoreCase(b.getMove()));
        System.out.println(animalData);

        System.out.println("\n%%% Filter - breath with lungs %%%");
        animalData.forEach(a -> {if (a.getBreath() == "lungs") {System.out.println(a);}});

        System.out.println("\n%%% Filter - breath with lungs %%%");
        animalData.forEach(a -> {if (a.getBreath() == "lungs") {
            System.out.println(a);
            }
        });

        System.out.println("\n%%% Filter - breath with lungs and were named in 1758 %%%");
        animalData.forEach(a -> {if (a.getBreath() == "lungs" && a.getYear() == 1758) {
            System.out.println(a);
            }
        });

        System.out.println("\n%%% Filter - lay eggs and breath with lungs %%%");
        animalData.forEach(a -> {if (a.getReproduce() == "eggs" && a.getBreath() == "lungs") {
            System.out.println(a);
            }
        });

    }
}