package com.nxy006.project.myaccountbook.bean.repository;

import com.nxy006.project.myaccountbook.bean.repository.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.Repository;

/**
 * TagRepository Comment
 *
 * @author nxy006
 * @since 1.0
 */
public interface TagRepository extends JpaRepository<Tag, Integer>, JpaSpecificationExecutor<Tag> {
    Tag saveAndFlush(Tag tag);

    Tag findById(Long id);

    Tag findByNameAndIsDeletedFalse(String name);
}
