package com.teachmeskills.lesson8.clinic.doc.doctors;

import com.teachmeskills.lesson8.clinic.doc.Doctor;
import com.teachmeskills.lesson8.clinic.doc.doctors_list.DoctorsList;
import com.teachmeskills.lesson8.clinic.patient.Patient;

/**
 * This class contain pattern for "Therapist" and his methods.
 */

public class Therapist extends Doctor {

    public Therapist(String name, int doctorId) {
        super(name, doctorId);
    }

    @Override
    public void treat() {
        System.out.println("Prescribe a pills");
    }

    public void prescribeTreatment(Patient patient) {
        DoctorsList doctorsList = new DoctorsList();
        if (patient.treatmentPlan == 1) {
            System.out.println("Prescribe surgeon for " + patient.name);
            patient.setDoctor(doctorsList.getSurgeon());
            doctorsList.surgeonTreat();
        } else if (patient.treatmentPlan == 2) {
            System.out.println("Prescribe dentist for " + patient.name);
            patient.setDoctor(doctorsList.getDentist());
            doctorsList.dentistTreat();
        } else if (patient.treatmentPlan >= 3) {
            System.out.println("Prescribe therapist for " + patient.name);
            patient.setDoctor(doctorsList.getSurgeon());
            doctorsList.therapistTreat();
        } else {
            System.out.println("Incorrect treatment plan ID");
        }
    }
}
