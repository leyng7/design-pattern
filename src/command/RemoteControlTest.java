package command;

public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl control = new SimpleRemoteControl();

        Light light = new Light();
        LightOnCommand command = new LightOnCommand(light);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        control.setCommand(command);
        control.buttonWasPressed();

        control.setCommand(garageOpen);
        control.buttonWasPressed();
    }

}
