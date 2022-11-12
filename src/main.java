import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import java.math.BigDecimal;
public class main{
    //chemical reactor
    //monitors the contents in moles of a and b
    //container one has 6 liters capacity
    //container two has infinite capacity

    public static void main(String[] args){
    toFile file = new toFile();
    file.addData(new String[]{"A", "B", "A Large", "B Large", "VolumeSmall", "Volume large"});
    Scanner scan = new Scanner(System.in);
    String namey = scan.nextLine();
    file.setFileName(namey);
    List<String> data = new ArrayList<String>();
//equation for a: a = old a - (old a * 0.05L/hr transfer) + (0.5L/hr * 0.0788 mol/L) + (0.98 * 0.105 mol/hr) - (0.105 mol/hr * (a/(a+3b)))

        double vone = 6;
        double vtwo = 150;
        double a = 0.063*vone;
        double b = 0.087*vone;
        double otherA = 0.0788*vtwo;
        double otherB = 0.102*vtwo;
        double ainsert1 = 0.0788;
        double binsert1 = 0.102;
        double ainsert2 = 0.0788;
        double binsert2 = 0.102;
        double insertVolume1 = 0.5;
        double insertVolume2 = 1;
        double selectivity = 3;
        double efficiency = 0.98;
        double efficiency2 = 0.99;
        double transfer = 0.05;
        double passing = 0.105;
        double chambers = 3;
        double LargeChamberMaxVolume = 170;
        double LargeChamberDrainTo = 150;

        for(int i = 0; i < 100; i++){
            double tempa = 0;
            double tempb = 0;
            double tempothera = 0;
            double tempotherb = 0;
            // n = (n-1) + (n-1 * 0.05L/hr transfer) + (0.5L/hr * 0.0788 mol/L) + (0.98 * 0.105 mol/hr) - (0.105 mol/hr * (a/(a+3b))
            tempa = a - ((a/vone) * transfer) + (insertVolume1 * ainsert1) - (insertVolume1*(a/vone)) + (transfer*(otherA/vtwo)) + (efficiency * passing) - (passing * (a/(a+selectivity*b)));//  + (0.105 * otherA/(otherA+3*otherB));
            //starting - starting/volume * transfer amount
            tempb = b - ((b/vone) * transfer) + (insertVolume1 * binsert1) - (insertVolume1*(b/vone)) + (transfer*(otherB/vtwo))+ ((1-efficiency) * passing) - (passing * (selectivity*b/(a+selectivity*b)));// + (0.105 * 3 * otherB/(otherA+3*otherB));
            tempothera = otherA + (insertVolume2 * ainsert2) - (efficiency2 * passing)  + chambers * (passing * a/(a+selectivity*b)) + chambers * (transfer*(a/vone))-chambers * (transfer*(otherA/vtwo))+(insertVolume1*(a/vone));//- (0.105 * (otherA/(otherA+3*otherB)));
            tempotherb = otherB + (insertVolume2 * binsert2) - ((1-efficiency2) * passing) + chambers * (passing * selectivity * b/(a+selectivity*b))+ chambers * (transfer*(b/vone))-chambers * (transfer*(otherB/vtwo))+(insertVolume1*(b/vone));//- (0.105 * (3*otherB/(otherA+3*otherB)));
            a = tempa;
            b = tempb;
            otherA = tempothera;
            otherB = tempotherb;
            vtwo += insertVolume2+insertVolume1;

            if(vtwo>=LargeChamberMaxVolume){

                //double extra = vtwo-LargeChamberMaxVolume;
                otherA= (otherA/vtwo) *LargeChamberDrainTo;
                otherB= (otherB/vtwo) *LargeChamberDrainTo;
                vtwo = LargeChamberDrainTo;

            }



           System.out.println("a: " + (a/vone) + " b: " + (b/vone) + " otherA: " + otherA/vtwo + " otherB: " + otherB/vtwo +" vone" + vone + " vtwo" + vtwo);

            file.addData(new String[]{"" + (a/vone) + " " + (b/vone) + " " + otherA/vtwo + " " + otherB/vtwo +" " + vone + " " + vtwo});
        }

        try{
            //file.write();
            System.out.println("done");
        file.givenDataArray_whenConvertToCSV_thenOutputCreated();

    }catch (Exception e){
        e.printStackTrace();
    }

    }




}