import javax.swing.*;

public class RentCar {

    public static void canIHire(int income, boolean license) {

        String message;
        if (license && income >= 20000)
            message = "Du får hyra en Ferrari";
        else
            message = "Du får inte hyra en Ferrari";
        System.out.println(message);
    }

    public static int personIncome() {
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

