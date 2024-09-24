package com.crud.todo;

public class VideoNotFoundException {

    private static String message= "Video not found";

    public VideoNotFoundException(String message) {
        this.message = message;   
    }
    public String geExeptioString() {
        return message;
    }
}
