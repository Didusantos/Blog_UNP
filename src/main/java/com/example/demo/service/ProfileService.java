package com.example.demo.service;

import com.example.demo.domainmodel.Profile;

import java.util.List;
import java.util.UUID;

public interface ProfileService {

    public List<Profile> findAllProfiles();

    public Profile findProfileById(UUID id);

    public Profile createProfile(Profile profile);

    public Profile updateProfile(Profile profile);

    public void deleteProfileById(UUID id);

    public Profile partialUpdateProfile(UUID id, Profile profile);
}
