package com.example.demo.service;

import com.example.demo.domainmodel.Post;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostService repository;

    @Override
    public List<Post> findAllPosts() {
        return this.repository.findAllPosts();
    }

    @Override
    public Post findPostById(UUID id) {
        return this.repository.findPostById(id);
    }

    @Override
    public List<Post> findPostByTitle(String title) {
        return this.repository.findPostByTitle(title);
    }

    @Override
    public Post createPost(Post post) {
        return this.repository.createPost(post);
    }

    @Override
    public Post updatePost(UUID id, Post post) {
        return this.repository.updatePost(id, post);
    }

    @Override
    public void deletePostById(UUID id) {
        this.repository.deletePostById(id);
    }

    @Override
    public Post partialUpdatePost(UUID id, Post post) {
        return this.repository.partialUpdatePost(id, post);
    }
}

