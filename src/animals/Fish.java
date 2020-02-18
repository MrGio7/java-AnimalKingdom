package animals;

public class Fish extends AbstractAnimals {
    private String reproduce;
    public String move;
    public String breath;

    public Fish(String name, int yearNamed, int food, String reproduce, String move, String breath) {
        super(name, yearNamed, food);
        this.reproduce = "eggs";
        this.breath = "gills";
        this.move = "swim";
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