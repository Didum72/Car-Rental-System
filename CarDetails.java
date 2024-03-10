import java.util.Scanner;

public class CarDetails {
    int cost;
    String model;
    Scanner sc= new Scanner(System.in);
  //  RentDetails rd=new RentDetails();
  CarRental user = new CarRental();
    public void carInfo(String driverId){
        int hourCost=250;
        System.out.println("Available cars are:\n1. Tata Altroz\n2. Maruti Dzire\n3. Skoda Kodiaq\n4.Toyota BZ4X");
        int ch= sc.nextInt();
        switch (ch){
            case 1:
                model="Tata Altroz";
                break;
            case 2:
                model="Maruti Dzire";
                break;
            case 3:
                model="Skoda Kodiaq";
                break;
            case 4:
                model="Toyota BZ4X";
                break;
        }
        System.out.println("Choose rent time:\n1 > hours\n2 > days");
        int hr_d= sc.nextInt();
        switch (hr_d){
            case 1:
                System.out.println("For how many hours you want to rent the car: ");
                int hr=sc.nextInt();
                cost=hr*hourCost;
                break;
            case 2:
                System.out.println("For how many days you want to rent the car: ");
                int dy=sc.nextInt();
                cost=dy*24*hourCost;
                break;
        }
        System.out.println("Write \"CONFIRM\" to move further");
        String con=sc.next();
        if(con.equalsIgnoreCase("confirm")){
            System.out.println("Kindly pay for the renting the car at the reception to get transaction receipt.");
            user.menu();
        }
        else
            System.out.println("Transaction Failed!!!");
    }
    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}

    public int getCost() {return cost;}

    public void setCost(int cost) {this.cost = cost;}
}