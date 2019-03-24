package application;

import java.util.ArrayList;

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
        int i = 0;
        for (Sensor sensor : sensors) {
            if (sensor.isOn()) {
                i++;
            }
            // all the sensors are on
            if (i == sensors.size()) {
                state = true;
                return true;
            }
        }
        state = false;
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

    /**
     * If the measure method is called when the average sensor is off,
     * or if the average sensor was not added any sensor, the method throws an IllegalStateException.
     * @return the average value of all sensors
     */
    @Override
    public int measure() throws IllegalStateException {

        if (!state) {
            throw new IllegalStateException("average sensor is off");
        }

        if (sensors.size() == 0) {
            throw new IllegalStateException("have not added any sensors");
        }

        int sum = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.measure();
        }
        return sum / sensors.size();
    }

}
