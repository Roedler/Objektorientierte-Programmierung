package Vorlesung.Notizen.Aufgaben.Vorlesung_8;

public class MyVehicle {
    private String producer;
    private String type;
    private int numberOfWheels;
    private int maxSpeed;

    public MyVehicle(String producer, String type, int numberOfWheels, int maxSpeed) {
        this.producer = producer;
        this.type = type;
        this.numberOfWheels = numberOfWheels;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof MyVehicle vehicle)) {
            return false;
        }

        return this.numberOfWheels == vehicle.numberOfWheels &&
                this.maxSpeed == vehicle.maxSpeed &&
                this.producer.equals(vehicle.producer) &&
                this.type.equals(vehicle.type);
    }
}
