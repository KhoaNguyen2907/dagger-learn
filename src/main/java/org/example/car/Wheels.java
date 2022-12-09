package org.example.car;

import javax.inject.Inject;

public class Wheels {
    private Rim rim;
    private Tires tires;

//    @Inject
    public Wheels(Rim rim, Tires tires ){
        this.rim = rim;
        this.tires = tires;
    }

    public void getInfo(){
        System.out.println("4 wheels");
        rim.getRimInfo();
        tires.inflate();
    }
}
