package com.example.demo.domainmodel.repositories;

import com.example.demo.domainmodel.Post;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

import java.util.Optional;
import java.util.UUID;

public interface PostRepository extends JpaRepository<Post, UUID> {

    public Optional<Post> findById(UUID id);

    public Optional<Post>  findByUsers(String users);

    public Optional<Post>  findByTags(String tags);


}
