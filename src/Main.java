public class Main {

    public static void main(String[] args) {

        Person Omar = new Person();
        Omar.licence = RentCar.gotLicence();
        Omar.income = RentCar.personIncome();

        RentCar.canIHire(Omar.income, Omar.licence);

    }
}
