package animals;

public class Birds extends AbstractAnimals {
    private String reproduce;
    public String move;
    public String breath;

    public Birds(String name, int yearNamed, int food, String reproduce, String move, String breath) {
        super(name, yearNamed, food);
        this.reproduce = "eggs";
        this.breath = "lungs";
        this.move = "fly";
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