public class Radio {

    private byte currentRadioStation;
    private int currentVolume;

    private byte amountPossibleStations = 10;

    private final int maxVolume = 100;

    public Radio() {
    }

    public Radio(byte amountPossibleStations) {
        this.amountPossibleStations = amountPossibleStations;
    }

    public Radio(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public byte getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(byte currentRadioStation) {
        if (currentRadioStation >= amountPossibleStations || currentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setNextRadioStation() {
        if (currentRadioStation == amountPossibleStations -1) {
            this.currentRadioStation = 0;
        } else {
            this.currentRadioStation++;
        }
    }

    public void setPreviousRadioStation() {
        if (currentRadioStation == 0) {
            this.currentRadioStation = (byte) (amountPossibleStations - 1);
        } else {
            this.currentRadioStation--;
        }
    }

    public int getCurrentVolume() {
        return this.currentVolume = maxVolume;
    }

    public void setIncreaseVolume() {
        if (currentVolume <= 100) {
            this.currentVolume++;
        } else {
            this.currentVolume = currentVolume;
        }
    }

    public void setDecreaseVolume() {
        if (currentVolume > 0) {
            this.currentVolume--;
        }
        if (currentVolume == 0) {
            this.currentVolume = currentVolume;
        }
    }
}
