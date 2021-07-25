public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger(12, 100, 1000,
                "Audi", 4, 10, "type1", 4);
        Cargo cargo = new Cargo(57, 100, 5377, "brand1", 10,
                20, 10000);
        Civil civil = new Civil(1000, 1000, 5000, "Brand2", 5,
                100, 100, true);
        Military military = new Military(2000, 2000, 2000, "Brand3",
                2, 20, true, 10);

        System.out.println(passenger);
        System.out.println(cargo);
        System.out.println(civil);
        System.out.println(military);
        System.out.println();

        passenger.info(5);
        System.out.println(cargo.info(500));
        System.out.println(civil.info(100));
        System.out.println(military.checkEjection());
        System.out.println(military.shot());
    }
}
