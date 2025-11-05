package com.example.demo.controllers;

import com.example.demo.service.TagService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/tags")
@RequiredArgsConstructor
@Tag(name = "Tag", description = "Operações de tags de posts")
public class TagController {

    private final TagService tagService;

    @GetMapping()
    public ResponseEntity<List<com.example.demo.domainmodel.Tag>> findAllTags() {
        return ResponseEntity.ok(this.tagService.findAllTags());
    }

    @GetMapping("/searchrolename")
    public ResponseEntity<List<com.example.demo.domainmodel.Tag>> findByName(@PathVariable String name) {
        this.tagService.findByName(name);
        return ResponseEntity.ok(this.tagService.findAllTags());
    }

    @DeleteMapping
    public ResponseEntity<List<com.example.demo.domainmodel.Tag>> deleteAllTags(@PathVariable UUID id) {
        this.tagService.deleteTagById(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<com.example.demo.domainmodel.Tag> createTag(@RequestBody com.example.demo.domainmodel.Tag tag){
        return new ResponseEntity<>(this.tagService.createTag(tag), HttpStatus.CREATED);
    }

    @PatchMapping
    public ResponseEntity<com.example.demo.domainmodel.Tag> updateTag(@RequestBody com.example.demo.domainmodel.Tag tag){
        return new ResponseEntity<>(this.tagService.updateTag(tag), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<com.example.demo.domainmodel.Tag> putTag(@RequestBody com.example.demo.domainmodel.Tag tag){
        return new ResponseEntity<>(this.tagService.partialUpdateTag(tag), HttpStatus.CREATED);
    }



}
