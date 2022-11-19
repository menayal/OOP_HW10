/*
Nayal Merchant
11/7/22
Desc: This is the driver program for the GUI implementing Carbon footprint program.
Note: To implement some functionality of this GUI, I had to put some variables in the
instance variables section of the class.
I also had to declare the action handlers a different way so I could count button clicks.

 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;

public class driver_GUI_Input extends JFrame{
    private int counter = 1; //count button clicks
    JLabel labelCounter; // mentioned so i can update later
    //Create a arraylist
    ArrayList<CarbonFootprint> listOfObjects = new ArrayList<>(); // mentioned so i can update later
    String sizeEntered = ""; // mentioned so i can update later
    public driver_GUI_Input() {

//        Ask user to enter the amount of items to enter
        sizeEntered = JOptionPane.showInputDialog("Enter the amount of items you wish to enter: ");
        labelCounter = new JLabel("Enter item number " + counter + ": ");

        add(labelCounter); //shows the current label with item #

        add(new JLabel("Select a button to add it to the list. To see the items in the list, select results."));

        setUpButtons(); // call func to take care of buttons


    } //end function gui

    public void setUpButtons() {
        //bike button
        JButton jbtBicycle = new JButton("Bicycle");
        setLayout(new FlowLayout());
        add(jbtBicycle);

        //building button
        JButton jbtBuilding = new JButton("Building");
        setLayout(new FlowLayout());
        add(jbtBuilding);

        //car button
        JButton jbtCar = new JButton("Car");
        setLayout(new FlowLayout());
        add(jbtCar);

        //results button
        JButton jbtResults = new JButton("Results");
        setLayout(new FlowLayout());
        add(jbtResults);

        //define the actions
        ActionListener bListen = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == jbtBicycle) { //if bike button pressed
                    labelCounter.setText("Enter item number " + counter + ": ");
                    System.out.println("bike selected");
                    //Create new Bicycle obj and add to the list
                    Bicycle bike = new Bicycle();
                    listOfObjects.add(bike);
                    counter++;
                } else if (e.getSource() == jbtBuilding) { //if building button pressed
                    labelCounter.setText("Enter item number " + counter + ": ");
                    System.out.println("building selected");
                    //Create new Building obj and add to the list
                    Building build1 = new Building();
                    listOfObjects.add(build1);
                    counter++;
                } else if (e.getSource() == jbtCar) { //if car button pressed
                    labelCounter.setText("Enter item number " + counter + ": ");
                    System.out.println("car selected");
                    //Create new Car obj and add to the list
                    Car car = new Car();
                    listOfObjects.add(car);
                    counter++;
                } else if (e.getSource() == jbtResults) { //if results button pressed
                    System.out.println("Results");
                    //        display
                    StringBuilder results = new StringBuilder();

                    for(int i= 0; i < listOfObjects.size(); i++) {
//                      listOfObjects.get(i).getCarbonFootprint();
                        results.append(listOfObjects.get(i).getCarbonFootprint() + "\n" + "\n");
                    }

                    // display the results
                    JOptionPane.showMessageDialog(null, "The results are: \n \n" + results, "Results", JOptionPane.INFORMATION_MESSAGE);

                }

                if(counter == Integer.parseInt(sizeEntered) + 1) { //if capacity met
                    System.out.println("Results");
                    //        display
                    StringBuilder results = new StringBuilder();

                    for(int i= 0; i < listOfObjects.size(); i++) {
                        results.append(listOfObjects.get(i).getCarbonFootprint() + "\n" + "\n");
                    }

                    // display the results
                    JOptionPane.showMessageDialog(null,
                            "You have hit the max size of the list! \n" +
                                    "The results are: \n \n" + results, "Results", JOptionPane.INFORMATION_MESSAGE);

                }

            }

        };

        //add the listener to the buttons
        jbtBicycle.addActionListener(bListen);
        jbtCar.addActionListener(bListen);
        jbtBuilding.addActionListener(bListen);
        jbtResults.addActionListener(bListen);


    }




    public static void main(String[] args) {
        JFrame frame = new driver_GUI_Input();
        frame.setTitle("Add Objects");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        frame.setVisible(true);
    } // main()
}

