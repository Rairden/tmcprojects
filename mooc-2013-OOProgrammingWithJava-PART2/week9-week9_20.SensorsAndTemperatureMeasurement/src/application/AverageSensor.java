package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors;
    private List<Integer> readings;


    public AverageSensor() {
        sensors    = new ArrayList<Sensor>();
        readings   = new ArrayList<Integer>();
    }

    public void addSensor(Sensor additional) {
        sensors.add(additional);
    }

    /**
     * @return a list of the reading results of all the measurements executed through your AverageSensor
     */
    public List<Integer> readings() {
        return readings;
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
                return true;
            }
        }
        return false;
    }

    @Override
    public void on() {
        // When the average sensor is switched on, all its sensors have to be switched on if they were not on already.
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                sensor.on();
            }
        }
    }

    @Override
    public void off() {
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
     * @return sum - the average value of all sensors
     */
    @Override
    public int measure() throws IllegalStateException {

        if (sensors.isEmpty()) {
            throw new IllegalStateException("have not added any sensors");
        }

        if (!isOn()) {
            throw new IllegalStateException("average sensor is off");
        }

        int sum = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.measure();
        }

        int avg = sum / sensors.size();
        readings.add(avg);

        return avg;
    }

}
