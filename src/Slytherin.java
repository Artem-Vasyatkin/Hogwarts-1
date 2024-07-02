public class Slytherin extends Hogwarts {

    private int cunning;

    private int determined;

    private int ambitious;

    private int resourceful;

    private int powerHungry;

    public Slytherin(String name,
                     int magicPower,
                     int transgressionDistance,
                     int cunning,
                     int determined,
                     int ambitious,
                     int resourceful,
                     int powerHungry) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determined = determined;
        this.ambitious = ambitious;
        this.resourceful = resourceful;
        this.powerHungry = powerHungry;
    }

    public void printPowerDifference(Slytherin student) {
        if (this.getPower() > student.getPower()) {
            System.out.printf("%s лучший Слизаринец," +
                    " чем %s%n", this.getName(), student.getName());
        } else if (this.getPower() < student.getPower()) {
            System.out.printf("%s лучший Слизаринец," +
                    " чем %s%n", student.getName(), this.getName());
        } else {
            System.out.printf("%s такой же Слизаринец," +
                    " чем %s%n", student.getName(), this.getName());
        }
    }


    protected int getPower() {
        return cunning + determined + ambitious + resourceful + powerHungry;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "name=" + getName() +
                ", magicPower=" + getMagicPower() +
                ", TransgressionDistance=" + getTransgressionDistance() +
                ", cunning=" + cunning +
                ", determined=" + determined +
                ", ambitious=" + ambitious +
                ", resourceful" + resourceful +
                ", powerHungry" + powerHungry +
                '}';
    }
}
