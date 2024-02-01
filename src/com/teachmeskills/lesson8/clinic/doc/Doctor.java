package com.teachmeskills.lesson8.clinic.doc;

/**
 * This abstract class contain pattern for all "Doctors" object.
 * Also, this class implements "Treatable" interface.
 */

public abstract class Doctor implements Treatable {
    String name;
    int doctorId;
    public Doctor(String name, int doctorId) {
        this.name = name;
        this.doctorId = doctorId;
    }

}
