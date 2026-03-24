package za.ac.cput.domain;

import java.time.LocalDate;

public class Payment {

    private String paymentID;
    private String bookingID;
    private double amount;
    private LocalDate paymentDate;
    private String method;

    // Private constructor (Builder Pattern)
    private Payment(Builder builder) {
        this.paymentID = builder.paymentID;
        this.bookingID = builder.bookingID;
        this.amount = builder.amount;
        this.paymentDate = builder.paymentDate;
        this.method = builder.method;
    }

    // Getters
    public String getPaymentID() {
        return paymentID;
    }

    public String getBookingID() {
        return bookingID;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public String getMethod() {
        return method;
    }

    // Business Methods
    public String processRefund() {
        return "Refund processed for payment ID: " + paymentID;
    }

    public String generateInvoice() {
        return "Invoice generated for payment ID: " + paymentID + ", Amount: " + amount;
    }

    // Builder Class
    public static class Builder {
        private String paymentID;
        private String bookingID;
        private double amount;
        private LocalDate paymentDate;
        private String method;

        public Builder setPaymentID(String paymentID) {
            this.paymentID = paymentID;
            return this;
        }

        public Builder setBookingID(String bookingID) {
            this.bookingID = bookingID;
            return this;
        }

        public Builder setAmount(double amount) {
            this.amount = amount;
            return this;
        }

        public Builder setPaymentDate(LocalDate paymentDate) {
            this.paymentDate = paymentDate;
            return this;
        }

        public Builder setMethod(String method) {
            this.method = method;
            return this;
        }

        public Payment build() {
            return new Payment(this);
        }
    }
}