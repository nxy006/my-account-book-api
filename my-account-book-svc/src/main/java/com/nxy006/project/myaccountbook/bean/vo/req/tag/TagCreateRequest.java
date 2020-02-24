package com.nxy006.project.myaccountbook.bean.vo.req.tag;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * TagCreateRequest Comment
 *
 * @author nxy006
 * @since 1.0
 */
@Data
public class TagCreateRequest {
    @NotEmpty(message = "标签名不能为空")
    private String name;

    @NotNull(message = "标签描述不能为空")
    private String description;
}
