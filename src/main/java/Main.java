public class Main { public static void main(String[] args) {
    // Создаем объекты ГорячийНапиток
    HotDrink tea = new HotDrink("Tea", 250, 80);
    HotDrink coffee = new HotDrink("Coffee", 200, 90);
    System.out.println("До изменений");
    System.out.println(tea);
    System.out.println(coffee);
    System.out.println("-".repeat(45));
    System.out.println("После изменений");

    // Изменяем значения переменных
    tea.setTemperature(85);
    coffee.increaseTemperature(10);

    System.out.println(tea);
    System.out.println(coffee);
    System.out.println("-".repeat(45));
    System.out.println("Финальная версия ");

    // Создаем объект ГорячихНапитковАвтомат
   Automat vendingMachine = new Automat();

    // Получаем продукт из автомата
    HotDrink hotChocolate = vendingMachine.getProduct("Hot Chocolate", 300, 75);
    HotDrink greenTea = vendingMachine.getProduct("Green Tea", 200, 70, 5);

    // Выводим информацию о полученных продуктах
    System.out.println(hotChocolate.getName()
            + " - " + hotChocolate.getVolume()
            + "ml, " + hotChocolate.getTemperature()
            + "°C");
    System.out.println(greenTea.getName()
            + " - " + greenTea.getVolume()
            + "ml, " + greenTea.getTemperature()
            + "°C, +"
            + ((ExtendsHotDrinks) greenTea).getAditionalTemperature()
            + "°C");
}
}
