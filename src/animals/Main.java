package animals;

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
        

    }
}