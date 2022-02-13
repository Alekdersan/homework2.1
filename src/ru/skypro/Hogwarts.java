package ru.skypro;

public class Hogwarts {

    private final String name;
    private final int magic; // колдовство
    private final int apparition; // трансгрессия - перемещение на расстояние в пространстве

    public Hogwarts(String name, int magic, int apparition) {
        this.name = name;
        this.magic = magic;
        this.apparition = apparition;
    }

    public String getName() {
        return name;
    }

    public int getMagic() {
        return magic;
    }

    public int getApparition() {
        return apparition;
    }

    @Override
    public String toString() {
        return "Ученик " + name +
                ", обладает колдовством = " + magic +
                ", может трангрессировать на расстояние = " + apparition;
    }

    public void comparedStudents(Hogwarts student) {
        if (magic > student.getMagic()) {
            System.out.println("Ученик " + name + ", обладает большей силой колдовства, чем ученик " + student.getName());
        } else if (magic == student.getMagic()) {
            System.out.println("Ученики " + name + " и " + student.getName() + " обладают одинаковой силой колдовства.");
        } else {
            System.out.println("Ученик " + name + ", обладает меньшей силой колдовства, чем ученик " + student.getName());
        }

        if (apparition > student.getApparition()) {
            System.out.println("Ученик " + name + ", обладает большей трангрессией, чем ученик " + student.getName());
        } else if (apparition == student.getApparition()) {
            System.out.println("Ученики " + name + " и " + student.getName() + " обладают одинаковой трангрессией.");
        } else {
            System.out.println("Ученик " + name + ", обладает меньшей трангрессией, чем ученик " + student.getName());
        }
    }
}
