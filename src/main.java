import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
//  import java.util.Scanner;
import java.awt.event.*;
import javax.swing.*;
//import java.math.BigDecimal;

public class main extends JFrame implements ActionListener{
    main(){}
    //chemical reactor
    //monitors the contents in moles of a and b
    //container one has 6 liters capacity
    //container two has infinite capacity

    static JTextField startingA;
    static JTextField startingB;
    static JTextField Bincoming;
    static JTextField Aincoming;
    static JLabel startingAlabel;
    static JLabel startingBlabel;
    static JLabel BincomingLabel;
    static JLabel AincomingLabel;

    static JTextField wph;
    static JTextField cpw;
    static JTextField noe;
    static JTextField fileName;
    static JTextField smallV;
    static JTextField BathV;
    static JTextField BathVmin;
    static JTextField BathVmax;
    static JTextField CE_anode;
    static JTextField CE_cathode;

    // label to display text
    static JLabel wphLabel;
    static JLabel cpwLabel;
    static JLabel noeLabel;
    static JLabel fileLabel;
    static JLabel mphLabel;
    static JLabel CE_anode_label;
    static JLabel CE_cathode_label;

    static double mph;

    // JFrame
    static JFrame f;

    // JButton
    static JButton b;

    static JLabel smallVlabel;
    static JLabel BathVlabel;
    static JLabel BathVminlabel;
    static JLabel BathVmaxlabel;
    //static JLabel fileNameLabelPair;
    static JLabel fileNameLabel;
    static JLabel molarMassLabel;
    static JTextField molarMass;
    static JLabel molarMassLabel2;
    static JTextField molarMass2;
    static JLabel startingA2label;
    static JTextField startingA2;
    static JLabel startingB2label;
    static JTextField startingB2;
    static JLabel Aincoming2label;
    static JTextField Aincoming2;
    static JLabel Bincoming2label;
    static JTextField Bincoming2;

    //static JLabel info;


