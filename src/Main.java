//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gryffindor garryPotter = new Gryffindor("Гарри Поттер", 8, 8, 9, 8, 9);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 7, 8, 6, 7, 6);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 6, 7, 9, 5, 7);
        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 8, 7, 5, 4, 1, 7, 10);
        Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю", 4, 3, 5, 6, 1, 4, 7);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 5, 3, 4, 6, 1, 5, 4);
        Hufflepuff zachariahSmith = new Hufflepuff("Захария Смит", 5, 4, 7, 3, 5);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 8, 6, 4, 7, 5);
        Hufflepuff justinjFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 5, 4, 7, 6, 3);
        Ravenclaw zhouChang = new Ravenclaw("Чжоу Чанг", 8, 5, 4, 7, 3, 5);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 6, 5, 7, 8, 3, 8);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 7, 5, 4, 7, 6, 3);

        System.out.println(garryPotter);
        System.out.println(hermioneGranger);
        System.out.println(ronWeasley);
        System.out.println(dracoMalfoy);
        System.out.println(grahamMontague);
        System.out.println(gregoryGoyle);
        System.out.println(zachariahSmith);
        System.out.println(cedricDiggory);
        System.out.println(justinjFinchFletchley);
        System.out.println(zhouChang);
        System.out.println(padmaPatil);
        System.out.println(marcusBelby);

        System.out.println("\n");
        garryPotter.printPowerDifference(hermioneGranger);
        System.out.println("\n");
        justinjFinchFletchley.printPowerDifference(ronWeasley);
    }
}
