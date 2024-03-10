import java.util.Objects;

public class RentDetails {
    String drivID;
    CarRental user = new CarRental();
    CarDetails cd = new CarDetails();
    public void rentDetails(String divId) {
        if (!Objects.equals(drivID, divId)){
            System.out.println("You don't have any account. Go back to menu to create account.");
            user.menu();
        }
        System.out.println("Your rent transaction details are:\n");
        System.out.println("Name: "+ user.getUserName()+"\n");
        System.out.println("Age: "+ user.getUserAge()+"\n");
        System.out.println("Diver's ID: " +user.getDriverId()+"\n");
        System.out.println("Phone no.: " +user.getPhoneNo()+ "\n");
        System.out.println("Rented car: " +cd.getModel()+ "\n" );
        System.out.println("Renting Cost: " +cd.getCost()+"\n");
    }
}
