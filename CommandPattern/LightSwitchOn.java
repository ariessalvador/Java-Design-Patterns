package CommandPattern;

public class LightSwitchOn implements Command{
    private Light light;

    public LightSwitchOn(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println(light.switchOn());
    }
}
