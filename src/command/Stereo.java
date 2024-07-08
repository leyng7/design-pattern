package command;

public class Stereo {

    public void on() {
        System.out.println("Stereo on");
    }

    public void off() {
        System.out.println("Stereo off");
    }

    public void setCd() {
        System.out.println("Stereo set cd");
    }

    public void setDvd() {
        System.out.println("Stereo set dvd");
    }

    public void setRadio() {
        System.out.println("Stereo set radio");
    }

    public void setVolume(int volume) {
        System.out.println("Stereo set volume " + volume);
    }

}
