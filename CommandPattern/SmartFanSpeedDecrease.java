package CommandPattern;

public class SmartFanSpeedDecrease implements Command{
    private SmartFan smartFan;

    public SmartFanSpeedDecrease(SmartFan smartFan){
        this.smartFan = smartFan;
    }

    @Override
    public void execute() {

    }
}
