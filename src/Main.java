public class Main {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle(2, 15.0, "Горный");
        Car car = new Car(4, 220.0, "Бензиновый", "Toyota", "Camry");
        Truck truck = new Truck(6, 100.0, "Дизельный", 5000.0);

        visitServiceStation(bike);
        visitServiceStation(car);
        visitServiceStation(truck);
    }

    public static void visitServiceStation(WheeledTransport transport) {
        transport.service();
    }
}