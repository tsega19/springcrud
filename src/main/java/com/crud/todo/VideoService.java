package com.crud.todo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class VideoService {
    
    static List<Video> videos = new ArrayList<>();

    static{
        videos.add(new Video("hello", "hello description"));
        videos.add(new Video("hello2", "hello description2"));
        videos.add(new Video("hello3", "hello description3"));
    }
    public static List<Video> getVideos(){
        return videos;
    }
    /**
     * Retrieves a video from the list of videos based on the provided title.
     *
     * @param title the title of the video to be retrieved
     * @return the video with the matching title, or null if no match is found
     */
    public static Video getVideoByTitle(String title){
        for(Video video : videos){
            if(video.getTitle().equalsIgnoreCase(title)){
                return video;
            }
        }
        return null;
    }

    public static void addVideo(Video video){
        videos.add(video);
    }
    
}
