package com.bridgelabz;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class HotelReservationSystemMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the startdate  dd-MM-yyyy: ");
        LocalDate startDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println("Enter the enddate dd-MM-yyyy: ");
        LocalDate endDate = LocalDate.parse(sc.nextLine(),DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println("Enter the customerTypes: ");
        Boolean customerType = sc.nextBoolean();
        //LocalDate date.getDayOfWeek();

        Hotel lakeWood = new Hotel("LakeWood", 3, 110, 90, 80,80);

        Hotel bridgeWood = new Hotel("BridgeWood", 4, 160, 60, 110,50);

        Hotel ridgeWood = new Hotel("RidgeWood", 5, 220, 150, 100,40);
        //hotel.findPrice(startDate, endDate, customerType);

        private int getWeekendDaysInRange(LocalDate startDate, LocalDate endDate) {
            return (int) startDate.datesUntil(endDate.plusDays(1)).filter(date->date.getDayOfWeek().equals(DayOfWeek.SATURDAY) ||date.getDayOfWeek().equals(DayOfWeek.SUNDAY)).count();
        }

    }
}
