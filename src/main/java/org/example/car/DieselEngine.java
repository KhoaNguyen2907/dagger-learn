package org.example.car;

import javax.inject.Inject;
import javax.inject.Named;

public class DieselEngine implements IEngine{
   private int horsePower ;
   private int capacity ;


    @Inject
    public DieselEngine(@Named("hp") int horsePower, @Named("cp") int capacity) {
        this.horsePower = horsePower;
        this.capacity = capacity;
    }

    @Override
    public void getEngineInfo() {
        System.out.println("Diesel engine started ..." +
                "\n   Horse power: " + horsePower +
                "\n   Capacity: " + capacity );
    }
}
