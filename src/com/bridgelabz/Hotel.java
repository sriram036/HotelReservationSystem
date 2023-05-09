package com.bridgelabz;

import java.time.LocalDate;

public class Hotel {

    String hotelName;
    int hotelRating;
    int weekdayRateForRegularCustomer;
    int weekendRateForRegularCustomer;
    int weekdayRateForRewardCustomer;
    int weekendRateForRewardCustomer;

    public Hotel() {

    }

    public Hotel(String hotelName, int hotelRating, int weekdayRateForRegularCustomer, int weekendRateForRegularCustomer, int weekdayRateForRewardCustomer, int weekendRateForRewardCustomer) {
        this.hotelName = hotelName;
        this.hotelRating = hotelRating;
        this.weekdayRateForRegularCustomer = weekdayRateForRegularCustomer;
        this.weekendRateForRegularCustomer = weekendRateForRegularCustomer;
        this.weekdayRateForRewardCustomer = weekdayRateForRewardCustomer;
        this.weekendRateForRewardCustomer = weekendRateForRewardCustomer;
    }

    public void findPrice(LocalDate startDate, LocalDate endDate, Boolean customerType) {

    }
}
