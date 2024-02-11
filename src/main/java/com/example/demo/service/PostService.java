package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class PostService {
    private List<Post> posts;
    public PostService() {
        posts = new ArrayList<>();
        posts.add(new Post("Первый пост", 10));
        posts.add(new Post("Второй пост",  2));
        posts.add(new Post("Третий пост",  1153));
    }

    public List<Post> listAllPosts() {
        return posts;
    }
}
