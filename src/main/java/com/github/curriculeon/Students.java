package com.github.curriculeon;

public class Students extends People {

    private static final Students INSTANCE = new Students();

    private Students() {
        super();
        this.add(new Student(01L, "Anjali"));
        this.add(new Student(02L, "Deepti"));
    }


    public static Students getInstance() {
        return INSTANCE;
    }


}