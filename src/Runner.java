import by.epam.lab.BusinessTrip;

public class Runner {
    public static void main(String[] args) {
        int numberOfBusinessTrips = 5;
        BusinessTrip[] businessTrips = new BusinessTrip[numberOfBusinessTrips];
        businessTrips[0] = new BusinessTrip("Atroshchenko Ilya", 2099, 4);
        businessTrips[2] = new BusinessTrip("Zanko Stas", 2251, 5);
        businessTrips[3] = new BusinessTrip("Qwerty Asdfgh", 2149, 4);
        businessTrips[4] = new BusinessTrip();

        for (BusinessTrip businessTrip : businessTrips) {
            if (businessTrip != null){
                businessTrip.showFullInfoAboutEmployee();
            }
        }

        System.out.println("Max cost trip: " + BusinessTrip.tripWithMaxCost(businessTrips));
        businessTrips[businessTrips.length - 1].setTransportationExpenses(1921);
        BusinessTrip.outputTotalDurationOfTwoBusinessTrips(businessTrips[0], businessTrips[2]);

        for (BusinessTrip businessTrip : businessTrips) {
            if (businessTrip != null){
                System.out.println(businessTrip);
            }
        }
    }
}
