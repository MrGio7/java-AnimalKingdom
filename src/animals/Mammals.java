package animals;

public class Mammals extends AbstractAnimals {
    private String reproduce;
    public String move;
    public String breath;

    public Mammals(String name, int yearNamed, int food, String reproduce, String move, String breath) {
        super(name, yearNamed, food);
        this.reproduce = "live births";
        this.breath = "lungs";
        this.move = "walk";
    }

    public String getReproduce() {
        return reproduce;
    }

    public String getBreath() {
        return breath;
    }

    public String getMove() {
        return move;
    }
    
    @Override
    public String toString() {
        return "Mammals {" + "Name: " + name + ", Year Named: " + yearNamed + ", Food: " + food + ", Move: " + move + ", Breath: " + breath + ", Reproduce: " + reproduce + "}"; 
    }

}