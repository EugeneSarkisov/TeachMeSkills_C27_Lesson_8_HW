package com.teachmeskills.lesson8.clinic.patient;

import com.teachmeskills.lesson8.clinic.doc.Doctor;

/**
 * This class contain pattern for "Patient" objects and access to "Doctor" field.
 */

public class Patient {
    public String name;
    public int treatmentPlan;
    private Doctor doctor;

    public Patient(String name, int treatmentPlan, Doctor doctor) {
        this.name = name;
        this.treatmentPlan = treatmentPlan;
        this.doctor = doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
