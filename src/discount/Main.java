package discount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<CustomerOrder> orders = new ArrayList<>();

        //Discount types S for Sale, D for Discount, L for Liquidation
//        orders.add(new CustomerOrder("William Walters", 75.34, 'D'));
//        orders.add(new CustomerOrder("Susan Smothers", 24.12, 's'));
//        orders.add(new CustomerOrder("Jessica Johnson", 273.93, 'L'));
//        orders.add(new CustomerOrder("Richard Ricardo", 171.42, 'D'));
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your total");
        double total = Double.parseDouble(keyboard.nextLine());
        System.out.println("Enter the number for your discount \n1: Worker \n2: Veteran \n3: Senior Citizen \n4: No Discount");

        int choice = Integer.parseInt(keyboard.nextLine());

            switch (choice) {
            case 1:
                Worker worker = new Worker();
                System.out.println(worker.workerTotal(total));
                break;
            case 2:
                Veteran veteran = new Veteran();
                System.out.println(veteran.veteranTotal(total));
                break;
            case 3:
                Senior senior = new Senior();
                System.out.println(senior.seniorTotal(total));
                break;

            default:
                Regular regular = new Regular();
                System.out.println(regular.regularAmount(total));
        }


//        double total = 0;
//        for (CustomerOrder order : orders) {
//            System.out.printf("%-20s $%7.2f\n", order.getCustomerName(), order.getBillAmount());
//            total += order.getBillAmount();
//        }

//        System.out.printf("%-20s $%7.2f", "Total: ", total);
    }
}
