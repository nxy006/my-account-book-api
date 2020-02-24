package com.nxy006.project.myaccountbook.controller;

import com.nxy006.project.myaccountbook.bean.repository.entity.Tag;
import com.nxy006.project.myaccountbook.bean.vo.base.BasicResponse;
import com.nxy006.project.myaccountbook.bean.vo.req.tag.TagCreateRequest;
import com.nxy006.project.myaccountbook.bean.vo.req.tag.TagUpdateRequest;
import com.nxy006.project.myaccountbook.bean.vo.resp.tag.TagCommonResponseData;
import com.nxy006.project.myaccountbook.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * TagController Comment
 *
 * @author nxy006
 * @since 1.0
 */
@RestController
@RequestMapping(value="/tags")
public class TagController {
    @Autowired
    private TagService tagService;

    @PostMapping("/create")
    public BasicResponse create(@RequestBody @Valid TagCreateRequest tagCreateRequest) {
        Tag tag = tagService.createOrFind(new Tag(tagCreateRequest.getName(), tagCreateRequest.getDescription()));

        BasicResponse response = BasicResponse.SUCCESS_RSP;
        response.setData(TagCommonResponseData.covertWith(tag));
        return response;
    }

    @PatchMapping("/{id}")
    public BasicResponse update(@PathVariable(name = "id") Long id, @RequestBody @Valid TagUpdateRequest tagUpdateRequest) {
        Tag tag = tagService.update(Tag.builder()
                .id(id)
                .name(tagUpdateRequest.getName())
                .description(tagUpdateRequest.getDescription())
                .updatedVersion(tagUpdateRequest.getUpdatedVersion()).build()
        );

        BasicResponse response = BasicResponse.SUCCESS_RSP;
        response.setData(TagCommonResponseData.covertWith(tag));
        return response;
    }
}
