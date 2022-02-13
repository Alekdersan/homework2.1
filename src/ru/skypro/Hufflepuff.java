package ru.skypro;

public class Hufflepuff extends Hogwarts {

    private final int diligence; //    трудолюбивы, верны, честны/ оцениваются в эквиваленте от 0 до 100
    private final int loyalty;
    private final int honesty;

    public Hufflepuff(String name, int diligence, int loyalty, int honesty, int magic, int apparition) {
        super(name, magic, apparition);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", трудолюбие = " + diligence +
                ", верность = " + loyalty +
                ", честность = " + honesty;
    }

    public void comparedHufflepuff(Hufflepuff student) {
        super.comparedStudents(student);

        if (diligence > student.getDiligence()) {
            System.out.println("Ученик " + getName() + ", обладает уровнем трудолюбия выше, чем ученик " + student.getName());
        } else if (diligence == student.getDiligence()) {
            System.out.println("Ученики " + getName() + " и " + student.getName() + " обладают одинаковым уровнем трудолюбия.");
        } else {
            System.out.println("Ученик " + getName() + ", обладает уровнем трудолюбия ниже, чем ученик " + student.getName());
        }

        if (loyalty > student.getLoyalty()) {
            System.out.println("Ученик " + getName() + ", обладает уровнем верности выше, чем ученик " + student.getName());
        } else if (loyalty == student.getLoyalty()) {
            System.out.println("Ученики " + getName() + " и " + student.getName() + " обладают одинаковым уровнем верности.");
        } else {
            System.out.println("Ученик " + getName() + ", обладает уровнем верности ниже, чем ученик " + student.getName());
        }

        if (honesty > student.getHonesty()) {
            System.out.println("Ученик " + getName() + ", обладает уровнем честности выше, чем ученик " + student.getName());
        } else if (honesty == student.getHonesty()) {
            System.out.println("Ученики " + getName() + " и " + student.getName() + " обладают одинаковым уровнем честности.");
        } else {
            System.out.println("Ученик " + getName() + ", обладает уровнем честности ниже, чем ученик " + student.getName());
        }
    }
}
