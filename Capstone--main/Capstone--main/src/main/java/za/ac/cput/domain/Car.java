package za.ac.cput.domain;

public class Car {

    private String carID;
    private String make;
    private String model;
    private int year;
    private double dailyRate;
    private String status;
    private int mileage;

    //Constructor
    private Car(Builder builder){
        this.carID = builder.carID;
        this.make = builder.make;
        this.model = builder.model;
        this.year = builder.year;
        this.dailyRate = builder.dailyRate;
        this.status = builder.status;
        this.mileage = builder.mileage;
    }

    //Getters

    public String getCarID() {
        return carID;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear(){
        return year;
    }
    public double getDailyRate() {
        return dailyRate;
    }
    public String getStatus() {
        return status;
    }
    public int getMileage() {
        return mileage;
    }

    //Methods
    public void markMaintenance(){
        this.status = "In Service";
    }
    public void updateMileage(int mileage) {
        this.mileage = mileage;
    }

    //Builder Class
    public static class Builder{
        private String carID;
        private String make;
        private String model;
        private int year;
        private double dailyRate;
        private String status;
        private int mileage;

        public Builder setCarID(String carID){
            this.carID = carID;
            return this;
        }

        public Builder setMake(String make){
            this.make = make;
            return this;
        }

        public Builder setModel(String model){
            this.model = model;
            return this;
        }

        public Builder setYear(int year){
            this.year = year;
            return this;
        }

        public Builder setDailyRate(double dailyRate){
            this.dailyRate = dailyRate;
            return this;
        }

        public Builder setStatus(String status){
            this.status = status;
            return this;
        }

        public Builder setMileage(int mileage){
            this.mileage = mileage;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }
}
