public class Hufflepuff extends Hogwarts {

    private int diligence;

    private int loyalty;

    private int honesty;

    public Hufflepuff(String name,
                      int magicPower,
                      int transgressionDistance,
                      int diligence,
                      int loyalty,
                      int honesty) {
        super(name, magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void printPowerDifference(Hufflepuff student) {
        if (this.getPower() > student.getPower()) {
            System.out.printf("%s лучший Пуффендуец," +
                    " чем %s%n", this.getName(), student.getName());
        } else if (this.getPower() < student.getPower()) {
            System.out.printf("%s лучший Пуффендуец," +
                    " чем %s%n", student.getName(), this.getName());
        } else {
            System.out.printf("%s такой же Пуффендуец," +
                    " чем %s%n", student.getName(), this.getName());
        }
    }


    protected int getPower() {
        return diligence + loyalty + honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "name=" + getName() +
                ", magicPower=" + getMagicPower() +
                ", TransgressionDistance=" + getTransgressionDistance() +
                ", diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
}
