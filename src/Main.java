import java.util.ArrayList;

/*
Nayal Merchant
10/29/22
Desc: This is the driver program showcasing an interface.
The calculations are gotten from : https://justenergy.com/blog/how-to-calculate-your-carbon-footprint/
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<CarbonFootprint> listOfObjects = new ArrayList<>();

        //creates 5 objects
        for (int i = 0; i < 5; i++) {

            //get rand values

            int randNum = 1 + (int)(Math.random() * ((3 - 1) + 1)); //1 - 3

            switch (randNum) {
                case 1:
                    //Create new Building obj and add to the list
                    Building build1 = new Building();
                    listOfObjects.add(build1);
                    break;
                case 2:
                    //Create new Car obj and add to the list
                    Car car = new Car();
                    listOfObjects.add(car);
                    break;
                case 3:
                    //Create new Bicycle obj and add to the list
                    Bicycle bike = new Bicycle();
                    listOfObjects.add(bike);
                    break;
            }
        }


        //        display
        for(int i= 0; i < listOfObjects.size(); i++) {
            listOfObjects.get(i).getCarbonFootprint();
            System.out.println();
        }

    }
}