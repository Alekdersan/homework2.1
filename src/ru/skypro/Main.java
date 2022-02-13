package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 70, 75, 65, 80, 85);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 75, 75, 70, 85, 80);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 65, 75, 55, 60, 70);

        Hufflepuff zachariahSmith = new Hufflepuff("Захария Смит", 60, 55, 70, 80, 75);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 90, 75, 60, 65, 60);
        Hufflepuff justinFinch = new Hufflepuff("Джастин Финч-Флетчли", 85, 65, 80, 75, 65);

        Ravenclaw zhouChang = new Ravenclaw("Чжоу Чанг", 65, 85, 95, 60, 55, 65);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 50, 60, 70, 60, 50, 80);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 55, 65, 75, 85, 75, 80);

        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 85, 95, 70, 75, 60, 70, 60);
        Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю", 55, 60, 85, 75, 85, 60, 40);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 75, 65, 85, 45, 35, 50, 60);

        System.out.println(harryPotter);
        System.out.println();

        harryPotter.comparedStudents(marcusBelby);
        cedricDiggory.comparedStudents(dracoMalfoy);
        System.out.println();

        ronWeasley.comparedGryffindor(hermioneGranger);
        System.out.println();

        zachariahSmith.comparedHufflepuff(justinFinch);
        System.out.println();

        zhouChang.comparedRavenclaw(padmaPatil);
        System.out.println();

        gregoryGoyle.comparedSlytherin(grahamMontague);
        System.out.println();
    }
}
