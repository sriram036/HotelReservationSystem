package com.bridgelabz;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Hotel {

    String hotelName;
    int hotelRating;
    int weekdayRateForRegularCustomer;
    int weekendRateForRegularCustomer;
    int weekdayRateForRewardCustomer;
    int weekendRateForRewardCustomer;

    public Hotel(String hotelName, int hotelRating, int weekdayRateForRegularCustomer, int weekendRateForRegularCustomer, int weekdayRateForRewardCustomer, int weekendRateForRewardCustomer) {
        this.hotelName = hotelName;
        this.hotelRating = hotelRating;
        this.weekdayRateForRegularCustomer = weekdayRateForRegularCustomer;
        this.weekendRateForRegularCustomer = weekendRateForRegularCustomer;
        this.weekdayRateForRewardCustomer = weekdayRateForRewardCustomer;
        this.weekendRateForRewardCustomer = weekendRateForRewardCustomer;
    }

    public static int getWeekendDaysInRange(LocalDate startDate, LocalDate endDate) {
        return (int) startDate.datesUntil(endDate.plusDays(1)).filter(date->date.getDayOfWeek().equals(DayOfWeek.SATURDAY) ||date.getDayOfWeek().equals(DayOfWeek.SUNDAY)).count();
    }
    public static int getWeekDaysInRange(LocalDate startDate, LocalDate endDate) {
        return (int) startDate.datesUntil(endDate.plusDays(1)).filter(date->date.getDayOfWeek().equals(DayOfWeek.MONDAY) ||date.getDayOfWeek().equals(DayOfWeek.TUESDAY) ||date.getDayOfWeek().equals(DayOfWeek.WEDNESDAY) ||date.getDayOfWeek().equals(DayOfWeek.THURSDAY) ||date.getDayOfWeek().equals(DayOfWeek.FRIDAY)).count();
    }

    public int findPrice(Boolean customerType, int numberOfWeekDays, int numberOfWeekendDays) {
        if (customerType == false) {
            int weekDayPriceForRegularCustomer = weekdayRateForRegularCustomer * numberOfWeekDays;
            int weekEndDayPriceForRegularCustomer = weekendRateForRegularCustomer * numberOfWeekendDays;
            int totalPrice = weekDayPriceForRegularCustomer + weekEndDayPriceForRegularCustomer;
            return totalPrice;
        }
        else {
            int weekDayPriceForRegularCustomer = weekdayRateForRewardCustomer * numberOfWeekDays;
            int weekEndDayPriceForRegularCustomer = weekendRateForRewardCustomer * numberOfWeekendDays;
            int totalPrice = weekDayPriceForRegularCustomer + weekEndDayPriceForRegularCustomer;
            return totalPrice;
        }
    }
}
