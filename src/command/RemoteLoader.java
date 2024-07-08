package command;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        Light light = new Light();
        remote.setCommand(0, new LightOnCommand(light), new LightOffCommand(light));

        Stereo stereo = new Stereo();
        remote.setCommand(1, new StereoOnWithCDCommand(stereo), new StereoOffWithCDCommand(stereo));

        System.out.println(remote);

        remote.onButtonWasPushed(0);
        remote.onButtonWasPushed(1);

        remote.offButtonWasPushed(1);
    }

}
