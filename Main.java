class Vehicle {
    public void move() {
        System.out.println("Kendaraan sedang bergerak...");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Mobil sedang melaju di jalan raya...");
    }

    // Method overloading untuk menggerakkan mobil mundur
    public void move(String direction) {
        System.out.println("Mobil sedang mundur ke arah " + direction);
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.move(); // Akan memanggil method move() dari Car
        Car myCar = new Car();
        myCar.move("belakang"); // Akan memanggil method move(String) dari Car
    }
}
