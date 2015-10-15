

/**
 * A car has a certain fuel effiency and a certain amount of fuel in the gas tank
 * The car can be driven a certain distance
 * Stephen Fan
 * 9/10/2015
 */
public class Car
{
    /** fuel efficiency of the car in miles per gallon */
    private double fuelEfficiency;
    
    /** amount of fuel left in the car's tank in gallons */
    private double fuelInTank;

    /**
     * Default constructor for objects of class Car
     */
    public Car( double fuelEfficiency)
    {
        // initialise instance variables
       this.fuelEfficiency = fuelEfficiency;
       this.fuelInTank = 0;
    }

    /**
     * Simulates driving the car the specified distance
     * Reduces the amount of fuel in the tank
     *
     * @pre        specified distance cannot result in the consumption of more gas than is available
     * 
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void drive ( double distance)
    {
        this.fuelInTank -= distance/fuelEfficiency;
    }
    
    /**
     * returns the amount of gas in the gas tank in gallons
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public double getGasInTank()
    {
        return this.fuelInTank;
    }
    

    /**
     * Increases the fuel in the tank by the specified number of gallons
     *
     * @pre     gallonsOfGas must be positive number
     * @param   gallonsOfGas amount of gas to add to the gas tank
     */
    public void addGas(double gallonsOfGas)
    {
        this.fuelInTank += gallonsOfGas;
    }

}
