/*Booking.java
Booking model class
Author: Tanatswa Mabhodha(220637482)
Date: 23 March 2026
 */

package za.ac.cput.domain;

public class Booking {
    private String bookingID;
    private String memberID;
    private String carID;
    private String startDate;
    private String endDate;
    private double totalCost;

    private Booking(){

    }
    //builder Constructor
    private Booking(Booking.Builder builder){
        this.bookingID = builder.bookingID;
        this.memberID = builder.memberID;
        this.carID = builder.carID;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.totalCost = builder.totalCost;
    }


    public String getBookingID() {
        return bookingID;
    }

    public String getCarID() {
        return carID;
    }

    public String getMemberID() {
        return memberID;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public double getTotalCost() {
        return totalCost;
    }

    //METHODS TO USE
    public int calculateRentalDuration(){
        return 1;
    }

    public void extendRental(String newEndDate) {
        this.endDate = newEndDate;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingID='" + bookingID + '\'' +
                ", memberID='" + memberID + '\'' +
                ", carID='" + carID + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", totalCost=" + totalCost +
                '}';
    }

    public static class Builder{
        private String bookingID;
        private String memberID;
        private String carID;
        private String startDate;
        private String endDate;
        private double totalCost;

        public Builder setBookingID(String bookingID){
            this.bookingID = bookingID;
            return this;
        }

        public Builder setMemberID(String memberID){
            this.memberID = memberID;
            return this;
        }

        public Builder setCarID(String carID){
            this.carID = carID;
            return this;
        }

        public Builder setStartDate(String startDate){
            this.startDate = startDate;
            return this;
        }

        public Builder setEndDate(String endDate){
            this.endDate = endDate;
            return this;
        }

        public Builder setTotalCost(double totalCost){
            this.totalCost = totalCost;
            return this;
        }

        public Booking build() {
            return new Booking(this);
        }

    }

}


