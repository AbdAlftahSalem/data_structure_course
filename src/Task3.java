public class Task3 {
    static void investment() {
        double startPrice = 1000;
        double targetPrice = 2000;
        double interestRateYear = 0.04;
        int yearsNumbers = 0;

        while (startPrice < targetPrice) {
            double interest = startPrice * interestRateYear;
            startPrice += interest;
            yearsNumbers++;
        }

        System.out.println(yearsNumbers + " years to double the money. ");
    }
}
