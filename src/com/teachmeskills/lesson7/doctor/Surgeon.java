package com.teachmeskills.lesson7.doctor;

import com.teachmeskills.lesson7.ITreat;

public class Surgeon implements ITreat {

    @Override
    public void doTreat() {
        System.out.println("Хирург \n" +
                "Вырезать что-то");
    }

}
