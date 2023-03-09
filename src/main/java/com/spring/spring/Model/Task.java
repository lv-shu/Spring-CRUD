package com.spring.spring.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "videos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    @Id
    private String _id;
    private String provider_id;
    private String vod_id;
    private String category_id;
    private int like;
    private String name;
    private String tags;
    private String thumbnail_url;
    private String video_url;
    private int view;
}
