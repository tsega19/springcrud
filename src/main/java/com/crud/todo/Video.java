package com.crud.todo;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;

public class Video {
    private String title;

    private String description;

    public Video(String title, String description) {
        this.title = title;
        this.description = description;
       
    }
    // generate getter and setter
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

}
