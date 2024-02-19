package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Post implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String text;
    private Integer likes;
    private Date creationDate;

    public Post(final Long id, final String text, final Date date) {
        this.text = text;
        this.creationDate = date;
        likes = 0;
    }

    public Post() {

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
