public class Gryffindor extends Hogwarts {

    private int nobility;

    private int honor;

    private int bravery;

    public Gryffindor(String name,
                      int magicPower,
                      int transgressionDistance,
                      int nobility,
                      int honor,
                      int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void printPowerDifference(Gryffindor student) {
        if (this.getPower() > student.getPower()) {
            System.out.printf("%s лучший Гриффиндорец," +
                    " чем %s%n", this.getName(), student.getName());
        } else if (this.getPower() < student.getPower()) {
            System.out.printf("%s лучший Гриффиндорец," +
                    " чем %s%n", student.getName(), this.getName());
        } else {
            System.out.printf("%s такой же Гриффиндорец," +
                    " чем %s%n", student.getName(), this.getName());
        }
    }


    protected int getPower() {
        return nobility + honor + bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "name=" + getName() +
                ", magicPower=" + getMagicPower() +
                ", TransgressionDistance=" + getTransgressionDistance() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}
