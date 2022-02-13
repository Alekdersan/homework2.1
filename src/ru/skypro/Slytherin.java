package ru.skypro;

public class Slytherin extends Hogwarts {

    private final int cunning; //      хитрость, решительность, амбициозность, находчивость и жажда власти. оцениваются в эквиваленте от 0 до 100
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int lustForPower;

    public Slytherin(String name, int cunning, int determination, int ambition, int resourcefulness, int lustForPower, int magic, int apparition) {
        super(name, magic, apparition);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", хитрость = " + cunning +
                ", решительность = " + determination +
                ", амбициозность = " + ambition +
                ", находчивость = " + resourcefulness +
                ", жажда власти = " + lustForPower;
    }

    public void comparedSlytherin(Slytherin student) {
        super.comparedStudents(student);

        if (cunning > student.getCunning()) {
            System.out.println("Ученик " + getName() + " обладает уровнем хитрости выше, чем ученик " + student.getName());
        } else if (cunning == student.getCunning()) {
            System.out.println("Ученики " + getName() + " и " + student.getName() + " обладают одинаковым уровнем хитрости.");
        } else {
            System.out.println("Ученик " + getName() + " обладает уровнем хитрости ниже, чем ученик " + student.getName());
        }

        if (determination > student.getDetermination()) {
            System.out.println("Ученик " + getName() + " обладает уровнем решительности выше, чем ученик " + student.getName());
        } else if (determination == student.getDetermination()) {
            System.out.println("Ученики " + getName() + " и " + student.getName() + " обладают одинаковым уровнем решительности.");
        } else {
            System.out.println("Ученик " + getName() + " обладает уровнем решительности ниже, чем ученик " + student.getName());
        }

        if (ambition > student.getAmbition()) {
            System.out.println("Ученик " + getName() + " обладает уровнем амбициозности выше, чем ученик " + student.getName());
        } else if (cunning == student.getAmbition()) {
            System.out.println("Ученики " + getName() + " и " + student.getName() + " обладают одинаковым уровнем амбициозности.");
        } else {
            System.out.println("Ученик " + getName() + " обладает уровнем амбициозности ниже, чем ученик " + student.getName());
        }

        if (resourcefulness > student.getResourcefulness()) {
            System.out.println("Ученик " + getName() + " обладает уровнем находчивости выше, чем ученик " + student.getName());
        } else if (resourcefulness == student.getResourcefulness()) {
            System.out.println("Ученики " + getName() + " и " + student.getName() + " обладают одинаковым уровнем находчивости.");
        } else {
            System.out.println("Ученик " + getName() + " обладает уровнем находчивости ниже, чем ученик " + student.getName());
        }

        if (lustForPower > student.getLustForPower()) {
            System.out.println("Ученик " + getName() + " обладает уровнем жаждавластия выше, чем ученик " + student.getName());
        } else if (lustForPower == student.getLustForPower()) {
            System.out.println("Ученики " + getName() + " и " + student.getName() + " обладают одинаковым уровнем жаждавластия.");
        } else {
            System.out.println("Ученик " + getName() + " обладает уровнем жаждавластия ниже, чем ученик " + student.getName());
        }
    }
}
