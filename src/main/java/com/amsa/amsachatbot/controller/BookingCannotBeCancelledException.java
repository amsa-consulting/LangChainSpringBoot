package com.amsa.amsachatbot.controller;

public class BookingCannotBeCancelledException extends RuntimeException{
    public BookingCannotBeCancelledException(String bookingNumber) {
        super("Booking " + bookingNumber + " cannot be canceled");
    }
}
