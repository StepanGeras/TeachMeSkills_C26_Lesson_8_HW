package com.teachmeskills.lesson7.doctor;

import com.teachmeskills.lesson7.ITreat;

public class Therapist implements ITreat {

    @Override
    public void doTreat() {
        System.out.println("Терапевт \n" +
                "Отправить на больничный");
    }

    public ITreat doctor(int number){

        if (number == 1) {
            return new Surgeon();
        } else if (number == 2) {
            return new Dentist();
        } else {
            return new Therapist();
        }

    }

}
