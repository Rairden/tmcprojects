package application;

import java.util.Random;

public class Thermometer implements Sensor {

    private int temperature;
    private boolean thermometer;

    public Thermometer() {
        this.thermometer = false;
    }

    @Override
    public boolean isOn() {
        return this.thermometer;
    }

    @Override
    public void on() {
        this.thermometer = true;
    }

    @Override
    public void off() {
        this.thermometer = false;
    }

    @Override
    public int measure() throws IllegalArgumentException {
        if (thermometer) {
            // if thermometer on, generate random # -30 to 30.
            return randomNumberRange();
        } else {
            throw new IllegalStateException("Thermometer is off");
        }
    }

    public int randomNumberRange() {
        // random number from -30 to 30
        Random random = new Random();
        int output = -30 + random.nextInt(61);
        return output;
    }
}
