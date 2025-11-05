package com.example.demo.service;

import com.example.demo.domainmodel.Post;

import java.util.List;
import java.util.UUID;

public interface PostService {

    public List<Post> findAllPosts();

    public Post findPostById(UUID id);

    public List<Post> findPostByTitle(String title);

    public Post createPost(Post post);

    public Post updatePost(UUID id, Post post);

    public void deletePostById(UUID id);

    public Post partialUpdatePost(UUID id, Post post);

}
