package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class PostService {
    private final List<Post> posts = new ArrayList<>();
    public PostService() {
        posts.add(new Post((long) 0, "В Анапе", new GregorianCalendar(2023, Calendar.AUGUST, 17).getTime()));
        posts.add(new Post((long) 1, "В Сочи",  new GregorianCalendar(2024, Calendar.JANUARY, 29).getTime()));
        posts.add(new Post((long) 2, "В Турции",  new GregorianCalendar(2024, Calendar.FEBRUARY, 3).getTime()));
    }

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post((long) posts.size(), text, new Date()));
    }
}
