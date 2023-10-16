package CommandPattern;

public class LightBrightnessDecrease implements Command {
    private Light light;

    public LightBrightnessDecrease(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println(light.decrease());
    }
}
