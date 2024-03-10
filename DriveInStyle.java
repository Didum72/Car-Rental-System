import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Callable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DriveInStyle {
   Scanner sc = new Scanner(System.in);

   DriveInStyle cus= new DriveInStyle();
   static CarRental user=new CarRental();
   RentDetails rd=new RentDetails();
   public static void main(String[] args) {
      System.out.println("Welcome to the DRIVE IN STYLE!!");
      ArrayList<CarRental> cr = new ArrayList<CarRental>();
//      user.addUser(cr);
      user.menu();
   }

}