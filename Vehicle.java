public class Vehicle {

    String brandName;
    String modelName;
    String color;
    String fuelType;
    double price;
    String mfgCode;
    String regNo;

    // Default constructor
    public Vehicle() {
        brandName = "Hyundai";
        modelName = "i10";
        color = "Silver";
        fuelType = "Petrol";
        price = 500000.99;
        mfgCode = "HYN12345";
        regNo = "HYN98765";
    }

    // Parameterized constructor
    public Vehicle(String brandName, String modelName, double price, String mfgCode, String fuelType) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.price = price;
        this.mfgCode = mfgCode;
        this.fuelType = fuelType;
    }

    public void stop() {
        System.out.println("Vehicle stopped");
    }

    public void drive(int initGear, int initSp, int tgtSp) {

        if (initGear != 1)
            System.out.println("I always start moving at the first gear.");

        if (initSp <= 20)
            System.out.println("That is the ideal speed to start with.");
        else
            System.out.println("Be careful!");

        if (tgtSp > 200)
            System.out.println("Look out for cops!");
        else
            System.out.println("You are within the ideal speed range.");
    }

    public double calcTripMileage(double noOfKms, double fuelUsed) {
        return noOfKms / fuelUsed;
    }

    public void setMfgCode(String mfgCode) {
        this.mfgCode = mfgCode;
    }

    // MAIN METHOD
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();

        Vehicle v2 = new Vehicle("Honda", "City", 400000.99, "HON983022", "Petrol");
        v2.color = "White";

        Vehicle v3 = v2;
        v3.setMfgCode("HON98765");
        v3.color = "Orange";
        v3.fuelType = "Diesel";

        Vehicle v4 = new Vehicle("Tata", "Nexon", 800000.00, "TAT445566", "Diesel");
        v4.color = "Blue";

        Vehicle[] fleet = {v1, v2, v3, v4};

        double[] kms = {200, 140, 300, 180};
        double[] fuel = {14, 20, 13, 19};

        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("No | Brand | Model | Color | Fuel | Price | MfgCode | Distance | FuelUsed | Mileage");
        System.out.println("--------------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < fleet.length; i++) {
            double mileage = fleet[i].calcTripMileage(kms[i], fuel[i]);
            System.out.println(
                    (i + 1) + "  | " +
                    fleet[i].brandName + " | " +
                    fleet[i].modelName + " | " +
                    fleet[i].color + " | " +
                    fleet[i].fuelType + " | " +
                    fleet[i].price + " | " +
                    fleet[i].mfgCode + " | " +
                    kms[i] + " | " +
                    fuel[i] + " | " +
                    mileage
            );
        }
    }
}
