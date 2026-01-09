import java.util.*;

public class FirstClass {
    public static void main(String[] args) {
        double np;
        Scanner scnr = new Scanner(System.in);
        /*
        A reference is a variable type that refers to an object (Storing memory address). 
        Variables of class data types (and array types, discussed elsewhere) are reference variables.
        
        ***reference (address) to object stored on stack frame 
        ***object memory is allocated on heap with object header and instance variables
         */
        Plane plane = new Plane(); 
        // Plane privateJet = new Plane(1500.0, 20000.0, 1000000.0); // valid due to constructor overloading
        System.out.println("Previous economy price " + plane.getPriceByTier(SeatTier.ECONOMY));
        System.out.println("Setting new price. Please choose a new price for this plane ticket.");
        np = scnr.nextDouble();
        plane.setEconomyPrice(np);
    }
}

enum SeatTier {ECONOMY, BUSINESS, FIRST};
class Plane {
    // can initialize fields in the field declaration
    HashMap<SeatTier, Double> priceMap = new HashMap<>();
    /*
        Constructor overloading lets you define multiple constructors within the same class, 
        each with the same name but a different parameter list 
        (different number, type, or order of parameters)
     */
    public Plane() {
        priceMap.put(SeatTier.ECONOMY, 99.99);
        priceMap.put(SeatTier.BUSINESS, 199.99);
        priceMap.put(SeatTier.FIRST, 1299.99);
    }
    public Plane(double economyPrice, double businessPrice, double firstClassPrice) {
        priceMap.put(SeatTier.ECONOMY, economyPrice);
        priceMap.put(SeatTier.BUSINESS, businessPrice);
        priceMap.put(SeatTier.FIRST, firstClassPrice);
    }

    public double getPriceByTier(SeatTier tier) {
        return priceMap.get(tier);
    }

    public void setEconomyPrice(double newPrice) {
        if (newPrice < 100) {
            System.out.println("The price is too low");
        } else if (newPrice < priceMap.get(SeatTier.ECONOMY)) {
            System.out.println("The price input is lower than previous price");
        } else {
            priceMap.put(SeatTier.ECONOMY, newPrice);
            System.out.println("Successfully set the new economy price to " + newPrice);
        }
        System.out.println("✅ Finished operation");
    }

    
}