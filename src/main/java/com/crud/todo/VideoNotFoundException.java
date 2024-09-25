package com.crud.todo;

public class VideoNotFoundException extends Throwable {

    private static String message= "Video not found";

    public VideoNotFoundException(String message) {

        VideoNotFoundException.message = message;
    }

    public void geExceptionString() {

    }
}
