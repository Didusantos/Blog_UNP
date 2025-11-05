package com.example.demo.service;


import com.example.demo.domainmodel.Tag;

import java.util.List;
import java.util.UUID;

public interface TagService {

    public List<Tag> findAllTags();

    public List<Tag> findByName(String name);

    public Tag createTag(Tag tag);

    public Tag updateTag(Tag tag);

    public void deleteTagById(UUID id);

    public Tag partialUpdateTag(Tag tag);

}
