public class Main {

    public static void main(String[] args) {

        Person x = new Person();
        x.licence = RentCar.gotLicence();
        x.yearLicence = RentCar.yearLicence();
        x.income = RentCar.personIncome();

        RentCar.canIHire(x.income, x.yearLicence, x.licence);
    }
}
