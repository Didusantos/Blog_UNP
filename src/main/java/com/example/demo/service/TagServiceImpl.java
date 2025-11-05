package com.example.demo.service;

import com.example.demo.domainmodel.Tag;
import com.example.demo.domainmodel.repositories.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class TagServiceImpl implements TagService {

    private final TagRepository tagRepository;

    @Override
    public List<Tag> findAllTags() {
        return tagRepository.findAll();
    }

    @Override
    public List<Tag> findByName(String name) {
        return tagRepository.findByName(name);
    }

    @Override
    public Tag createTag(Tag tag) {
        return tagRepository.save(tag);
    }

    @Override
    public Tag updateTag(Tag tag) {
        return tagRepository.save(tag);
    }

    @Override
    public void deleteTagById(UUID id) {
        tagRepository.deleteById(id);
    }

    @Override
    public Tag partialUpdateTag(Tag tag) {
        return tagRepository.save(tag);
    }
}
