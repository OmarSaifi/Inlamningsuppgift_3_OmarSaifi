import javax.swing.*;

public class RentCar {

    public static int personIncome(){
        int income = Integer.parseInt(JOptionPane.showInputDialog("Vad är din inkomst?"));
        return income;
    }

    public static boolean gotLinces() {
        int license = JOptionPane.showConfirmDialog(null, "Har du körkort?");
        if(license == 0) return true;
        else
            return false;


    }
}
