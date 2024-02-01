package com.teachmeskills.lesson8.clinic;

public abstract class Doctor implements Treatable {
    String name;
    int doctorId;

    public Doctor(String name, int doctorId) {
        this.name = name;
        this.doctorId = doctorId;
    }
}
