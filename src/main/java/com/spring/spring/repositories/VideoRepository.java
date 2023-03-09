package com.spring.spring.repositories;

import com.spring.spring.Model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VideoRepository extends MongoRepository<Task,String> {

//    List<Task> findBySeverity(int severity);
//
//    @Query("{ assignee: ?0 }")
//    List<Task> getTasksByAssignee(String assignee);
}

