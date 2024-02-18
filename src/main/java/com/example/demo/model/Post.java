package com.example.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private Long id;
    private String text;
    private Integer likes;
    private Date creationDate;

    public Post(Long id, String text, Date date) {
        this.id = id;
        this.text = text;
        this.creationDate = date;
        likes = 0;
    }

    public String getText() {
        return this.text;
    }

    public Integer getLikes() {
        return this.likes;
    }
    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public Long getId() {
        return this.id;
    }
}
