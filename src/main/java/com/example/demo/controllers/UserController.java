package com.example.demo.controllers;

import com.example.demo.domainmodel.User;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(this.userService.findAll());
    }

    // http://localhost:8080/users/{id}
    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable UUID id) {
        return ResponseEntity.ok(this.userService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserById(@PathVariable UUID id) {
        this.userService.deleteById(id);
        return ResponseEntity.notFound().build();
    }

    @PostMapping()
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return new ResponseEntity<>(this.userService.create(user), HttpStatus.CREATED);
    }

    @PutMapping()
    public ResponseEntity<User> update(@RequestBody User user) {
        return new ResponseEntity<>(this.userService.create(user), HttpStatus.CREATED);
    }

    @PatchMapping
    public ResponseEntity<User> patchUser(@RequestBody User user) {
        return new ResponseEntity<>(this.userService.partialUpdate(user), HttpStatus.CREATED);
    }

}
