package ru.skypro;

public class Ravenclaw extends Hogwarts {

    private final int smart; //    умны, мудры, остроумны и полны творчества. оцениваются в эквиваленте от 0 до 100
    private final int wise;
    private final int witty;
    private final int fullOfCreativity;

    public Ravenclaw(String name, int smart, int wise, int witty, int fullOfCreativity, int magic, int apparition) {
        super(name, magic, apparition);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", интелектуальность = " + smart +
                ", мудрость = " + wise +
                ", остроумность = " + witty +
                ", креативность = " + fullOfCreativity;
    }

    public void comparedRavenclaw(Ravenclaw student) {
        super.comparedStudents(student);

        if (smart > student.getSmart()) {
            System.out.println("Ученик " + getName() + " умнее, чем ученик " + student.getName());
        } else if (smart == student.getSmart()) {
            System.out.println("Ученики " + getName() + " и " + student.getName() + " обладают одинаковым уровнем интелектуальности.");
        } else {
            System.out.println("Ученик " + getName() + " не умнее чем ученик " + student.getName());
        }

        if (wise > student.getWise()) {
            System.out.println("Ученик " + getName() + " мудрее, чем ученик " + student.getName());
        } else if (wise == student.getWise()) {
            System.out.println("Ученики " + getName() + " и " + student.getName() + " обладают одинаковым уровнем мудрости.");
        } else {
            System.out.println("Ученик " + getName() + " не мудрее чем ученик " + student.getName());
        }

        if (witty > student.getWitty()) {
            System.out.println("Ученик " + getName() + " остроумнее, чем ученик " + student.getName());
        } else if (witty == student.getWitty()) {
            System.out.println("Ученики " + getName() + " и " + student.getName() + " обладают одинаковым уровнем остроумия.");
        } else {
            System.out.println("Ученик " + getName() + " не остроумнее, чем ученик " + student.getName());
        }

        if (fullOfCreativity > student.getFullOfCreativity()) {
            System.out.println("Ученик " + getName() + " креативнее, чем ученик " + student.getName());
        } else if (fullOfCreativity == student.getFullOfCreativity()) {
            System.out.println("Ученики " + getName() + " и " + student.getName() + " обладают одинаковым творческими способностями.");
        } else {
            System.out.println("Ученик " + getName() + " не креативнее, чем ученик " + student.getName());
        }
    }
}

