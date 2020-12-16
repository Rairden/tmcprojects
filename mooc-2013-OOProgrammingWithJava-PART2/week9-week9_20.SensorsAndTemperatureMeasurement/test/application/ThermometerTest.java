package application;

import org.junit.Test;

public class ThermometerTest {
    @Test
    public void randomNumberRange() {
        int i = 0;
        while (i < 100000) {
            i++;
            Thermometer a = new Thermometer();
            int myNum = a.randomNumberRange();

            if (myNum >= -30 && myNum <= 30) {
                assert true;
            } else {
                assert false;
            }
        }
    }
}
