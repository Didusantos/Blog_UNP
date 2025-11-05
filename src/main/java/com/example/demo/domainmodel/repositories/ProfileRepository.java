package com.example.demo.domainmodel.repositories;

import com.example.demo.domainmodel.Post;
import com.example.demo.domainmodel.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProfileRepository extends JpaRepository<Profile, UUID> {

    public Optional<Profile> findById(UUID id);

    public List<Profile> findByBio(String bio);

}
