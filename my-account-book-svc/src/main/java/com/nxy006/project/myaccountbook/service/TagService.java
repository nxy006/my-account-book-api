package com.nxy006.project.myaccountbook.service;

import com.nxy006.project.myaccountbook.bean.repository.entity.Tag;

/**
 * TagService Comment
 *
 * @author nxy006
 * @since 1.0
 */
public interface TagService {
    Tag createOrFind(Tag tag);

    Tag update(Tag tag);
}
