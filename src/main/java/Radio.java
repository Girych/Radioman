public class Radio {

    private int currentStationNumber;
    private int currentVolume;


    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void next() {
        if (currentStationNumber < 9) {
            currentStationNumber++;
        } else {
            currentStationNumber = 0;
        }
    }

    public void prev() {
        if (currentStationNumber > 0) {
            currentStationNumber--;
        } else {
            currentStationNumber = 9;
        }
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber < 0) {
            return;
        }
        if (currentStationNumber > 9)
            return;
        this.currentStationNumber = currentStationNumber;

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10)
            return;
        this.currentVolume = currentVolume;
    }
}

