package com.spring.spring.controller;


import com.spring.spring.Model.Task;
import com.spring.spring.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doublefish-docs")
public class TaskController {

    @Autowired
    private TaskService service;

    @PostMapping("/videos")
    @ResponseStatus(HttpStatus.CREATED)
    public Task createTask(@RequestBody Task task){
        return service.addTask(task);
    }

    @GetMapping("/videos")
    public List<Task> getTasks() {
        return service.findAllTasks();
    }


    @GetMapping("/videos/{taskId}")
    public Task getTask(@PathVariable String taskId){
        return service.getTaskByTaskId(taskId);
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
    @PutMapping("/video/{id}")
    public Task modifyTask(@RequestBody Task task){
        return service.updateTask(task);
    }
//
    @DeleteMapping("/video/{taskId}")
    public String deleteTask(@PathVariable String taskId){
        return service.deleteTask(taskId);
    }
}
