package com.example.demo.controllers;

import com.example.demo.domainmodel.Post;
import com.example.demo.service.PostService;
import com.example.demo.service.PostServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
@Tag(name = "Posts", description = "Operações de posts")
public class PostController {

    private final PostService postService;

    @GetMapping
    @Operation(method = "GET", description = "Listar todos os posts")
    public ResponseEntity<List<Post>> findAll () {
        return ResponseEntity.ok(this.postService.findAll());
    }

    @GetMapping
    public ResponseEntity<Post> findById (UUID id) {
        return ResponseEntity.ok(this.postService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Post> createPost (Post post) {
        return new ResponseEntity<>(this.postService.create(post),HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Post> updatePost (UUID id, Post post) {
        return new ResponseEntity<>(this.postService.update(post), HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<Void> deletePost (UUID id) {
        this.postService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping
    public ResponseEntity<Post> partialUpdate(Post post) {
        return new ResponseEntity<>(this.postService.partialUpdate(post), HttpStatus.CREATED);
    }


}
