package com.nxy006.project.myaccountbook.service.impl;

import com.nxy006.project.myaccountbook.bean.repository.entity.Tag;
import com.nxy006.project.myaccountbook.bean.service.TagRepositoryService;
import com.nxy006.project.myaccountbook.exception.SystemRuntimeException;
import com.nxy006.project.myaccountbook.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ObjectOptimisticLockingFailureException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * TagServiceImpl Comment
 *
 * @author nxy006
 * @since 1.0
 */
@Service
public class TagServiceImpl implements TagService {
    @Autowired
    private TagRepositoryService tagRepositoryService;

    @Override
    @Transactional
    public Tag createOrFind(Tag tag) {
        Tag savedTag = tagRepositoryService.findByNameAndIsDeletedFalse(tag.getName());

        if (savedTag != null) {
            System.out.println("savedTag: " + savedTag.toString());
            return savedTag;
        }
        return tagRepositoryService.save(tag);
    }

    @Override
    @Transactional
    public Tag update(Tag tag) {
        try {
            Tag savedTag = tagRepositoryService.updateAndGet(tag);
            if (savedTag != null) {
                System.out.println("savedTag: " + savedTag.toString());
                return savedTag;
            }
        } catch (ObjectOptimisticLockingFailureException exception) {
            throw SystemRuntimeException.EntityOptimisticLockingFailure;
        }
        return null;
    }
}
