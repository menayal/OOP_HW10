
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;

public class driverGUI extends JFrame{
    public driverGUI() {


        //Create a arraylist
        ArrayList<CarbonFootprint> listOfObjects = new ArrayList<>();

        //Ask user to enter the amount of items to enter
//        String sizeEntered = JOptionPane.showInputDialog("Enter the amount of items you wish to enter: ");
//
//        add(new JLabel("Enter item number " + "#" + ": ")); //shows the current label with item #

        add(new JLabel("Select a button to add it to the list. To see the items in the list, select results."));

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

        //function for the bike button
        jbtBicycle.addActionListener( new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.println("bike selected");
                //Create new Bicycle obj and add to the list
                Bicycle bike = new Bicycle();
                listOfObjects.add(bike);

            } // actionPerformed
        } // ActionListener
        ); // add.addActionListener

        //function for the building button
        jbtBuilding.addActionListener( new ActionListener() {

              public void actionPerformed(ActionEvent e) {
                  System.out.println("building selected");
                  //Create new Building obj and add to the list
                  Building build1 = new Building();
                  listOfObjects.add(build1);
              } // actionPerformed
          } // ActionListener
        ); // add.addActionListener

        //function for the car button
        jbtCar.addActionListener( new ActionListener() {

               public void actionPerformed(ActionEvent e) {
                   System.out.println("car selected");
                   //Create new Car obj and add to the list
                   Car car = new Car();
                   listOfObjects.add(car);
               } // actionPerformed
           } // ActionListener
        ); // add.addActionListener

        //function for the results button
        jbtResults.addActionListener( new ActionListener() {

              public void actionPerformed(ActionEvent e) {
                  //        display
                  StringBuilder results = new StringBuilder();

                  for(int i= 0; i < listOfObjects.size(); i++) {
//                      listOfObjects.get(i).getCarbonFootprint();
                      results.append(listOfObjects.get(i).getCarbonFootprint() + "\n" + "\n");

                  }

                  // display the results
                  JOptionPane.showMessageDialog(null, "The results are: \n \n" + results, "Results", JOptionPane.INFORMATION_MESSAGE);

              } // actionPerformed
          } // ActionListener
        ); // add.addActionListener


    } //end class






        //ask user to click on a option that creates a obj
        //Show the results at the end of the desired size


//        JButton jbtOK = new JButton("OK");
//        setLayout(new FlowLayout());
//        add(jbtOK);
//        JButton jbtOK2 = new JButton("OK2");
//        setLayout(new FlowLayout());
//        add(jbtOK2);
//        ActionListener listener = new OKListener();
//        jbtOK.addActionListener(listener);

//        JButton jbtBicycle = new JButton("Bicycle");
//        setLayout(new FlowLayout());
//        add(jbtBicycle);

//        ActionListener listener = new OKListener(); //do something to the button ,,, what
        // is a way to do something on butt
//        jbtBicycle.addActionListener(listener);

//        JButton jbtBuilding = new JButton("Building");
//        setLayout(new FlowLayout());
//        add(jbtBuilding);
//        listener = new OKListener(); //do something to the button
//        jbtBuilding.addActionListener(listener);
//
//        JButton jbtCar = new JButton("Car");
//        setLayout(new FlowLayout());
//        add(jbtCar);
//        listener = new OKListener(); //do something to the button
//        jbtCar.addActionListener(listener);


//        //function for the bike button
//        jbtBicycle.addActionListener( new ActionListener() {
//
//            public void actionPerformed(ActionEvent e) {
////Catches the String in the text field and convert to integers String number1 = first.getText();
//                System.out.println("bike selected");
//            } // actionPerformed
//            } // ActionListener
//            ); // add.addActionListener
//    }

//    public class OKListener implements ActionListener{
//        public void actionPerformed (ActionEvent e) {
//            System.out.println("You just click OK");
//
//
//
//        }
//    }
    public static void main(String[] args) {
        JFrame frame = new driverGUI();
        frame.setTitle("Add Objects");

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setVisible(true);
//        @TODO ask for number of input



    } // main()
}

