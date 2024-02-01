package com.teachmeskills.lesson8.clinic.doc.doctors;

import com.teachmeskills.lesson8.clinic.doc.Doctor;

/**
 * This class contain pattern for "Dentist" and his methods.
 */

public class Dentist extends Doctor {
    public Dentist(String name, int doctorId) {
        super(name, doctorId);
    }

    @Override
    public void treat() {
        System.out.println("Remove a tooth");
    }
}
