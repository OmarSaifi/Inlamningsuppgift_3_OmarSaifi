public class Main {

    public static void main(String[] args) {

        Person Omar = new Person();
        Omar.licence = RentCar.gotLicence();
        Omar.yearLicence = RentCar.yearLicence();
        Omar.income = RentCar.personIncome();

        RentCar.canIHire(Omar.income, Omar.yearLicence, Omar.licence);

    }
}
