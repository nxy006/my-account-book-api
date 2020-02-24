package com.nxy006.project.myaccountbook.bean.service.impl;

import com.nxy006.project.myaccountbook.bean.repository.TagRepository;
import com.nxy006.project.myaccountbook.bean.repository.entity.Tag;
import com.nxy006.project.myaccountbook.bean.service.TagRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.orm.ObjectOptimisticLockingFailureException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Tag 对象管理服务实现类
 * 这个层次用于实现对象管理，包括技术和业务内容，比如可以处理缓存
 *
 * @author nxy006
 * @since 1.0
 */
@Service
public class TagRepositoryServiceImpl implements TagRepositoryService {
    @Autowired
    private TagRepository tagRepository;

    @Override
    public Tag save(Tag tag) {
        return tagRepository.saveAndFlush(tag);
    }

    @Override
    public Tag findByNameAndIsDeletedFalse(String name) {
        return tagRepository.findByNameAndIsDeletedFalse(name);
    }

    @Override
    public Tag update(Tag tag) {
        return tagRepository.saveAndFlush(tag);
    }

    @Override
    public Tag updateAndGet(Tag tag) {
        update(tag);
        return tagRepository.findById(tag.getId());
    }
}
