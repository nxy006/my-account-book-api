package com.nxy006.project.myaccountbook.bean.vo.resp.tag;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.nxy006.project.myaccountbook.bean.repository.entity.Tag;
import com.nxy006.project.myaccountbook.bean.vo.base.BasicEntityResponseData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TagCreateResponseData Comment
 *
 * @author nxy006
 * @since 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({"id", "name", "description", "updated_version", "created_at", "updated_at"})
public class TagCommonResponseData extends BasicEntityResponseData {
    private String name;
    private String description;

    public TagCommonResponseData(Tag tag) {
        super(tag);
        this.name = tag.getName();
        this.description = tag.getDescription();
    }

    public static TagCommonResponseData covertWith(Tag tag) {
        return new TagCommonResponseData(tag);
    }
}
