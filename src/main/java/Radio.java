public class Radio {

    private byte currentRadioStation;
    private byte currentVolume;

    public byte getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(byte currentRadioStation) {
        if (currentRadioStation > 9 || currentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setNextRadioStation() {
        if (currentRadioStation == 9) {
            this.currentRadioStation = 0;
        } else {
            this.currentRadioStation++;
        }
    }

    public void setPreviousRadioStation() {
        if (currentRadioStation == 0) {
            this.currentRadioStation = 9;
        } else {
            this.currentRadioStation--;
        }
    }

    public byte getCurrentVolume() {
        return currentVolume;
    }

    public void setIncreaseVolume() {
        if (currentVolume < 10) {
            this.currentVolume++;
        }
        if (currentVolume > 10) {
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
