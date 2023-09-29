public class Automat implements VendingMachine{

    @Override
    public HotDrink getProduct(String name, int volume, int temperature){
        return new HotDrink(name, volume, temperature);
    }

// Перегружаем метод
    public HotDrink getProduct(String name, int volume, int temperature, int additionalTemperature) {
        return new ExtendsHotDrinks(name, volume, temperature, additionalTemperature);
    }
}
