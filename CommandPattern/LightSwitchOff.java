package CommandPattern;

public class LightSwitchOff implements Command{
    private Light light;

    public LightSwitchOff(Light light){
        this.light = light;
    }

    @Override
    public void execute() {

    }
}
