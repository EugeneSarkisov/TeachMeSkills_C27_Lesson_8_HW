package com.teachmeskills.lesson8.clinic.doc.doctors;

import com.teachmeskills.lesson8.clinic.doc.Doctor;

public class Surgery extends Doctor {
    public Surgery(String name, int doctorId) {
        super(name, doctorId);
    }

    @Override
    public void treat() {
        System.out.println("Assign an operation");
    }
}
