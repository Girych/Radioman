import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(4);
        radio.next();
        assertEquals(5, radio.getCurrentStationNumber());
    }

    @Test
    public void nextStation2() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        radio.next();
        assertEquals(0, radio.getCurrentStationNumber());
    }

    @Test
    public void previousStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        radio.prev();

        assertEquals(9, radio.getCurrentStationNumber());
    }

    @Test
    public void previousStation2() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(2);
        radio.prev();

        assertEquals(1, radio.getCurrentStationNumber());
    }

    @Test
    public void showStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(10);


        assertEquals(0, radio.getCurrentStationNumber());
    }

    @Test
    public void showStation2() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(-1);


        assertEquals(0, radio.getCurrentStationNumber());
    }


    @Test
    public void lowerVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void powerVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();

        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void powerVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        radio.increaseVolume();

        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void lowerVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.decreaseVolume();

        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void currentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void currentVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        assertEquals(0, radio.getCurrentVolume());
    }
}
