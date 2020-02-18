package animals;

public class Birds extends AbstractAnimals {
    private String reproduce = "eggs";
    public String move = "fly";
    public String breath = "lungs";

    public Birds(String name, int yearNamed, int food) {
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
        return "Birds {" + "Name: " + name + ", Year Named: " + yearNamed + ", Food: " + food + ", Move: " + move + ", Breath: " + breath + ", Reproduce: " + reproduce + "}"; 
    }

}