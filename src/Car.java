/*
Nayal Merchant
10/29/22
Desc: This is the Car class that implements an interface named CarbonFootprint that calculates CarbonFootprint..
The calculations are gotten from : https://justenergy.com/blog/how-to-calculate-your-carbon-footprint/
 */
public class Car implements CarbonFootprint{
    private int miles = 100;

    public int getMiles() {
        return this.miles;
    }
    @Override
    public String getCarbonFootprint() {
        return "Car: \n" +
        "Monthly gas bill is " + 3.50 * getMiles() +
                " if you pay 3.50 per gallon and drive "+ getMiles() + " miles" + "\n" +
        "Your carbon footprint is 105 * " + getMiles() + " + ("  + getMiles() * 12  * 0.79 + ")"
                + "(yearly mileage * .79) = " + (getMiles() * 12  * 0.79) + 105 * getMiles();

    }
}
