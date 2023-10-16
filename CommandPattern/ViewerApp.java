package CommandPattern;
import java.util.Scanner;
public class ViewerApp {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Select a device: ");
            System.out.println("1. Lights");
            System.out.println("2. Music Player");
            System.out.println("3. Smart Fan");
            System.out.println("4. Exit");
            System.out.println("Enter a number: ");
            int devChoice = sc.nextInt();
            if(devChoice==4){
                System.out.println("Program Terminated...");
                break;
            }
            switch(devChoice){
                case 1:
                    while(true){
                        System.out.println("Lights' Command List: ");
                        System.out.println("1. Turn the lights on.");
                        System.out.println("2. Turn the lights off");
                        System.out.println("3. Increase the lights' brightness");
                        System.out.println("4. Decrease the lights' brightness");
                        System.out.println("0. Exit Command Option");
                        System.out.println("Enter command: ");
                        int devCommand = sc.nextInt();
                        if(devCommand==0){
                            System.out.println("Exiting command option...\n Please pick new device");
                            break;
                        }else{
                            handleDeviceCommand(devCommand,devChoice);
                        }
                        System.out.println();
                    }break;
                case 2:
                    while(true){
                        System.out.println("Music Player's Command List: ");
                        System.out.println("1. Turn the music on!");
                        System.out.println("2. Turn the music off! ");
                        System.out.println("3. Increase music volume");
                        System.out.println("4. Decrease music volume");
                        System.out.println("0. Exit Command Option");
                        System.out.println("Enter command: ");
                        int devCommand = sc.nextInt();
                        if(devCommand==0){
                            System.out.println("Exiting command option...\n Please pick new device");
                            break;
                        }else{
                            handleDeviceCommand(devCommand,devChoice);
                        }
                        System.out.println();
                    }break;
                case 3:
                    while(true){
                        System.out.println("Smart Fan's Command List: ");
                        System.out.println("1. Turn the fan on!");
                        System.out.println("2. Turn the fan off! ");
                        System.out.println("3. Increase fan speed!");
                        System.out.println("4. Decrease fan speed!");
                        System.out.println("0. Exit Command Option");
                        System.out.println("Enter command: ");
                        int devCommand = sc.nextInt();
                        if(devCommand==0){
                            System.out.println("Exiting command option...\n Please pick new device.");
                            break;
                        }else{
                            handleDeviceCommand(devCommand,devChoice);
                        }
                        System.out.println();
                    }break;
                default:
                    System.out.println("Invalid Choice. Please enter [0-4]");
            }
        }
    }
    private static void handleDeviceCommand(int devCommand,int devChoice){

        switch(devChoice){
            case 1: //lights
                Light light = new Light();
                RemoteControl lightRemote = new RemoteControl();
                Command lightPowerOn = new LightSwitchOn(light);
                Command lightPowerOff = new LightSwitchOff(light);
                Command lightBrightnessIncrease = new LightBrightnessInrease(light);
                Command lightBrightnessDecrease = new LightBrightnessDecrease(light);
                lightRemote.addCommand(lightPowerOn);
                lightRemote.addCommand(lightPowerOff);
                lightRemote.addCommand(lightBrightnessIncrease);
                lightRemote.addCommand(lightBrightnessDecrease);
                switch (devCommand){
                    case 1:
                        lightRemote.clickButton(0);
                        break;
                    case 2:
                        lightRemote.clickButton(1);
                        break;
                    case 3:
                        lightRemote.clickButton(2);
                        break;
                    case 4:
                        lightRemote.clickButton(3);
                        break;
                    default:
                        System.out.println("Invalid Choice!");
                        break;
                }break;
            case 2: // Music Player
                MusicPlayer mp =new MusicPlayer();
                RemoteControl musicRemote = new RemoteControl();
                Command musicOn = new MusicPlayerPowerOn(mp);
                Command musicOff = new MusicPlayerPowerOff(mp);
                Command musicVolumeInc= new MusicPlayerIncreaseVolume(mp);
                Command musicVolumeDec = new MusicPlayerDecreaseVolume(mp);
                musicRemote.addCommand(musicOn);
                musicRemote.addCommand(musicOff);
                musicRemote.addCommand(musicVolumeInc);
                musicRemote.addCommand(musicVolumeDec);
                switch(devCommand){
                    case 1:
                        musicRemote.clickButton(0);
                        break;
                    case 2:
                        musicRemote.clickButton(1);
                        break;
                    case 3:
                        musicRemote.clickButton(2);
                        break;
                    case 4:
                        musicRemote.clickButton(3);
                        break;
                    default:
                        System.out.println("Invalid Choice!");
                }break;
            case 3:
                SmartFan sf = new SmartFan();
                RemoteControl smartFanControl = new RemoteControl();
                Command smartFanOn = new SmartFanOn(sf);
                Command smartFanOff = new SmartFanOff(sf);
                Command smartFanInc = new SmartFanSpeedIncrease(sf);
                Command smartFanDec = new SmartFanSpeedDecrease(sf);
                smartFanControl.addCommand(smartFanOn);
                smartFanControl.addCommand(smartFanOff);
                smartFanControl.addCommand(smartFanInc);
                smartFanControl.addCommand(smartFanDec);

                switch (devCommand){
                    case 1:
                        smartFanControl.clickButton(0);
                        break;
                    case 2:
                        smartFanControl.clickButton(1);
                        break;
                    case 3:
                        smartFanControl.clickButton(2);
                        break;
                    case 4:
                        smartFanControl.clickButton(3);
                        break;
                    default:
                        System.out.println("Invalid Choice!");
                }break;
        }
    }
}
