package com.nxy006.project.myaccountbook.bean.vo.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

/**
 * BasicEntityUpdateRequest Comment
 *
 * @author nxy006
 * @since 1.0
 */
@Data
@MappedSuperclass
public class BasicEntityUpdateRequest {
    @NotNull(message = "更新版本不能为空")
    @JsonProperty("updated_version")
    private Integer updatedVersion;
}
