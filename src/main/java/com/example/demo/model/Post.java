package com.example.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;

    public Post(String text, Date date) {
        this.text = text;
        this.creationDate = date;
    }

    public String getText() {
        return this.text;
    }

    public Integer getLikes() {
        return this.likes;
    }

    public Date getCreationDate() {
        return this.creationDate;
    }
}
