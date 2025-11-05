package com.example.demo.controllers;

import com.example.demo.domainmodel.Post;
import com.example.demo.service.PostService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.http.parser.HttpParser;
import org.aspectj.lang.annotation.DeclareError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/posts")
@RequiredArgsConstructor
@Tag(name = "Post", description = "Operações de posts")
public class PostController {

    private final PostService postService;

    @GetMapping("api/posts/{id}")
    @Operation(method = "GET", description = "Listar todos os posts")
    public ResponseEntity<List<Post>> findAllPosts() {
        return ResponseEntity.ok(this.postService.findAllPosts());
    }

    @GetMapping()
    public ResponseEntity<Post> findPostById(@PathVariable UUID id) {
        return ResponseEntity.ok(this.postService.findPostById(id));
    }

    @PutMapping()
    public ResponseEntity<Post> updatePost(@RequestBody UUID id, Post post) {
        return new ResponseEntity<>(this.postService.updatePost(id, post),HttpStatus.CREATED);
    }

    @PostMapping()
    public ResponseEntity<Post> createPost(@RequestBody Post post) {
        return new ResponseEntity<>(this.postService.createPost(post), HttpStatus.CREATED);
    }

    @PatchMapping()
    public ResponseEntity<Post> partialUpdate(@RequestBody UUID id, Post post) {
        return new ResponseEntity<>(this.postService.partialUpdatePost(id, post), HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<Post> deletePostById(@PathVariable UUID id) {
        this.postService.deletePostById(id);
        return ResponseEntity.ok().build();
    }
}
