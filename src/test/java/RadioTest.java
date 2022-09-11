import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;



public class RadioTest {

    @ParameterizedTest
    @CsvSource({"127, 0", "-2, 0"})
    public void shouldBeInLimitsStations(byte radioStation, byte expected) {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(radioStation);
        byte actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldBeZeroIfStationNineWithNext() {
        Radio radio = new Radio();
        byte radioStation = 9;
        radio.setCurrentRadioStation(radioStation);
        byte expected = 0;
        radio.setNextRadioStation();
        byte actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBeNineIfZeroWithPrev() {
        Radio radio = new Radio();
        byte radioStation = 0;
        radio.setCurrentRadioStation(radioStation);
        byte expected = 9;
        radio.setPreviousRadioStation();
        byte actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBeNext() {
        Radio radio = new Radio();
        byte radioStation = 5;
        radio.setCurrentRadioStation(radioStation);
        byte expected = 6;
        radio.setNextRadioStation();
        byte actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldBePrev() {
        Radio radio = new Radio();
        byte radioStation = 5;
        radio.setCurrentRadioStation(radioStation);
        byte expected = 4;
        radio.setPreviousRadioStation();
        byte actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();
        byte radioStation = 5;
        radio.setCurrentRadioStation(radioStation);
        byte expected = 5;
        byte actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio volume = new Radio();
        volume.setIncreaseVolume();
        byte expected = 1;
        byte actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio volume = new Radio();
        volume.setIncreaseVolume();
        volume.setIncreaseVolume();
        volume.setDecreaseVolume();
        byte expected = 1;
        byte actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void minVolume() {
        Radio volume = new Radio();
        volume.setDecreaseVolume();
        byte expected = 0;
        byte actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void maxVolume() {
        Radio volume = new Radio();
        volume.setIncreaseVolume();
        volume.setIncreaseVolume();
        volume.setIncreaseVolume();
        volume.setIncreaseVolume();
        volume.setIncreaseVolume();
        volume.setIncreaseVolume();
        volume.setIncreaseVolume();
        volume.setIncreaseVolume();
        volume.setIncreaseVolume();
        volume.setIncreaseVolume();
        byte expected = 10;
        byte actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void overMaxVolume() {
        Radio volume = new Radio();
        volume.setIncreaseVolume();
        volume.setIncreaseVolume();
        volume.setIncreaseVolume();
        volume.setIncreaseVolume();
        volume.setIncreaseVolume();
        volume.setIncreaseVolume();
        volume.setIncreaseVolume();
        volume.setIncreaseVolume();
        volume.setIncreaseVolume();
        volume.setIncreaseVolume();
        volume.setIncreaseVolume();
        volume.setIncreaseVolume();
        byte expected = 10;
        byte actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}
