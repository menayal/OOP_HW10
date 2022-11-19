/*
Nayal Merchant
10/29/22
Desc: This is the Building class that implements an interface named CarbonFootprint that calculates CarbonFootprint..
The calculations are gotten from : https://justenergy.com/blog/how-to-calculate-your-carbon-footprint/
 */
public class Building implements CarbonFootprint{
    private int rooms = 10;
    private double electric = 300;
    private double gas = 150;
    private double oil = 200;


    public int showRooms() {
        return this.rooms;
    }

    public double getElectric() {
        return electric;
    }

    public double getGas() {
        return gas;
    }

    public double getOil() {
        return oil;
    }

    @Override
    public String getCarbonFootprint() {
        double total = (105 * getElectric()) + (105 * getGas()) + (113 * getOil());
        return "Building: \n" +
        "Your carbon footprint for electricity is 105 * " + getElectric() + " = " + 105 * getElectric() + "\n" +
        "Your carbon footprint for gas is 105 * " + getGas() + " = " + 105 * getGas() + "\n" +
        "Your carbon footprint for oil is 113 * " + getOil() + " = " + 113 * getOil() + "\n" +
        "Total carbon footprint: " + total;
    }
}
