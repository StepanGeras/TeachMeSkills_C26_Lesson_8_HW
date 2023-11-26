package com.teachmeskills.lesson7.service;

import com.teachmeskills.lesson7.ITreat;
import com.teachmeskills.lesson7.doctor.Therapist;
import com.teachmeskills.lesson7.patient.Patient;

public class Service {

    public static void doService (){

        Patient[] patients = new Patient[3];

        patients[0] = new Patient(2);
        patients[1] = new Patient(3);
        patients[2] = new Patient(1);

        int count = 1;
        Therapist therapist = new Therapist();

        for (Patient patient: patients) {
            ITreat pat = therapist.doctor(patient.treatmentPlan);
            System.out.print("Пациента №" + count +
                    " будет лечить ");
            pat.doTreat();

            count++;
        }

    }

}
