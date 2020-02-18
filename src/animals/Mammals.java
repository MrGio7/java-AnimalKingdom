package animals;

public class Mammals extends AbstractAnimals {
    private String reproduce = "live births";;
    public String move = "lungs";;
    public String breath = "walk";;

    public Mammals(String name, int yearNamed, int food) {
        super(name, yearNamed, food);
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