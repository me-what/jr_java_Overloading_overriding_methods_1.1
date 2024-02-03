public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(5,5));
        System.out.println(calculator.sum(5,5,5));
        System.out.println(calculator.sum(5.0, 5.0));
        calculator.sum();
        System.out.println("\n");

        Vehicle vehicle = new Vehicle();
        vehicle.move();

        Car car = new Car();
        car.move();

        Vehicle secondVehicle = new Car();
        secondVehicle.move();

    }
}