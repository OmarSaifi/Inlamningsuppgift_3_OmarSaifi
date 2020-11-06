import javax.swing.*;

public class RentCar {

    /**
     * En klassmetod som kollar om jag får hyra en Ferrari.
     *
     */

    public static void canIHire(int income, boolean licence) {

        String message;
        if (licence && income >= 20000)
            message = "Du får hyra en Ferrari";
        else
            message = "Du får inte hyra en Ferrari";
        System.out.println(message);
    }
    /**
     * En klassmetod som kollar om du har ett körkort.
     *
     * @returnerar en boolean för körkortet.
     */

    public static boolean gotLicence() {

        int license = JOptionPane.showConfirmDialog(null, "Har du körkort?");
        if(license == 0) return true;
        else
            return false;
    }
    /**
     *En klassmetod som kollar vad din inkomst är.
     *
     *@returnerar inkomsten.
     */
    public static int personIncome() {

        int income = Integer.parseInt(JOptionPane.showInputDialog("Vad är din inkomst?"));
        return income;
    }
}

