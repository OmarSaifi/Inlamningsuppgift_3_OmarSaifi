public class Main {

    public static void main(String[] args) {

        Person Omar = new Person();
        Omar.income = RentCar.personIncome();
        Omar.license = RentCar.gotLinces();

        if (Omar.license && Omar.income >= 20000) System.out.println("Du får hyra en Ferrari");
        else
            System.out.println("Du får inte hyra en Ferrari");


    }
}
