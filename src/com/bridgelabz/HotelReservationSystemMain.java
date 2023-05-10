package com.bridgelabz;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class HotelReservationSystemMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the startdate  dd-MM-yyyy: ");
        LocalDate startDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println("Enter the enddate dd-MM-yyyy: ");
        LocalDate endDate = LocalDate.parse(sc.nextLine(),DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println("Enter the customerType: ");
        Boolean customerType = sc.nextBoolean();
        System.out.println();
        Hotel lakeWood = new Hotel("LakeWood", 3, 110, 90, 80,80);

        Hotel bridgeWood = new Hotel("BridgeWood", 4, 160, 60, 110,50);

        Hotel ridgeWood = new Hotel("RidgeWood", 5, 220, 150, 100,40);

        int numberOfWeekDays = Hotel.getWeekDaysInRange(startDate, endDate);
        int numberOfWeekEndDays = Hotel.getWeekendDaysInRange(startDate, endDate);

        int lakeWoodPrice = lakeWood.findPrice(customerType, numberOfWeekDays, numberOfWeekEndDays);
        System.out.println("LakeWood Hotel Price is " + lakeWoodPrice);
        int bridgeWoodPrice = bridgeWood.findPrice(customerType, numberOfWeekDays, numberOfWeekEndDays);
        System.out.println("BridgeWood Hotel Price is " + bridgeWoodPrice);
        int ridgeWoodPrice = ridgeWood.findPrice(customerType, numberOfWeekDays, numberOfWeekEndDays);
        System.out.println("RidgeWood Hotel Price is " + ridgeWoodPrice);
        System.out.println();

        List<Integer> hotelPrices = Arrays.asList(lakeWoodPrice,bridgeWoodPrice,ridgeWoodPrice);

        int cheapHotelPrice = hotelPrices.stream().min(Integer::compare).get();

        if (lakeWoodPrice == cheapHotelPrice) {
            System.out.println("LakeWood is the Cheapest Hotel");
        }
        else if (bridgeWoodPrice == cheapHotelPrice) {
            System.out.println("BridgeWood is the Cheapest Hotel");
        }
        else {
            System.out.println("RidgeWood is the Cheapest Hotel");
        }
    }
}
