package com.teachmeskills.lesson8.clinic.runner;

import com.teachmeskills.lesson8.clinic.doc.doctors_list.DoctorsList;
import com.teachmeskills.lesson8.clinic.patient.Patient;

public class Runner {
    public static void main(String[] args) {
        DoctorsList doctorsList = new DoctorsList();
        Patient patient1 = new Patient("Patient1", 1, null);
        Patient patient2 = new Patient("Patient2",2, null);
        Patient patient3 = new Patient("Patient3",3, null);
        doctorsList.getTherapist().prescribeTreatment(patient1);
        System.out.println();
        doctorsList.getTherapist().prescribeTreatment(patient2);
        System.out.println();
        doctorsList.getTherapist().prescribeTreatment(patient3);
    }
}
