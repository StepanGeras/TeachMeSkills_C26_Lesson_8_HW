package com.teachmeskills.lesson7.doctor;

import com.teachmeskills.lesson7.ITreat;

public class Dentist implements ITreat {

    @Override
    public void doTreat() {
        System.out.println("Дантист \n" +
                "Лечить зуб");
    }

}
