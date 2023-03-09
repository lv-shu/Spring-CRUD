package com.spring.spring.service;

import com.spring.spring.Model.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.spring.repositories.VideoRepository;

import java.util.List;
import java.util.UUID;

@Service
public class VideoService {

    @Autowired
    private VideoRepository repository;

    //CRUD  CREATE , READ , UPDATE , DELETE

    public Video addTask(Video video) {
        video.set_id(UUID.randomUUID().toString().split("-")[0]);
        return repository.save(video);
    }

    public List<Video> findAllTasks() {
        return repository.findAll();
    }

//
    public Video getTaskByTaskId(String videoId) {
        return repository.findById(videoId).get();
    }
//
//    public List<Task> getTaskBySeverity(int severity) {
//        return repository.findBySeverity(severity);
//    }
//
//    public List<Task> getTaskByAssignee(String assignee) {
//        return repository.getTasksByAssignee(assignee);
//    }
//
    public Video updateTask(Video videoRequest, String videoId) {
        //get the existing document from DB
        // populate new value from request to existing object/entity/document
        Video existingTask = repository.findById(videoId).get();
        existingTask.setName(videoRequest.getName());
        existingTask.setTags(videoRequest.getTags());
        existingTask.setThumbnail_url(videoRequest.getThumbnail_url());
        existingTask.setVideo_url(videoRequest.getVideo_url());
        existingTask.setView(videoRequest.getView());
        existingTask.setLike(videoRequest.getLike());
        existingTask.setCategory_id(videoRequest.getCategory_id());
        existingTask.setProvider_id(videoRequest.getProvider_id());
        existingTask.setVod_id(videoRequest.getVod_id());
        return repository.save(existingTask);
    }
//
    public String deleteTask(String taskId) {
        repository.deleteById(taskId);
        return taskId + " task deleted from dashboard ";
    }
}