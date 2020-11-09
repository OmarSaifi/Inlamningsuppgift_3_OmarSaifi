import javax.swing.*;

public class RentCar {
    /**
     * En klassmetod som kollar om jag får hyra en Ferrari.
     *
     */

    static void canIHire(int income, int yearLicence, boolean licence) {

        String message;

        if (licence && yearLicence >=3 && income >= 35000)
            message = "Du får hyra en Ferrari";
        else
            message = "Du får inte hyra en Ferrari";
        JOptionPane.showMessageDialog(null, message);
    }
    /**
     * En klassmetod som kollar om du har ett körkort.
     *
     * @return en boolean för körkortet.
     */

    static boolean gotLicence() {

        int license = JOptionPane.showConfirmDialog(null, "Har du körkort?");
        if(license == 0) return true;
        else
            return false;
    }
    /**
     * En klassmetod som kollar hur länge du har haft ditt körkort.
     *
     * @return antal år som man har haft körkortet.
     */
    static int yearLicence() {

        int yearLicence = Integer.parseInt(JOptionPane.showInputDialog
                ("Hur många år har du haft ditt körtkort? (Skriv in i siffor ex: 2)" +
                        "\noch" +
                        "\n(Har du inget körkort skriv siffra: 0)"));
        return yearLicence;
    }
    /**
     * En klassmetod som kollar vad din inkomst är.
     *
     * @return inkomsten.
     */
    static int personIncome() {

        int income = Integer.parseInt(JOptionPane.showInputDialog("Vad är din månadsinkomst (före skatt)? Ex: 12000"));
        return income;
    }
}
