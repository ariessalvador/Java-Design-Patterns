package CommandPattern;

public class SmartFanSpeedIncrease implements Command {
    private SmartFan smartFan;

    public SmartFanSpeedIncrease(SmartFan smartFan){
        this.smartFan = smartFan;
    }

    @Override
    public void execute() {
        System.out.println(smartFan.increaseFan());

    }
}
