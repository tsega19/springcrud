package com.crud.todo;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class VideoService {

    @Autowired
    VideoRepository videoRepository;
 static List<Video> videos = new ArrayList<>();

   static{
       videos.add(new Video("hello", "hello description"));
       videos.add(new Video("hello2", "hello description2"));
       videos.add(new Video("hello3", "hello description3"));
   }
public List<Video> getVideos() {
    return videoRepository.findAll();
}

    /**
     * Retrieves a video from the list of videos based on the provided title.
     *
     * @param title the title of the video to be retrieved
     * @return the video with the matching title, or null if no match is found
     */
    public Video getVideoByTitle(String title){
        for(Video video : videos){
            if(video.getTitle().equalsIgnoreCase(title)){
                return video;
            }
        }
        return null;
    }

    public boolean addVideo(Video video){
        if (isValid(video)){
            videoRepository.save(video);
            return true;
        }
        return false;
    }
    public  boolean isValid(Video video){

        if (video.getTitle() == null|| video.getDescription()==null){
            return false;
        }
        return  true;
    }
    public List<Video> getAllVideo() {
      return videoRepository.findAll();
    }
}
