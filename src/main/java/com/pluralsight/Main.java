package com.pluralsight;

public class Main {

    public static void main(String[] args) {

        // -----------------------------------------------------
        //                    Car(s)
        // -----------------------------------------------------
        Vehicle hondaAccord = new Car("Honda Accord LX 4-Cyl", "Honda", "Desert Mist", 5,
                17.1, 16.7, 125, "Kimball", "VIN-0002");
        // -----------------------------------------------------
        //                    Hovercraft(s)
        // -----------------------------------------------------
        Vehicle hovercraft = new Hovercraft("Griffon Hoverwork 8000td", "Griffon Hoverwork", "Silver", 100,
                528, 8000, 50, "Some dude", "VIN-0003");
        // -----------------------------------------------------
        //                    Moped(s)
        // -----------------------------------------------------
        Vehicle chickMagnet = new Moped("Puch Newport", "Puch", "Yellow", 1,
                0.85, 0, 30, "Peter Parker", "VIN-0001");
        // -----------------------------------------------------
        //                    SemiTruck(s)
        // -----------------------------------------------------
        Vehicle optimusPrime = new SemiTruck("Freightliner FL86", "Freightliner", "Red", 2,
                100, 40000, 75, "Optimus", "VIN-0004");

        //* Display vehicle information:
        boolean displayInfo = InputToolbox.promptYesNo(
                "Would you like to display existing vehicle's information?:");
        while (!displayInfo) {
            System.out.println("Got it. Exiting");
            System.exit(0);
        }
            System.out.println(
                    "CARS: \n" + "\nName: " + hondaAccord.getName() +  "\nBrand: " + hondaAccord.getBrand() + "\nColor: " +  hondaAccord.getColor() +
                            "\nDriver: " + hondaAccord.getDriver() + "\nFuel Capacity: " + hondaAccord.getFuelCapacity());

            System.out.println("\nHOVERCRAFTS: \n" + "\nName: " + hovercraft.getName() +  "\nBrand: " + hovercraft.getBrand() + "\nColor: " +  hovercraft.getColor() +
                    "\nDriver: " + hovercraft.getDriver() + "\nFuel Capacity: " + hovercraft.getFuelCapacity());

            System.out.println("\nCHICK MAGNETS: \n" + "\nName: " + chickMagnet.getName() + "\nBrand: " + chickMagnet.getBrand() + "\nColor: " +  chickMagnet.getColor() +
                "\nDriver: " + chickMagnet.getDriver() + "\nFuel Capacity: " + chickMagnet.getFuelCapacity());

            System.out.println("\nSEMI TRUCKS: \n" + "\nName: " + optimusPrime.getName() + "\nBrand: " + optimusPrime.getBrand() + "\nColor: " +  optimusPrime.getColor() +
                "\nDriver: " + optimusPrime.getDriver() + "\nFuel Capacity: " + optimusPrime.getFuelCapacity());
    }

}
