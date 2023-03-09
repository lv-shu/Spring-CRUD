package com.spring.spring.repositories;

import com.spring.spring.Model.Video;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VideoRepository extends MongoRepository<Video,String> {

//    List<Task> findBySeverity(int severity);
//
//    @Query("{ assignee: ?0 }")
//    List<Task> getTasksByAssignee(String assignee);
}

