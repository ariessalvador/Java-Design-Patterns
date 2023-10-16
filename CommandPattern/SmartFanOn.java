package CommandPattern;

public class SmartFanOn implements Command{
    private SmartFan smartFan;

    public SmartFanOn(SmartFan smartFan){
        this.smartFan = smartFan;
    }

    @Override
    public void execute() {
        System.out.println(smartFan.switchOn());
    }
}
