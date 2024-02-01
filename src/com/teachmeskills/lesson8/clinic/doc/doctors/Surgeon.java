package com.teachmeskills.lesson8.clinic.doc.doctors;

import com.teachmeskills.lesson8.clinic.doc.Doctor;

/**
 * This class contain pattern for "Surgeon" and his methods.
 */

public class Surgeon extends Doctor {
    public Surgeon(String name, int doctorId) {
        super(name, doctorId);
    }

    @Override
    public void treat() {
        System.out.println("Assign an operation");
    }
}
