package objinfo;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Leaf", "Nissan", 2020, 30500, "White", 10);
        System.out.println(car.toString());
        car.sell(2);
        System.out.println("Car " + " {model: " + car.getModel() +
                ", brand: " + car.getBrand() + ", year: " +
                car.getYear() + ", price: " + car.getPrice() +
                ", color: " + car.getColor() + ", quantity " + car.getQuantity() + "}");
        car.setColor("Red");
        car.setPrice(32500);
        System.out.println(car.toString());
    }
}
