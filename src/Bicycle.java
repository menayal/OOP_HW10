/*
Nayal Merchant
10/29/22
Desc: This is the Bicycle class that implements an interface named CarbonFootprint that calculates CarbonFootprint..
The calculations are gotten from : https://justenergy.com/blog/how-to-calculate-your-carbon-footprint/
 */
public class Bicycle implements CarbonFootprint {
    private int speed = 20;

    public int showSpeed() {
        return this.speed;
    }

    @Override
    public String getCarbonFootprint() {
        return "Bicycle: " + "\n" + "No gas, so there is no Carbon Footprint";

    }
}
