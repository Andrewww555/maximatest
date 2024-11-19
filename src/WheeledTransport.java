
class WheeledTransport {
    private int wheelCount;
    private double maxSpeed;

    public WheeledTransport(int wheelCount, double maxSpeed) {
        this.wheelCount = wheelCount;
        this.maxSpeed = maxSpeed;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void service() {
        System.out.println("Обслужено колёс - " + wheelCount);
    }
}


class Bicycle extends WheeledTransport {
    private String type;

    public Bicycle(int wheelCount, double maxSpeed, String type) {
        super(wheelCount, maxSpeed);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void service() {
        super.service();
        System.out.println("Обслужено навесное оборудование велосипеда типа \"" + type + "\".");
    }
}


class MotorTransport extends WheeledTransport {
    private String engineType;

    public MotorTransport(int wheelCount, double maxSpeed, String engineType) {
        super(wheelCount, maxSpeed);
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public void service() {
        super.service();
        System.out.println("Обслужен двигатель, тип: " + engineType + ".");
    }
}


class Car extends MotorTransport {
    private String brand;
    private String model;

    public Car(int wheelCount, double maxSpeed, String engineType, String brand, String model) {
        super(wheelCount, maxSpeed, engineType);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void service() {
        super.service();
        System.out.println("Обслужен автомобиль: " + brand + " " + model + ".");
    }
}


class Truck extends MotorTransport {
    private double payloadCapacity;

    public Truck(int wheelCount, double maxSpeed, String engineType, double payloadCapacity) {
        super(wheelCount, maxSpeed, engineType);
        this.payloadCapacity = payloadCapacity;
    }

    public double getPayloadCapacity() {
        return payloadCapacity;
    }

    public void setPayloadCapacity(double payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void service() {
        super.service();
        System.out.println("Обслужен грузовик, грузоподъемность: " + payloadCapacity + " кг.");
    }
}



