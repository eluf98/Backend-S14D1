package com.workintech.developers;

import javax.sound.midi.Soundbank;

public class MidDeveloper extends Employee {
    public MidDeveloper(long id, String name, double salary){
        super(id,name,salary);
    }

    @Override
    public void work(){
        System.out.println("Mid develeoper getting started");
    }
}
