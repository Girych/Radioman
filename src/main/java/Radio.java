public class Radio {

    private int currentStationNumber;
    private int currentVolume;
    private int maxStation = 9;

    public Radio() {
        maxStation = 9;
    }

    public Radio(int stationsCount) {
        maxStation = stationsCount - 1;
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void next() {
        if (currentStationNumber < maxStation) {
            currentStationNumber++;
        } else {
            currentStationNumber = 0;
        }
    }

    public void prev() {
        if (currentStationNumber > 0) {
            currentStationNumber--;
        } else {
            currentStationNumber = maxStation;
        }
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber < 0) {
            return;
        }
        if (currentStationNumber > maxStation)
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

