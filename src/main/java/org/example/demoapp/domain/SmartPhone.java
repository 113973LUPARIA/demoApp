package org.example.demoapp.domain;

import org.example.demoapp.domain.pieces.Battery;
import org.example.demoapp.domain.pieces.CPU;
import org.example.demoapp.domain.pieces.Camera;
import org.example.demoapp.domain.pieces.RAM;

public class SmartPhone extends SmartDevice {

    private Camera camera;

    public SmartPhone() {}



    public SmartPhone(Long id, String name, RAM ram, Battery battery, CPU cpu, Boolean wifi, Camera camera) {
        super(id, name, ram, battery, cpu, wifi);
        this.camera = camera;
    }



    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }



    @Override
    public String toString() {
        return "SmartPhone [camera=" + camera + ", getId()=" + getId() + ", getName()=" + getName() + ", getRam()="
                + getRam() + ", getBattery()=" + getBattery() + ", getCpu()=" + getCpu() + ", getWifi()=" + getWifi()
                + "]";
    }


}