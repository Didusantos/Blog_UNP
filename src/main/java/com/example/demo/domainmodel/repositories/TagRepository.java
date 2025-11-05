package com.example.demo.domainmodel.repositories;

import com.example.demo.domainmodel.Tag;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TagRepository extends JpaRepository<Tag, UUID> {

    Optional<Tag> findByid(String id);

    public List<Tag> findByName(String name);


}
