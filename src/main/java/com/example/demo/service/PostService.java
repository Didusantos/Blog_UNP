package com.example.demo.service;

import com.example.demo.domainmodel.Post;

import java.util.List;
import java.util.UUID;

public interface PostService {

    public List<Post> findAll();

    public Post findById(UUID id);

    public Post create(Post post);

    public Post update(Post post);

    public void deleteById(UUID id);

    public Post partialUpdate(Post post);
}
