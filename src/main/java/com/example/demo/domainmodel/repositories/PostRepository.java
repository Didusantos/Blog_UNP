package com.example.demo.domainmodel.repositories;

import com.example.demo.domainmodel.Post;
import com.example.demo.domainmodel.Tag;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public interface PostRepository extends JpaRepository<Post, UUID> {

    public Optional<Post> findById(UUID id);

    public Optional<Post> findByTitle(String users);

    Optional<Post> findByTags(Set<Tag> tags);

    List<Post> findPostByTitle(String title);
}
