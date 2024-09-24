package com.crud.todo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class VideoController {

    @Autowired
    VideoService vService;

    @GetMapping("/video")    
    public List<Video> getVideo(){
      return VideoService.getVideos();
    }
    @GetMapping("/videos/title")
    public ResponseEntity<List<Video>> getVideoTitle(@RequestParam (required = false) String title){
       List<Video> v = new ArrayList<>();   
       Video video = VideoService.getVideoByTitle(title);
        if (video != null) {
            v.add(video);
        } 
        if(v.isEmpty()){
          VideoNotFoundException vException = new VideoNotFoundException(title);
          vException.geExeptioString();
        }
        return ResponseEntity.ok(v);
        
    }
       
    @RequestMapping("videoPost")
    public void addVideo(@RequestBody Video video){
        VideoService.addVideo(video);
    }
}


