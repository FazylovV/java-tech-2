package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class PostService {
    private List<Post> posts;
    public PostService() {
        posts = new ArrayList<>();
        posts.add(new Post("В Анапе", new GregorianCalendar(2023, Calendar.AUGUST, 17).getTime()));
        posts.add(new Post("В Сочи",  new GregorianCalendar(2024, Calendar.JANUARY, 29).getTime()));
        posts.add(new Post("В Турции",  new GregorianCalendar(2024, Calendar.FEBRUARY, 3).getTime()));
    }

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }
}
