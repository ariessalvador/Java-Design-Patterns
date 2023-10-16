package CommandPattern;

public class SmartFanOff implements Command{
    private SmartFan smartFan;

    public SmartFanOff(SmartFan smartFan){
        this.smartFan = smartFan;
    }

    @Override
    public void execute() {
        System.out.println(smartFan.switchOff());

    }
}
