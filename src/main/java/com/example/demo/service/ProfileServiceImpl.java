package com.example.demo.service;

import com.example.demo.domainmodel.Profile;
import com.example.demo.domainmodel.repositories.ProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class ProfileServiceImpl implements ProfileService {

    private final ProfileRepository profileRepository;


    @Override
    public List<Profile> findAllProfiles() {
        return profileRepository.findAll();
    }

    @Override
    public Profile findProfileById(UUID id) {
        return profileRepository.findById(id).orElse(null);
    }

    @Override
    public Profile createProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    @Override
    public Profile updateProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    @Override
    public void deleteProfileById(UUID id) {
        profileRepository.deleteById(id);
    }

    @Override
    public Profile partialUpdateProfile(UUID id, Profile profile) {
        return profileRepository.save(profile);
    }
}
