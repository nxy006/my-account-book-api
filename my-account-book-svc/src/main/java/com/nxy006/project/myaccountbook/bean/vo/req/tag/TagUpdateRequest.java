package com.nxy006.project.myaccountbook.bean.vo.req.tag;

import com.nxy006.project.myaccountbook.bean.vo.base.BasicEntityUpdateRequest;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * TagUpdateRequest Comment
 *
 * @author nxy006
 * @since 1.0
 */
@Data
public class TagUpdateRequest extends BasicEntityUpdateRequest {
    @NotEmpty(message = "标签名不能为空")
    private String name;

    @NotNull(message = "标签描述不能为空")
    private String description;
}
