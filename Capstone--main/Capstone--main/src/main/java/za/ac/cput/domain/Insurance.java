/*
Insurance.java
Insurance entity class
Author: Thandeka Malande (222857005)
Date: 18 March 2026
*/

package za.ac.cput.domain;

public class Insurance {

    private String insuranceID;
    private String bookingID;
    private String type;
    private double dailyPremium;

    // Private constructor
    private Insurance(Builder builder) {
        this.insuranceID = builder.insuranceID;
        this.bookingID = builder.bookingID;
        this.type = builder.type;
        this.dailyPremium = builder.dailyPremium;
    }

    public String getInsuranceID() {
        return insuranceID;
    }

    public String getBookingID() {
        return bookingID;
    }

    public String getType() {
        return type;
    }

    public double getDailyPremium() {
        return dailyPremium;
    }

    // Method
    public double calculatePremiumTotal(int days) {
        return dailyPremium * days;
    }

    // Builder Pattern
    public static class Builder {
        private String insuranceID;
        private String bookingID;
        private String type;
        private double dailyPremium;

        public Builder setInsuranceID(String insuranceID) {
            this.insuranceID = insuranceID;
            return this;
        }

        public Builder setBookingID(String bookingID) {
            this.bookingID = bookingID;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setDailyPremium(double dailyPremium) {
            this.dailyPremium = dailyPremium;
            return this;
        }

        public Insurance build() {
            return new Insurance(this);
        }
    }
}