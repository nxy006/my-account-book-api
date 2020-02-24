package com.nxy006.project.myaccountbook.bean.repository.entity;

import com.nxy006.project.myaccountbook.bean.common.BasicEntity;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * Tag 标签实体类
 *
 * @author nxy006
 * @since 1.0
 */

@Data
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_tags")
@EntityListeners(AuditingEntityListener.class)
public class Tag extends BasicEntity{

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @Builder
    private Tag(Long id, Integer updatedVersion, Boolean isDeleted, Date createdAt, Date updatedAt, String name, String description) {
        super(id, updatedVersion, isDeleted, createdAt, updatedAt);
        this.name = name;
        this.description = description;
    }
}
