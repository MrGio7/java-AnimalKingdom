package animals;

public class Fish extends AbstractAnimals {
    private String reproduce = "eggs";
    public String move = "swim";
    public String breath = "gills";

    public Fish(String name, int yearNamed, int food) {
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
        return "Fish {" + "Name: " + name + ", Year Named: " + yearNamed + ", Food: " + food + ", Move: " + move + ", Breath: " + breath + ", Reproduce: " + reproduce + "}"; 
    }

}