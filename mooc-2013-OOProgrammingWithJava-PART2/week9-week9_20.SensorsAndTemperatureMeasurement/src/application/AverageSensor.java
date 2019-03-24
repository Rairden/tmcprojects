package application;

import java.util.ArrayList;
import java.util.Random;

public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors;
    private boolean state;

    public AverageSensor() {
        this.sensors    = new ArrayList<Sensor>();
        this.state      = false;
    }

    public void addSensor(Sensor additional) {
        sensors.add(additional);
    }

    @Override
    public boolean isOn() {
        // The average sensor is on when all its sensors are on.
        for (Sensor sensor : sensors) {

        }
        return false;
    }

    @Override
    public void on() {
        // turn on the AverageSensor
        state = true;

        // When the average sensor is switched on, all its sensors have to be switched on if they were not on already.
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                sensor.on();
            }
        }
    }

    @Override
    public void off() {
        // turn off the AverageSensor
        state = false;

        // When the average sensor is closed, at least one of its sensors has to be switched off.
        // It's also possible that all its sensors are switched off.

        int i = 0;
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return;
            } else {
                // What if all sensors are on? Turn off at least one.
                i++;
                if (i == sensors.size()) {
                    sensor.off();
                    return;
                }
            }

        }
    }

    @Override
    public int measure() {

        return 0;
    }

}
