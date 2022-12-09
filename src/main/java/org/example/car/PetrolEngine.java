package org.example.car;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements IEngine{
    private int horsePower;
    private int capacity;
    @Inject
    public PetrolEngine(@Named("hp") int horsePower, @Named("cp") int capacity) {
        this.horsePower = horsePower;
        this.capacity = capacity;
    }

    @Override
    public void getEngineInfo() {
        System.out.println("Petrol engine started ..." +
                "\nHorse power: " + horsePower +
                "\nCapacity: " + capacity);
    }
}