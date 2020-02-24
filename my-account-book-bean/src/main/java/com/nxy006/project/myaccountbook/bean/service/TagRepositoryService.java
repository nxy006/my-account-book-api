package com.nxy006.project.myaccountbook.bean.service;

import com.nxy006.project.myaccountbook.bean.repository.TagRepository;
import com.nxy006.project.myaccountbook.bean.repository.entity.Tag;

/**
 * Tag 对象管理服务
 *
 * @author nxy006
 * @since 1.0
 */
public interface TagRepositoryService {
    Tag save(Tag tag);

    Tag findByNameAndIsDeletedFalse(String name);

    Tag update(Tag tag);

    Tag updateAndGet(Tag tag);
}
