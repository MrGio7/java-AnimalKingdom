package animals;

public class Mammals extends AbstractAnimals {
    private String reproduce;
    public String move;
    public String breath;

    public Mammals(String name, int yearNamed, int food, String implement, String reproduce, String move, String breath) {
        super(name, yearNamed, food, implement);
        this.reproduce = reproduce;
        this.breath = breath;
        this.move = move;
    }

    public void setReproduce(String reproduce) {
        this.reproduce = reproduce;
    }

    public String getReproduce() {
        return reproduce;
    }

    public void setBreath(String breath) {
        this.breath = breath;
    }

    public String getBreath() {
        return breath;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public String getMove() {
        return move;
    }


}