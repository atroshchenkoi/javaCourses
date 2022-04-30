package by.epam.lab;

public class BusinessTrip {
    private static final int DAILY_ALLOWANCE_RATE = 1599;
    private String employeeAccount;
    private int transportationExpenses;
    private int numberOfDays;

    public BusinessTrip() {}

    public BusinessTrip(String employeeAccount, int transportationExpenses, int numberOfDays) {
        this.employeeAccount = employeeAccount;
        this.transportationExpenses = transportationExpenses;
        this.numberOfDays = numberOfDays;
    }

    public void setTransportationExpenses(int transportationExpenses) {
        this.transportationExpenses = transportationExpenses;
    }

    private static String conversionToRubles(int kopecks){
        return kopecks / 100 + "," + (kopecks % 100) / 10 + (kopecks % 100) % 10;
    }

    public int getTotalExpenses(){
        return numberOfDays * DAILY_ALLOWANCE_RATE + transportationExpenses;
    }

    public void showFullInfoAboutEmployee(){
        System.out.println("Daily allowance rate = " + conversionToRubles(DAILY_ALLOWANCE_RATE)
                + ". Account = " + employeeAccount
                + ". Transportation expenses = " + conversionToRubles(transportationExpenses)
                + ". Number of days = " + numberOfDays
                + ". Total expenses = " + conversionToRubles(getTotalExpenses()));
    }

    public static BusinessTrip tripWithMaxCost(BusinessTrip[] businessTrips){
        BusinessTrip max = new BusinessTrip();
        for (BusinessTrip businessTrip : businessTrips){
            if (businessTrip != null && businessTrip.getTotalExpenses() > max.getTotalExpenses()) max = businessTrip;
        }
        return max;
    }

    public static void outputTotalDurationOfTwoBusinessTrips(BusinessTrip businessTripFirst, BusinessTrip businessTripSecond){
        System.out.println("Total duration = " + (businessTripFirst.numberOfDays + businessTripSecond.numberOfDays));
    }

    @Override
    public String toString() {
        return employeeAccount + ";" + conversionToRubles(transportationExpenses) + ";" + numberOfDays + ";" + conversionToRubles(getTotalExpenses());
    }
}
