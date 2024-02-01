package com.teachmeskills.lesson8.clinic;

public class Dentist extends Doctor{
    public Dentist(String name, int doctorId) {
        super(name, doctorId);
    }

    @Override
    public void treat() {
        System.out.println("Delete ");
    }
}
