public class ExtendsHotDrinks extends HotDrink{
    private int aditionalTemperature;

    public ExtendsHotDrinks(String name, int volume, int temperature, int aditionalTemperature) {
        super(name, volume, temperature);
        this.aditionalTemperature = aditionalTemperature;
    }

    public int getAditionalTemperature() {
        return aditionalTemperature;
    }

    public void setAditionalTemperature(int aditionalTemperature) {
        this.aditionalTemperature = aditionalTemperature;
    }
}
