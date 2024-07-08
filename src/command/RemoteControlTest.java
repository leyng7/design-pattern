package command;

public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl control = new SimpleRemoteControl();

        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        control.setCommand(lightOnCommand);
        control.buttonWasPressed();

        control.setCommand(lightOffCommand);
        control.buttonWasPressed();

        control.setCommand(garageOpen);
        control.buttonWasPressed();
    }

}
