package com.example.demo.controllers;

import com.example.demo.domainmodel.Profile;
import com.example.demo.service.ProfileService;
import com.example.demo.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/profiles")
@RequiredArgsConstructor
@Tag(name = "Profile", description = "Operações de perfil de usuário")
public class ProfileController {

    private final ProfileService profileService;

    @PostMapping("/api/profiles/createprofile")
    public ResponseEntity<Profile> createProfile(@RequestBody Profile profile) {
        return new ResponseEntity<>(this.profileService.createProfile(profile), HttpStatus.CREATED);
    }

    @PatchMapping("/api/profiles/partialupdate/{id}")
    public ResponseEntity<Profile> updateProfile(@RequestBody UUID id, Profile profile) {
        return new ResponseEntity<>(this.profileService.partialUpdateProfile(id,profile), HttpStatus.CREATED);
    }

    @DeleteMapping("/api/profiles/delete/{id}")
    public ResponseEntity<Void> deleteProfile(@PathVariable UUID id) {
        this.profileService.deleteProfileById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/api/profiles")
    @Operation(method = "GET", description = "Listar os todos os profiles")
    public ResponseEntity<List<Profile>> listAllProfiles() {
        return ResponseEntity.ok(this.profileService.findAllProfiles());
    }

    @PutMapping
    public ResponseEntity<Profile> updateProfile(@RequestBody Profile profile) {
        return new ResponseEntity<>(this.profileService.updateProfile(profile),HttpStatus.CREATED);
    }


}