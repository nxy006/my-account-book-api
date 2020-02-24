package com.nxy006.project.myaccountbook.bean.vo.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nxy006.project.myaccountbook.bean.common.BasicEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * BasicEntityResponseData Comment
 *
 * @author nxy006
 * @since 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BasicEntityResponseData {
    private Long id;
    @JsonProperty(value = "updated_version")
    private Integer updatedVersion;
    @JsonProperty(value = "created_at")
    private Long createdAt;
    @JsonProperty(value = "updated_at")
    private Long updatedAt;

    public BasicEntityResponseData(BasicEntity basicEntity) {
        this.id = basicEntity.getId();
        this.updatedVersion = basicEntity.getUpdatedVersion();
        this.createdAt = basicEntity.getCreatedAt().getTime();
        this.updatedAt = basicEntity.getUpdatedAt().getTime();
    }
}
