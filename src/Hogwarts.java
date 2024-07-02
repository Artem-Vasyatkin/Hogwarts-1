import java.util.Objects;

public class Hogwarts {

    private String name;

    private int magicPower;

    private int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void printPowerDifference(Hogwarts student) {
        if (this.getPower() > student.getPower()) {
            System.out.printf("%s обладает большей мощностью магии," +
                    " чем %s%n", this.getName(), student.getName());
        } else if (this.getPower() < student.getPower()) {
            System.out.printf("%s обладает большей мощностью магии," +
                    " чем %s%n", student.getName(), this.getName());
        } else {
            System.out.printf("%s обладает такой же мощностью магии," +
                    " чем %s%n", student.getName(), this.getName());

        }
    }

    protected int getPower() {
        return transgressionDistance + magicPower;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}