    public static void main(String[] args){




        // create a new frame to store text field and button
        f = new JFrame("Model");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container p = f.getContentPane();
        SpringLayout springLayout = new SpringLayout();
        p.setLayout(springLayout);
        // create a panel to add buttons and textfield
        //JPanel p = new JPanel(new SpringLayout());

        // create a new button
        b = new JButton("submit");

        // create a object of the text class
        main te = new main();

        // addActionListener to button
        b.addActionListener(te);

        // create a object of JTextField with 16 columns
        fileName = new JTextField(10);
        // create a label to display text
        fileLabel = new JLabel("Output file name", JLabel.TRAILING);
        fileLabel.setLabelFor(fileName);


        wph = new JTextField(10);
        // create a label to display text
        wphLabel = new JLabel("WPH", JLabel.TRAILING);
        wphLabel.setLabelFor(wph);

        cpw = new JTextField(10);
        cpwLabel = new JLabel("CPW", JLabel.TRAILING);
        cpwLabel.setLabelFor(cpw);
        noe = new JTextField(10);
        noeLabel = new JLabel("NOE", JLabel.TRAILING);
        noeLabel.setLabelFor(noe);
        mphLabel = new JLabel("MPH = ");



        smallV = new JTextField(10);
        smallVlabel = new JLabel("Small Container Vol", JLabel.TRAILING);
        smallVlabel.setLabelFor(smallV);
        BathV = new JTextField(10);
        BathVlabel = new JLabel("Bath Vol", JLabel.TRAILING);
        BathVlabel.setLabelFor(BathV);
        BathVmax = new JTextField(10);
        BathVmaxlabel = new JLabel("Bath Max Vol", JLabel.TRAILING);
        BathVmaxlabel.setLabelFor(BathVmax);
        BathVmin = new JTextField(10);
        BathVminlabel = new JLabel("Bath Min Vol", JLabel.TRAILING);
        BathVminlabel.setLabelFor(BathVmin);
        CE_anode = new JTextField(10);
        CE_anode_label = new JLabel("CE Anode", JLabel.TRAILING);
        CE_anode_label.setLabelFor(CE_anode);
        CE_cathode = new JTextField(10);
        CE_cathode_label = new JLabel("CE Cathode", JLabel.TRAILING);
        CE_cathode_label.setLabelFor(CE_cathode);
        // add buttons and textfield to panel



        startingA = new JTextField(10);
        startingB = new JTextField(10);
        Aincoming = new JTextField(10);
        Bincoming = new JTextField(10);
        startingAlabel = new JLabel("Starting A (G/L)", JLabel.TRAILING);
        startingAlabel.setLabelFor(startingA);
        startingBlabel = new JLabel("Starting B (G/L)", JLabel.TRAILING);
        startingBlabel.setLabelFor(startingB);
        AincomingLabel = new JLabel("A incoming (G/L)", JLabel.TRAILING);
        AincomingLabel.setLabelFor(Aincoming);
        BincomingLabel = new JLabel("B incoming (G/L)", JLabel.TRAILING);
        BincomingLabel.setLabelFor(Bincoming);
        molarMassLabel = new JLabel("Molar Mass A (g/mol)", JLabel.TRAILING);
        molarMass= new JTextField(10);
        molarMassLabel.setLabelFor(molarMass);
        molarMassLabel2 = new JLabel("Molar Mass B (g/mol)", JLabel.TRAILING);
        molarMass2= new JTextField(10);
        molarMassLabel2.setLabelFor(molarMass2);
        startingA2label = new JLabel("Starting A2 (G/L)", JLabel.TRAILING);
        startingA2= new JTextField(10);
        startingA2label.setLabelFor(startingA2);
        startingB2label = new JLabel("Starting B2 (G/L)", JLabel.TRAILING);
        startingB2= new JTextField(10);
        startingB2label.setLabelFor(startingB2);
        Aincoming2 = new JTextField(10);
        Aincoming2label= new JLabel("A incoming 2 (G/L)", JLabel.TRAILING);
        Bincoming2 = new JTextField(10);
        Bincoming2label = new JLabel("B incoming 2 (G/L)", JLabel.TRAILING);

        p.add(fileName);
        p.add(fileLabel);
        p.add(wph);
        p.add(wphLabel);
        p.add(cpw);
        p.add(cpwLabel);
        p.add(noe);
        p.add(noeLabel);
        p.add(smallV);
        p.add(smallVlabel);
        p.add(BathV);
        p.add(BathVlabel);
        p.add(BathVmax);
        p.add(BathVmaxlabel);
        p.add(BathVmin);
        p.add(BathVminlabel);
        p.add(CE_anode);
        p.add(CE_anode_label);
        p.add(CE_cathode);
        p.add(CE_cathode_label);
        p.add(Aincoming);
        p.add(AincomingLabel);
        p.add(Bincoming);
        p.add(BincomingLabel);
        p.add(Aincoming2);
        p.add(Aincoming2label);
        p.add(Bincoming2);
        p.add(Bincoming2label);
        p.add(startingA);
        p.add(startingAlabel);
        p.add(startingB);
        p.add(startingBlabel);
        p.add(startingA2);
        p.add(startingA2label);
        p.add(startingB2);
        p.add(startingB2label);
        p.add(molarMass);
        p.add(molarMassLabel);
        p.add(molarMass2);
        p.add(molarMassLabel2);
        p.add(b);
        p.add(mphLabel);
        fileNameLabel = new JLabel("Leave Field Blank For Default Value", JLabel.TRAILING);
        //fileNameLabelPair = new JLabel("File Path = ");
        //fileNameLabelPair.setLabelFor(fileNameLabel);
        p.add(fileNameLabel);
        //info = new JLabel("(Leave Field Blank For Default Values)", JLabel.TRAILING);
        //p.add(info);
        //p.add(fileNameLabelPair);
        //p.add(new JLabel("<HTML><BODY><a href=\"\">"+fileName.getText()+".csv</a></BODY></HTML>"));
        // add panel to frame
        //f.add(p);

        // set the size of frame
        f.setSize(400, 800);

        //p.setLocation(300,300);
//        SpringUtilities.makeGrid(p,
//                5, 5, //rows, cols
//                5, 5, //initialX, initialY
//                5, 5);//xPad, yPad


        springLayout.putConstraint(SpringLayout.WEST, fileLabel,
                5,
                SpringLayout.WEST, p);
        springLayout.putConstraint(SpringLayout.NORTH, fileLabel,
                5,
                SpringLayout.NORTH, p);

        //Adjust constraints for the text field so it's at
        //(<label's right edge> + 5, 5).
        springLayout.putConstraint(SpringLayout.WEST, fileName,
                5,
                SpringLayout.EAST, fileLabel);
        springLayout.putConstraint(SpringLayout.NORTH, fileName,
                5,
                SpringLayout.NORTH, p);



        //Adjust constraints for the label so it's at (5,5).
        springLayout.putConstraint(SpringLayout.WEST, wphLabel,
                5,
                SpringLayout.WEST, p);
        springLayout.putConstraint(SpringLayout.NORTH, wphLabel,
                25,
                SpringLayout.NORTH, p);

        //Adjust constraints for the text field so it's at
        //(<label's right edge> + 5, 5).
        springLayout.putConstraint(SpringLayout.WEST, wph,
                5,
                SpringLayout.EAST, wphLabel);
        springLayout.putConstraint(SpringLayout.NORTH, wph,
                25,
                SpringLayout.NORTH, p);




        springLayout.putConstraint(SpringLayout.WEST, cpwLabel,
                5,
                SpringLayout.WEST, p);
        springLayout.putConstraint(SpringLayout.NORTH, cpwLabel,
                45,
                SpringLayout.NORTH, p);

        //Adjust constraints for the text field so it's at
        //(<label's right edge> + 5, 5).
        springLayout.putConstraint(SpringLayout.WEST, cpw,
                5,
                SpringLayout.EAST, cpwLabel);
        springLayout.putConstraint(SpringLayout.NORTH, cpw,
                45,
                SpringLayout.NORTH, p);



        //Adjust constraints for the label so it's at (5,5).
        springLayout.putConstraint(SpringLayout.WEST, noeLabel,
                5,
                SpringLayout.WEST, p);
        springLayout.putConstraint(SpringLayout.NORTH, noeLabel,
                65,
                SpringLayout.NORTH, p);

        //Adjust constraints for the text field so it's at
        //(<label's right edge> + 5, 5).
        springLayout.putConstraint(SpringLayout.WEST, noe,
                5,
                SpringLayout.EAST, noeLabel);
        springLayout.putConstraint(SpringLayout.NORTH, noe,
                65,
                SpringLayout.NORTH, p);


        //Adjust constraints for the label so it's at (5,5).
        springLayout.putConstraint(SpringLayout.WEST, smallVlabel,
                5,
                SpringLayout.WEST, p);
        springLayout.putConstraint(SpringLayout.NORTH, smallVlabel,
                85,
                SpringLayout.NORTH, p);

        //Adjust constraints for the text field so it's at
        //(<label's right edge> + 5, 5).
        springLayout.putConstraint(SpringLayout.WEST, smallV,
                5,
                SpringLayout.EAST, smallVlabel);
        springLayout.putConstraint(SpringLayout.NORTH, smallV,
                85,
                SpringLayout.NORTH, p);

        //Adjust constraints for the label so it's at (5,5).
        springLayout.putConstraint(SpringLayout.WEST, BathVlabel,
                5,
                SpringLayout.WEST, p);
        springLayout.putConstraint(SpringLayout.NORTH, BathVlabel,
                105,
                SpringLayout.NORTH, p);

        //Adjust constraints for the text field so it's at
        //(<label's right edge> + 5, 5).
        springLayout.putConstraint(SpringLayout.WEST, BathV,
                5,
                SpringLayout.EAST, BathVlabel);
        springLayout.putConstraint(SpringLayout.NORTH, BathV,
                105,
                SpringLayout.NORTH, p);
        //Adjust constraints for the label so it's at (5,5).
        springLayout.putConstraint(SpringLayout.WEST, BathVmaxlabel,
                5,
                SpringLayout.WEST, p);
        springLayout.putConstraint(SpringLayout.NORTH, BathVmaxlabel,
                125,
                SpringLayout.NORTH, p);

        //Adjust constraints for the text field so it's at
        //(<label's right edge> + 5, 5).
        springLayout.putConstraint(SpringLayout.WEST, BathVmax,
                5,
                SpringLayout.EAST, BathVmaxlabel);
        springLayout.putConstraint(SpringLayout.NORTH, BathVmax,
                125,
                SpringLayout.NORTH, p);



        //Adjust constraints for the label so it's at (5,5).
        springLayout.putConstraint(SpringLayout.WEST, BathVminlabel,
                5,
                SpringLayout.WEST, p);
        springLayout.putConstraint(SpringLayout.NORTH, BathVminlabel,
                145,
                SpringLayout.NORTH, p);

        //Adjust constraints for the text field so it's at
        //(<label's right edge> + 5, 5).
        springLayout.putConstraint(SpringLayout.WEST, BathVmin,
                5,
                SpringLayout.EAST, BathVminlabel);
        springLayout.putConstraint(SpringLayout.NORTH, BathVmin,
                145,
                SpringLayout.NORTH, p);



        //Adjust constraints for the label so it's at (5,5).
        springLayout.putConstraint(SpringLayout.WEST, CE_anode_label,
                5,
                SpringLayout.WEST, p);
        springLayout.putConstraint(SpringLayout.NORTH, CE_anode_label,
                165,
                SpringLayout.NORTH, p);

        //Adjust constraints for the text field so it's at
        //(<label's right edge> + 5, 5).
        springLayout.putConstraint(SpringLayout.WEST, CE_anode,
                5,
                SpringLayout.EAST, CE_anode_label);
        springLayout.putConstraint(SpringLayout.NORTH, CE_anode,
                165,
                SpringLayout.NORTH, p);

        //Adjust constraints for the label so it's at (5,5).
        springLayout.putConstraint(SpringLayout.WEST, CE_cathode_label,
                5,
                SpringLayout.WEST, p);
        springLayout.putConstraint(SpringLayout.NORTH, CE_cathode_label,
                185,
                SpringLayout.NORTH, p);

        //Adjust constraints for the text field so it's at
        //(<label's right edge> + 5, 5).
        springLayout.putConstraint(SpringLayout.WEST, CE_cathode,
                5,
                SpringLayout.EAST, CE_cathode_label);
        springLayout.putConstraint(SpringLayout.NORTH, CE_cathode,
                185,
                SpringLayout.NORTH, p);



        //Adjust constraints for the label so it's at (5,5).
        springLayout.putConstraint(SpringLayout.WEST, startingAlabel,
                5,
                SpringLayout.WEST, p);
        springLayout.putConstraint(SpringLayout.NORTH, startingAlabel,
                215,
                SpringLayout.NORTH, p);

        //Adjust constraints for the text field so it's at
        //(<label's right edge> + 5, 5).
        springLayout.putConstraint(SpringLayout.WEST, startingA,
                5,
                SpringLayout.EAST, startingAlabel);
        springLayout.putConstraint(SpringLayout.NORTH, startingA,
                215,
                SpringLayout.NORTH, p);


        //Adjust constraints for the label so it's at (5,5).
        springLayout.putConstraint(SpringLayout.WEST, startingBlabel,
                5,
                SpringLayout.WEST, p);
        springLayout.putConstraint(SpringLayout.NORTH, startingBlabel,
                235,
                SpringLayout.NORTH, p);

        //Adjust constraints for the text field so it's at
        //(<label's right edge> + 5, 5).
        springLayout.putConstraint(SpringLayout.WEST, startingB,
                5,
                SpringLayout.EAST, startingBlabel);
        springLayout.putConstraint(SpringLayout.NORTH, startingB,
                235,
                SpringLayout.NORTH, p);

        //Adjust constraints for the label so it's at (5,5).
        springLayout.putConstraint(SpringLayout.WEST, b,
                45,
                SpringLayout.WEST, p);
        springLayout.putConstraint(SpringLayout.NORTH, b,
                265,
                SpringLayout.NORTH, p);

        //Adjust constraints for the label so it's at (5,5).
        springLayout.putConstraint(SpringLayout.WEST, mphLabel,
                55,
                SpringLayout.WEST, p);
        springLayout.putConstraint(SpringLayout.NORTH, mphLabel,
                285,
                SpringLayout.NORTH, p);

        //Adjust constraints for the label so it's at (5,5).
        springLayout.putConstraint(SpringLayout.WEST, fileNameLabel,
                5,
                SpringLayout.WEST, p);
        springLayout.putConstraint(SpringLayout.NORTH, fileNameLabel,
                25,
                SpringLayout.NORTH, mphLabel);


//        springLayout.putConstraint(SpringLayout.WEST, info,
//                5,
//                SpringLayout.WEST, p);
//        springLayout.putConstraint(SpringLayout.NORTH, info,
//                50,
//                SpringLayout.NORTH, mphLabel);
//        springLayout.putConstraint(SpringLayout.WEST, fileNameLabel,
//                5,
//                SpringLayout.EAST, fileNameLabelPair);
//        springLayout.putConstraint(SpringLayout.NORTH, fileNameLabel,
//                20,
//                SpringLayout.NORTH, mphLabel);



        try {
            SpringUtilities.makeCompactGrid(p, 21, 2, 5, 5, 5, 20);
        }catch (Exception exp){
            System.out.println(exp);

        }


        f.pack();
        f.setVisible(true);
        //System.out.println(Spring.constant(0));


        //////////////////


    }

private static void mathPortion(){
    toFile file = new toFile();
    file.addData(new String[]{"A,", "B,", "A Large,", "B Large,", "VolumeSmall,", "Volume large"});
    //Scanner scan = new Scanner(System.in);
    //String namey = scan.nextLine();

    if(!fileName.getText().equals("")) {
        file.setFileName(fileName.getText());
    }

    List<String> data = new ArrayList<String>();
//equation for a: a = old a - (old a * 0.05L/hr transfer) + (0.5L/hr * 0.0788 mol/L) + (0.98 * 0.105 mol/hr) - (0.105 mol/hr * (a/(a+3b)))



    double vone = 6;
    //System.out.println(smallV.getText());
    clean(smallV);
    if(!smallV.getText().equals("")){
        vone = Double.parseDouble(smallV.getText());

    }


    double vtwo = 150;
    clean(BathV);
    if(!BathV.getText().equals("")){
        vtwo = Double.parseDouble(BathV.getText());

    }

    ////////////
    clean(molarMass);
    clean(molarMass2);
    clean(Aincoming);
    clean(Aincoming2);
    clean(Bincoming);
    clean(Bincoming2);
    clean(startingA);
    clean(startingA2);
    clean(startingB);
    clean(startingB2);
    double amount;
    double amount2;
    double amount3;
    double amount4;
    double amount5;
    double amount6;
    /////////


    double a = 0.063*vone;
    double b = 0.087*vone;

    if(molarMass.getText().length()>0&&molarMass2.getText().length()>0){
        amount = Double.parseDouble(startingA.getText())/Double.parseDouble(molarMass.getText());
        amount2 = Double.parseDouble(startingB.getText())/Double.parseDouble(molarMass2.getText());
    a= amount*vone;
    b= amount2*vone;

    }



    double otherA = 0.0788*vtwo;
    double otherB = 0.102*vtwo;

    if(molarMass.getText().length()>0&&molarMass2.getText().length()>0){

        amount3 = Double.parseDouble(startingA2.getText())/Double.parseDouble(molarMass.getText());
        amount4 = Double.parseDouble(startingB2.getText())/Double.parseDouble(molarMass2.getText());
    otherA= amount3*vtwo;
    otherB= amount4*vtwo;
    }



    double ainsert1 = 0.0788;
    double binsert1 = 0.102;

    if(molarMass.getText().length()>0&&molarMass2.getText().length()>0){
        amount5 = Double.parseDouble(Aincoming.getText())/Double.parseDouble(molarMass.getText());
        amount6 = Double.parseDouble(Bincoming.getText())/Double.parseDouble(molarMass2.getText());
    ainsert1= amount5;
    binsert1= amount6;


    }


    double ainsert2 = 0.0788;
    double binsert2 = 0.102;



    double insertVolume1 = 0.5;
    double insertVolume2 = 1;
    double selectivity = 3;
    double efficiency = 0.98;
    clean(CE_anode);
    if(!CE_anode.getText().equals("")){
        efficiency = Double.parseDouble(CE_anode.getText());
        if(efficiency>5){
            efficiency/=100;
            CE_anode.setText(""+efficiency);
        }

    }


    double efficiency2 = 0.99;
    clean(CE_cathode);
    if(!CE_cathode.getText().equals("")){
        efficiency2 = Double.parseDouble(CE_cathode.getText());
        if(efficiency2>5){
            efficiency2/=100;
            CE_cathode.setText(""+efficiency2);
        }
    }


    double transfer = 0.05;
    double passing = mph; // 0.105
    double chambers = 3;
    double LargeChamberMaxVolume = 170;
    clean(BathVmax);
    if(!BathVmax.getText().equals("")){
        LargeChamberMaxVolume = Double.parseDouble(BathVmax.getText());

    }


    double LargeChamberDrainTo = 150;
    clean(BathVmin);
    if(!BathVmin.getText().equals("")){
        LargeChamberDrainTo = Double.parseDouble(BathVmin.getText());

    }
    for(int i = 0; i < 100; i++){
        double tempa;
        double tempb;
        double tempothera;
        double tempotherb;
        // n = (n-1) + (n-1 * 0.05L/hr transfer) + (0.5L/hr * 0.0788 mol/L) + (0.98 * 0.105 mol/hr) - (0.105 mol/hr * (a/(a+3b))
        tempa = a - ((a/vone) * transfer) + (insertVolume1 * ainsert1) - (insertVolume1*(a/vone)) + (transfer*(otherA/vtwo)) + (efficiency * passing) - (passing * (a/(a+selectivity*b)));//  + (0.105 * otherA/(otherA+3*otherB));
        //starting - starting/volume * transfer amount
        tempb = b - ((b/vone) * transfer) + (insertVolume1 * binsert1) - (insertVolume1*(b/vone)) + (transfer*(otherB/vtwo))+ ((1-efficiency) * passing) - (passing * (selectivity*b/(a+selectivity*b)));// + (0.105 * 3 * otherB/(otherA+3*otherB));
        tempothera = otherA + (insertVolume2 * ainsert2) - (chambers * efficiency2 * passing)  + (chambers * (passing * a/(a+selectivity*b))) + (chambers * (transfer*(a/vone))) -(chambers * (transfer*(otherA/vtwo)))+(chambers*insertVolume1*(a/vone));//- (0.105 * (otherA/(otherA+3*otherB)));
        tempotherb = otherB + (insertVolume2 * binsert2) - (chambers * (1-efficiency2) * passing) + (chambers * (passing * selectivity * b/(a+selectivity*b)))+ (chambers * (transfer*(b/vone))) -(chambers * (transfer*(otherB/vtwo)))+(chambers*insertVolume1*(b/vone));//- (0.105 * (3*otherB/(otherA+3*otherB)));
        a = tempa;
        b = tempb;
        otherA = tempothera;
        otherB = tempotherb;
        vtwo += insertVolume2+(chambers*insertVolume1);

        if(vtwo>=LargeChamberMaxVolume){
            //System.out.println(otherA/vtwo);
            //double extra = vtwo-LargeChamberMaxVolume;
            otherA= (otherA/vtwo) *LargeChamberDrainTo;
            otherB= (otherB/vtwo) *LargeChamberDrainTo;
            vtwo = LargeChamberDrainTo;
            //System.out.println(otherA/vtwo);
        }



        System.out.println("a: " + (a/vone) + " b: " + (b/vone) + " otherA: " + otherA/vtwo + " otherB: " + otherB/vtwo +" vone" + vone + " vtwo" + vtwo);

        file.addData(new String[]{"" + (a/vone) + "," + (b/vone) + "," + otherA/vtwo + "," + otherB/vtwo +"," + vone + "," + vtwo});
    }

    try{
        //file.write();
        System.out.println("done");
        file.givenDataArray_whenConvertToCSV_thenOutputCreated();


    }catch (Exception e){
        e.printStackTrace();
    }

}



    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if (s.equals("submit")) {
            // set the text of the label to the text of the field
            //l.setText(t.getText());
            //info.setText("");
            try {
                mph = Double.parseDouble(wph.getText()) * Double.parseDouble(cpw.getText()) / Double.parseDouble(noe.getText()) / 96485;

            }catch (Exception ex){
                mph = 0.105;

            }
            mphLabel.setText("MPH = " + mph);
            if (fileName.getText().equals("")) {
                fileName.setText("Default");
            }
            if (wph.getText().equals("")) {
                wph.setText("Default");
            }
            if (cpw.getText().equals("")) {
                cpw.setText("Default");
            }
            if (noe.getText().equals("")) {
                noe.setText("Default");
            }
            if (smallV.getText().equals("")) {
                smallV.setText("6");
            }
            if (BathV.getText().equals("")) {
                BathV.setText("150");
            }
            if (BathVmin.getText().equals("")) {
                BathVmin.setText("150");
            }
            if (BathVmax.getText().equals("")) {
                BathVmax.setText("170");
            }
            if (CE_anode.getText().equals("")) {
                CE_anode.setText("0.98");
            }
            if (CE_cathode.getText().equals("")) {
                CE_cathode.setText("0.99");
            }
            File csvOutputFile = new File(fileName.getText()+".csv");
            fileNameLabel.setText("File Path: "+csvOutputFile.getAbsolutePath());



            // set the text of field to blank
            //t.setText("  ");
            mathPortion();
        }
    }


    private static void clean(JTextField textF){
        boolean percentage;

        String text = textF.getText();
        if(text.indexOf("%")>=0){
            percentage = true;
        }else{percentage=false;}
        text = text.replaceAll("[^\\d.-]", "");
        if(percentage){
            double d = Double.parseDouble(text);
            d/=100;
            textF.setText(""+d);
        }else {
            textF.setText(text);
        }
    }




}