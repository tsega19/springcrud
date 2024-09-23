package com.crud.todo;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;

public class video {
    private String title;
    @JsonIncludeProperties
    private String description;

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
