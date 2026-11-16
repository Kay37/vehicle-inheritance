package com.pluralsight;

public class Main {

    public static void main(String[] args) {

        // -----------------------------------------------------
        //                    Car(s)
        // -----------------------------------------------------
        Vehicle hondaAccord = new Car();
        hondaAccord.setBrand("Honda");
        hondaAccord.setName("Honda Accord LX 4-Cyl");
        hondaAccord.setColor("Desert Mist");
        hondaAccord.setDriver("Kimball");
        hondaAccord.setFuelCapacity(17.1);
        // -----------------------------------------------------
        //                    Hovercraft(s)
        // -----------------------------------------------------
        Vehicle hovercraft = new Hovercraft();
        hovercraft.setBrand("Griffon Hoverwork");
        hovercraft.setName("Griffon Hoverwork 8000td");
        hovercraft.setColor("Silver");
        hovercraft.setDriver("Some dude");
        hovercraft.setFuelCapacity(528);
        // -----------------------------------------------------
        //                    Moped(s)
        // -----------------------------------------------------
        Vehicle chickMagnet = new Moped();
        chickMagnet.setBrand("Puch");
        chickMagnet.setName("Puch Newport");
        chickMagnet.setColor("Yellow");
        chickMagnet.setDriver("Peter Parker");
        chickMagnet.setFuelCapacity(.85);
        // -----------------------------------------------------
        //                    SemiTruck(s)
        // -----------------------------------------------------
        Vehicle optimusPrime = new SemiTruck();
        optimusPrime.setBrand("Freightliner");
        optimusPrime.setName("Freightliner FL86");
        optimusPrime.setColor("Red");
        optimusPrime.setDriver("Optimus");
        optimusPrime.setFuelCapacity(100);

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
