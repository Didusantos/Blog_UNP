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
    public List<Post> findAll() {
        return repository.findAll();
    }

    @Override
    public Post findById(UUID id) {
        return repository.findById(id);
    }

    @Override
    public Post create(Post post) {
        return repository.create(post);
    }

    @Override
    public Post update(Post post) {
        return repository.update(post);
    }

    @Override
    public void deleteById(UUID id) {
        this.repository.deleteById(id);
    }

    @Override
    public Post partialUpdate(Post post) {
        return repository.partialUpdate(post);
    }
}

