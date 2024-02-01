package com.teachmeskills.lesson8.clinic.doc.doctors_list;

import com.teachmeskills.lesson8.clinic.doc.Doctor;
import com.teachmeskills.lesson8.clinic.doc.doctors.Dentist;
import com.teachmeskills.lesson8.clinic.doc.doctors.Surgeon;
import com.teachmeskills.lesson8.clinic.doc.doctors.Therapist;

/**
 * This class contains "Doctors" objects and access to their methods.
 */

public class DoctorsList {

    private Therapist therapist = new Therapist("Therapist", 333);
    private Doctor surgeon = new Surgeon("Surgeon", 111);
    private Doctor dentist = new Dentist("Dentist", 222);

    public Doctor getDentist() {
        return dentist;
    }

    public Doctor getSurgeon() {
        return surgeon;
    }

    public Therapist getTherapist() {
        return therapist;
    }

    public void surgeonTreat() {
        surgeon.treat();
    }

    public void dentistTreat() {
        dentist.treat();
    }

    public void therapistTreat() {
        therapist.treat();
    }

    ;
}
