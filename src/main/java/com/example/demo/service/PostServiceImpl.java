package com.example.demo.service;

import com.example.demo.domainmodel.Post;

import com.example.demo.domainmodel.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Override
    public List<Post> findAllPosts() {
        return this.postRepository.findAll();
    }

    @Override
    public Post findPostById(UUID id) {
        return this.postRepository.findById(id).orElse(null);
    }

    @Override
    public List<Post> findPostByTitle(String title) {
        return this.postRepository.findPostByTitle(title);
    }

    @Override
    public Post createPost(Post post) {
        return this.postRepository.save(post);
    }

    @Override
    public Post updatePost(UUID id, Post post) {
        return this.postRepository.save(post);
    }

    @Override
    public void deletePostById(UUID id) {
        this.postRepository.deleteById(id);
    }

    @Override
    public Post partialUpdatePost(UUID id, Post post) {
        return this.postRepository.save(post);
    }
}

