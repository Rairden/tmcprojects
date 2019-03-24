package application;

import java.util.Random;

public class Thermometer implements Sensor {

    private boolean state;

    public Thermometer() {
        state = false;
    }

    @Override
    public boolean isOn() {
        return state;
    }

    @Override
    public void on() {
        state = true;
    }

    @Override
    public void off() {
        state = false;
    }

    @Override
    public int measure() throws IllegalArgumentException {
        if (state) {
            // if state ON, generate random number from -30 to 30.
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
