package CommandPattern;
import java.util.Scanner;
public class ViewerApp {
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Select a device:");
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
                switch (devCommand){
                    case 1:
                        System.out.println(light.switchOn());
                        break;
                    case 2:
                        System.out.println(light.switchOff());
                        break;
                    case 3:
                        System.out.println(light.increase());
                        break;
                    case 4:
                        System.out.println(light.decrease());
                        break;
                    default:
                        System.out.println("Invalid Choicewdada!");
                        break;
                }break;
            case 2: // Music Player
                MusicPlayer mp =new MusicPlayer();
                switch (devCommand){
                    case 1:
                        System.out.println(mp.switchOn());
                        break;
                    case 2:
                        System.out.println(mp.switchOff());
                        break;
                    case 3:
                        System.out.println(mp.increaseVolume());
                        break;
                    case 4:
                        System.out.println(mp.decreaseVolume());
                        break;
                    default:
                        System.out.println("Invalid Choice!");
                }break;
            case 3:
                SmartFan sf = new SmartFan();
                switch (devCommand){
                    case 1:
                        System.out.println(sf.switchOn());
                        break;
                    case 2:
                        System.out.println(sf.switchOff());
                        break;
                    case 3:
                        System.out.println(sf.increaseFan());
                        break;
                    case 4:
                        System.out.println(sf.decreaseFan());
                        break;
                    default:
                        System.out.println("Invalid Choice!");
                }break;
        }
    }
}
