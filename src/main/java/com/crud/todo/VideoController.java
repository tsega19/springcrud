package com.crud.todo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class VideoController {

    @GetMapping("/")    
    public video hello(){
        video videos = new video();
            videos.setTitle("hello");
            videos.setDescription("hello description");
        return videos;
    }
}
