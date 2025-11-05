package objinfo;

public class Main {
    public static void main(String[] args) {
        //create object of the Car class by using the constructor
        Car car = new Car("Leaf", "Nissan", 2020, 30500, "White", 10);

        //call and print what the toString () method passes
        System.out.println(car);

        //we call the sell() method
        car.sell(2);

        //print all fields (using the previously declared "get" methods of the object field)
        System.out.println("Car " + " {model: " + car.getModel() +
                ", brand: " + car.getBrand() + ", year: " +
                car.getYear() + ", price: " + car.getPrice() +
                ", color: " + car.getColor() + ", quantity " + car.getQuantity() + "}");

        //using the "set" methods change some fields of the object
        car.setColor("Red");
        car.setPrice(32500);

        //call and print again toString() method to notice the changes
        System.out.println(car);
    }
}
