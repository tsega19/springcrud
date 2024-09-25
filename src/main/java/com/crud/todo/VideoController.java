package com.crud.todo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class VideoController {




    @Autowired
    VideoService vService;

    // @GetMapping("all/video")
    // public List<Video> gVideos()
    // {
    //   return vService.getAllVideo();
    // }

    @GetMapping("/video/title")
    public ResponseEntity<List<Video>> getVideoTitle(@RequestParam(required = false) String title) throws VideoNotFoundException {
      if(title == null){
        return new ResponseEntity<>(vService.getAllVideo(), HttpStatus.OK);
      }
      List<Video> fVideos = new ArrayList<>();
      Video video = vService.getVideoByTitle(title);
      fVideos.add(video);
      if (fVideos.isEmpty()) {
        throw new VideoNotFoundException(title);
      }
      return new ResponseEntity<>(fVideos, HttpStatus.OK);
    }


    @PostMapping("/videoPost")
    public ResponseEntity<String> addVideo(@RequestBody Video video){
       boolean hasadd = vService.addVideo(video);
        if(hasadd){
           return ResponseEntity.ok().build();
       }
        return ResponseEntity.badRequest().build();
    }
}


