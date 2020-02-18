package animals;

public abstract class AbstractAnimals {
    protected static int maxId = 0;
    protected int id;
    protected String name;
    protected int yearNamed;
    protected int food;

    public AbstractAnimals(String name, int yearNamed, int food){
        maxId++;
        id = maxId;

        this.name = name;
        this.yearNamed = yearNamed;
        this.food = food;
    }

    public abstract String getMove();
    public abstract String getBreath();
    public abstract String getReproduce();

    public void setName(String name) {
        this.name = name;
    } 

    public String getName() {
        return name;
    }

    public void setYear(int yearNamed) {
        this.yearNamed = yearNamed;
    }

    public int getYear(){
        return yearNamed;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void eatFood(int i) {
        this.food = food - i;
    }

    public int getFood() {
        return food;
    }

}