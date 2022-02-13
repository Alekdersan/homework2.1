package ru.skypro;

public class Gryffindor extends Hogwarts {

    private final int nobility;// благородство, честь и храбрость.  оцениваются в эквиваленте от 0 до 100
    private final int honor;
    private final int bravery;

    public Gryffindor(String name, int nobility, int honor, int bravery, int magic, int apparition) {
        super(name, magic, apparition);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", благородство = " + nobility +
                ", честь = " + honor +
                ", храбрость = " + bravery;
    }

    public void comparedGryffindor(Gryffindor student) {
        super.comparedStudents(student);

        if (nobility > student.getNobility()) {
            System.out.println("Ученик " + getName() + ", обладает уровнем благородством выше, чем " + student.getName());  // а если поставить "super." или не поставить "this"?
        } else if (nobility == student.getNobility()) {
            System.out.println("Ученики " + getName() + " и " + student.getName() + " обладают одинаковым уровнем благородства.");
        } else {
            System.out.println("Ученик " + getName() + ", обладает уровнем благородством ниже, чем " + student.getName());
        }

        if (honor > student.getHonor()) {
            System.out.println("Ученик " + getName() + ", обладает уровнем чести выше, чем " + student.getName());  // а если super. поставить или this?
        } else if (honor == student.getHonor()) {
            System.out.println("Ученики " + getName() + " и " + student.getName() + " обладают одинаковым уровнем чести.");
        } else {
            System.out.println("Ученик " + getName() + ", обладает уровнем чести ниже, чем " + student.getName());
        }

        if (bravery > student.getBravery()) {
            System.out.println("Ученик " + getName() + ", обладает уровнем храбрости выше, чем  " + student.getName());  // а если super. поставить или this?
        } else if (bravery == student.getBravery()) {
            System.out.println("Ученики " + getName() + " и " + student.getName() + " обладают одинаковым уровнем храбрости.");
        } else {
            System.out.println("Ученик " + getName() + ", обладает уровнем храбрости ниже, чем у " + student.getName());
        }
    }
}
