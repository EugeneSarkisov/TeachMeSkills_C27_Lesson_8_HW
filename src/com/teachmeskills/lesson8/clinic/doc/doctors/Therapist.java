package com.teachmeskills.lesson8.clinic;

public class Therapist extends Doctor{

    public Therapist(String name, int doctorId) {
        super(name, doctorId);
    }

    @Override
    public void treat() {
        System.out.println("Prescribe a pills");
    }
}
