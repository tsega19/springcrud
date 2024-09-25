package com.crud.todo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Video {

    @GeneratedValue
    @Id
    private Integer Id;
    private String title;

    private String description;

    public Video(String title, String description) {
        this.title = title;
        this.description = description;
    }
    public Video() {
    }

    public void getVideos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getVideos'");
    }

}
