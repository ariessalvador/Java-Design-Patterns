package CommandPattern;

public class LightBrightnessInrease implements Command {
    private Light light;

    public LightBrightnessInrease(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println(light.increase());
    }
}
