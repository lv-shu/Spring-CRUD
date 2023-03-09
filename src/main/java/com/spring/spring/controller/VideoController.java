package com.spring.spring.controller;


import com.spring.spring.Model.Video;
import com.spring.spring.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/videos")
public class VideoController {

    @Autowired
    private VideoService service;

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Video createTask(@RequestBody Video video){
        return service.addTask(video);
    }

    @GetMapping("/")
    public List<Video> getTasks() {
        return service.findAllTasks();
    }


    @GetMapping("{videoId}")
    public Video getTask(@PathVariable String videoId){
        return service.getTaskByTaskId(videoId);
    }
//
//    @GetMapping("/severity/{severity}")
//    public List<Task> findTaskUsingSeverity(@PathVariable int severity){
//        return service.getTaskBySeverity(severity);
//    }
//
//    @GetMapping("/assignee/{assignee}")
//    public List<Task> getTaskByAssignee(@PathVariable String assignee){
//        return service.getTaskByAssignee(assignee);
//    }
//
    @PutMapping("/{videoId}")
    public Video modifyTask(@RequestBody Video video,@PathVariable String videoId ){
        return service.updateTask(video, videoId);
    }
//
    @DeleteMapping("/{videoId}")
    public String deleteTask(@PathVariable String videoId){
        return service.deleteTask(videoId);
    }
}
