import java.util.ArrayList;
import java.util.Scanner;

public class CarRental {
    Scanner sc = new Scanner(System.in);
    String userName, driverId;
    int userAge;
    long phoneNo;
    ArrayList<CarRental> cr = new ArrayList<CarRental>();
    public void addUser(ArrayList<CarRental> cr) {
        CarRental cus = new CarRental();
        System.out.println("Enter your full name: ");
        userName = sc.nextLine();
        System.out.println("Enter your age: ");
        userAge = sc.nextInt();
        if (userAge < 18) {
            System.out.println("Bad luck! You are not eligible for driving and renting a car.");
            cus.menu();
        }
        System.out.println("Enter your phone number: ");
        phoneNo = sc.nextLong();
        System.out.println("Enter your driver's ID: ");
        driverId=sc.next();
        System.out.println("your account has been created. Let's move forward!");
        menu();
    }

    public void menu() {
        int ch;
        CarRental user = new CarRental();
        CarDetails cd = new CarDetails();
        RentDetails rd=new RentDetails();
        System.out.println("No current account!!\nEnter the number of your choice: ");
        System.out.println("1 - Create Account\n2 - Rent Transaction Details\n3 - Rent a car");
        ch = sc.nextInt();
        switch (ch) {
            case 1:
                user.addUser(cr);
                break;
            case 2:
                rd.rentDetails(getDriverId());
                break;
            case 3:
                cd.carInfo(getDriverId());
                break;
        }
    }

    public int getUserAge() {return userAge;}
    public void setUserAge(int userAge) {this.userAge = userAge;}
    public String getUserName() {return userName;}
    public void setUserName(String userName) {this.userName = userName;}
    public String getDriverId() {return driverId;}
    public void setDriverId(String driverId) {this.driverId = driverId;}
    public long getPhoneNo() {return phoneNo;}
    public void setPhoneNo(long phoneNo) {this.phoneNo = phoneNo;}
}