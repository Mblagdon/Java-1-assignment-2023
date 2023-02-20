package Assignment1Car;

import java.util.Scanner;
public class FunWithCar {

    public static void main(String[] args){
        System.out.println("Fun With Cars");

        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter Make: ");
        String make = input.nextLine();

        System.out.println("\nEnter Model ");
        String model = input.nextLine();

        System.out.println("\nEnter Year: ");
        String year = input.nextLine();

        System.out.println("\nEnter Color: ");
        String color = input.nextLine();

        Car userCar = new Car(make, model, year, color);

        userCar.setMake(make);
        userCar.setModel(model);
        userCar.setYear(year);
        userCar.setColor(color);

        System.out.printf("Users car is: %s %s %s %s", userCar.getMake(), userCar.getModel(), userCar.getYear(), userCar.getColor());
    }



}
