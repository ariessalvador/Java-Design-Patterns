public class RefrigeratorAdapter implements PowerOutlet{
    private Refrigerator ref;
    public RefrigeratorAdapter(Refrigerator ref){
        this.ref = ref;
    }
    @Override
    public String plugIn() {
        return ref.startCooling();
    }

    @Override
    public String deviceInformation() {
        return ref.RefrigeratorInformation();
    }
}
