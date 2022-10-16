package RentCar;

import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter client type:");
            String costumerType=input.next();

            if ("Corporot".equals(costumerType)){
                RentCarServis rentCarServis=new RentCarServis(new Corporot());
                List<Car> carList=  rentCarServis.getCarlist();
                for (Car car : carList) {
                    System.out.println(car.getMarka());

                }
            } else if ("Individual".equals(costumerType)){
                RentCarServis rentCarServis=new RentCarServis(new Individual());
                List<Car> carList=  rentCarServis.getCarlist();
                for (Car car : carList) {
                    System.out.println(car.getMarka());

                }
            }


        }
    }
}
