public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car("Model1", 100, 1000000);
        cars[1] = new Car("Model2", 200, 2000000);
        cars[2] = new Car("Model3", 300, 3000000);
        cars[3] = new Car("Model4", 400, 4000000);
        cars[4] = new Car("Model5", 500, 5000000);

        for (Car car : cars) {
            try {
                car.startMoving();
            } catch (CarException exceptionCar) {
                System.out.println(exceptionCar.getMessage());
            } finally {
                System.out.println("Check passed successfully");
                System.out.println();
            }
        }
    }
}
